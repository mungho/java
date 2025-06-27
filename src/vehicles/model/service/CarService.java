package vehicles.model.service;

import vehicles.model.entity.Vehicle;
import vehicles.model.repository.CarRepository;
import vehicles.model.repository.IVehicleRepository;

import java.util.List;

public class CarService implements IVehicleService{
    final String CARPATH = "src/vehicles/model/repository/vehicle_file/car.csv";
    IVehicleRepository vehicleRepository = new CarRepository();

    @Override
    public boolean addVehicle(Vehicle vehicle) {
        return vehicleRepository.addVehicle(vehicle, CARPATH, true);
    }

    @Override
    public List<Vehicle> displayVehicle() {
        return vehicleRepository.displayVehicle(CARPATH);
    }

    @Override
    public boolean deleteVehicle(String vehicleId, boolean isConfirmed) {
        return vehicleRepository.deleteVehicle(vehicleId, isConfirmed, CARPATH);
    }


    public boolean isVehicleExist (String vehicleid) {
        List<Vehicle> vehicles = vehicleRepository.displayVehicle(CARPATH);
        return vehicleRepository.isVehicleExist(vehicleid, vehicles);
    }
}
