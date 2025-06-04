package vehicle_management.model.service;

import vehicle_management.model.entity.Vehicle;
import vehicle_management.model.repository.VehicleRepository;

public class VehicleService {
    public VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public String addNewVehicle(Vehicle vehicle, int type) {
        return vehicleRepository.addnewVehicle(vehicle, type);
    }

    public Vehicle[] displayVehicles(int type) {
        return vehicleRepository.displayVehicles(type);
    }

    public boolean checkVehicle(String vehicleId) {
        return vehicleRepository.checkVehicle(vehicleId);
    }

    public boolean deleteVehicle(String vehicleId, int confirmed) {
        return vehicleRepository.deleteVehicle(vehicleId, confirmed);
    }
}
