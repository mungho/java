package vehicles.model.service;

import vehicles.model.entity.Vehicle;
import vehicles.model.repository.IVehicleRepository;
import vehicles.model.repository.TruckRepository;

import java.util.List;

public class TruckService implements IVehicleService{
    final String TRUCKPATH = "src/vehicles/model/repository/vehicle_file/truck.csv";
    IVehicleRepository vehicleRepository = new TruckRepository();

    @Override
    public boolean addVehicle(Vehicle vehicle) {
        return vehicleRepository.addVehicle(vehicle, TRUCKPATH, true);
    }

    @Override
    public List<Vehicle> displayVehicle() {
        return vehicleRepository.displayVehicle(TRUCKPATH);
    }

    @Override
    public boolean deleteVehicle(String vehicleId, boolean isConfirmed) {
        return vehicleRepository.deleteVehicle(vehicleId, isConfirmed, TRUCKPATH);
    }


    public boolean isVehicleExist (String vehicleid) {
        List<Vehicle> vehicles = vehicleRepository.displayVehicle(TRUCKPATH);
        return vehicleRepository.isVehicleExist(vehicleid, vehicles);
    }
}
