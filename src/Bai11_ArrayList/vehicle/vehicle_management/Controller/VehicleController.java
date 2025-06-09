package Bai11_ArrayList.vehicle.vehicle_management.Controller;

import Bai11_ArrayList.vehicle.vehicle_management.app_factory.Factory;
import Bai11_ArrayList.vehicle.vehicle_management.view.VehicleView;

public class VehicleController {
    public static void main(String[] args) {
        VehicleView vehicleView = Factory.createVehicleView();
        vehicleView.runProgram();
    }
}
