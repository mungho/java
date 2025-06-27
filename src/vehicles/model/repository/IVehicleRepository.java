package vehicles.model.repository;

import vehicles.model.entity.Vehicle;

import java.util.List;

public interface IVehicleRepository {
    boolean addVehicle(Vehicle vehicle, String path, boolean isAppend);
    List<Vehicle> displayVehicle(String path);
    boolean deleteVehicle(String vehicleId, boolean isConfirmed, String path);
    int findVehicle(String vehicleid, List<Vehicle> vehicles);
    boolean isVehicleExist(String vehicleID, List<Vehicle> vehicles);
}
