package vehicle_management.app_factory;

import vehicle_management.model.repository.VehicleRepository;
import vehicle_management.model.service.VehicleService;
import vehicle_management.view.VehicleViewUpdated;

import java.util.Scanner;

public class Factory {

    public static VehicleViewUpdated createVehicleView() {
        VehicleRepository vehicleRepository = new VehicleRepository();
        VehicleService vehicleService = new VehicleService(vehicleRepository);
        Scanner scanner = new Scanner(System.in);
        return new VehicleViewUpdated(scanner, vehicleService);
    }
}
