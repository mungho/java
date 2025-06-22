package vehicle_management_updated.Controller;

import student_management.config.AppFactory;
import vehicle_management.app_factory.Factory;
import vehicle_management.view.VehicleView;

public class VehicleController {
    public static void main(String[] args) {
        VehicleView vehicleView = Factory.createVehicleView();
        vehicleView.runProgram();
    }
}
