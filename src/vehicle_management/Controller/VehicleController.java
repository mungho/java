package vehicle_management.Controller;

import vehicle_management.app_factory.Factory;
import vehicle_management.view.VehicleViewUpdated;

public class VehicleController {
    public static void main(String[] args) {
        VehicleViewUpdated vehicleView = Factory.createVehicleView();
        vehicleView.runProgram();
    }
}
