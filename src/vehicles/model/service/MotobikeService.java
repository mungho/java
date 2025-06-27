package vehicles.model.service;

import vehicles.model.entity.Vehicle;
import vehicles.model.repository.IVehicleRepository;
import vehicles.model.repository.MotobikeRepository;

import java.util.List;

public class MotobikeService implements IVehicleService{
    final String MOTOBIKEPATH = "src/vehicles/model/repository/vehicle_file/motobike.csv";
    IVehicleRepository vehicleRepository = new MotobikeRepository();

    @Override
    public boolean addVehicle(Vehicle vehicle) {
        return vehicleRepository.addVehicle(vehicle, MOTOBIKEPATH, true);
    }

    @Override
    public List<Vehicle> displayVehicle() {
        return vehicleRepository.displayVehicle(MOTOBIKEPATH);
    }


    @Override
    public boolean deleteVehicle(String vehicleId, boolean isConfirmed) {
        return vehicleRepository.deleteVehicle(vehicleId, isConfirmed, MOTOBIKEPATH);
    }


    public boolean isVehicleExist (String vehicleid) {
        List<Vehicle> vehicles = vehicleRepository.displayVehicle(MOTOBIKEPATH);
        return vehicleRepository.isVehicleExist(vehicleid, vehicles);
    }
}
