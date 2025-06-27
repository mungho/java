package vehicles.controller;


import vehicles.model.entity.Vehicle;

import java.util.List;

public interface IVehicleController {
    public boolean addVehicle(Vehicle vehicle);
    public List<Vehicle> displayVehicle();
    public boolean deleteVehicle(String vehicleId, boolean isConfirmed);
}
