package vehicles.controller;

import vehicles.model.entity.Vehicle;
import vehicles.model.service.IVehicleService;
import vehicles.model.service.MotobikeService;

import java.util.List;

public class MotobikeController implements IVehicleController{
    IVehicleService vehicleService = new MotobikeService();
    @Override
    public boolean addVehicle(Vehicle vehicle) {
        return vehicleService.addVehicle(vehicle);
    }

    @Override
    public List<Vehicle> displayVehicle() {
        return vehicleService.displayVehicle();
    }

    @Override
    public boolean deleteVehicle(String vehicleId, boolean isConfirmed) {
        return vehicleService.deleteVehicle(vehicleId,isConfirmed);
    }

    public boolean isVehicleExist (String vehicleID) {
        return vehicleService.isVehicleExist(vehicleID);
    }
}
