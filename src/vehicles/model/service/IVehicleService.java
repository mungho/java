package vehicles.model.service;

import vehicles.model.entity.Vehicle;

import java.util.List;

public interface IVehicleService {
    public boolean addVehicle(Vehicle vehicle);
    public List<Vehicle> displayVehicle();
    public boolean deleteVehicle(String vehicleId, boolean isConfirmed);
    boolean isVehicleExist(String vehicleID);
}
