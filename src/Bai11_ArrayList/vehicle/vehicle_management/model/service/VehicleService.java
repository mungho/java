package Bai11_ArrayList.vehicle.vehicle_management.model.service;

import Bai11_ArrayList.vehicle.vehicle_management.model.entity.Vehicle;
import Bai11_ArrayList.vehicle.vehicle_management.model.repository.VehicleRepository;

import java.util.List;

public class VehicleService {
    public VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public String addNewVehicle(Vehicle vehicle, int type) {
        return vehicleRepository.addnewVehicle(vehicle, type);
    }

    public List<Vehicle> displayVehicles(int type) {
        return vehicleRepository.displayVehicles(type);
    }

    public boolean checkVehicle(String vehicleId) {
        return vehicleRepository.checkVehicle(vehicleId);
    }

    public boolean deleteVehicle(String vehicleId, int confirmed) {
        return vehicleRepository.deleteVehicle(vehicleId, confirmed);
    }
}
