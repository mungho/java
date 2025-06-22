package vehicle_management_updated.app_factory;

import vehicle_management.model.repository.VehicleRepository;
import vehicle_management.model.service.VehicleService;
import vehicle_management.view.VehicleView;

import java.util.Scanner;

public class Factory {

    public static VehicleView createVehicleView() {
        VehicleRepository vehicleRepository = new VehicleRepository();
        VehicleService vehicleService = new VehicleService(vehicleRepository);
        Scanner scanner = new Scanner(System.in);
        return new VehicleView(scanner, vehicleService);
    }
}
