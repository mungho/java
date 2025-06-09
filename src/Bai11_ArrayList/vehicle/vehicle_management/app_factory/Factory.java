package Bai11_ArrayList.vehicle.vehicle_management.app_factory;

import Bai11_ArrayList.vehicle.vehicle_management.model.repository.VehicleRepository;
import Bai11_ArrayList.vehicle.vehicle_management.model.service.VehicleService;
import Bai11_ArrayList.vehicle.vehicle_management.view.VehicleView;

import java.util.Scanner;

public class Factory {

    public static VehicleView createVehicleView() {
        VehicleRepository vehicleRepository = new VehicleRepository();
        VehicleService vehicleService = new VehicleService(vehicleRepository);
        Scanner scanner = new Scanner(System.in);
        return new VehicleView(scanner, vehicleService);
    }
}
