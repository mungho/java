package vehicles.view;

import vehicles.controller.CarController;
import vehicles.controller.MotobikeController;
import vehicles.controller.TruckController;
import vehicles.model.entity.Vehicle;

import java.util.List;
import java.util.Scanner;

public class VehicleView {
    Scanner scanner = new Scanner(System.in);
    TruckController truckController = new TruckController();
    CarController carController = new CarController();
    MotobikeController motobikeController = new MotobikeController();

    public void runProgram() {
        final int ADD = 1;
        final int DISPLAY = 2;
        final int DELETE = 3;
        final int EXIT = 4;

        boolean check = true;
        while (check) {
            System.out.println(
                    "------------------------------------- \n" +
                            "What you want to do? \n" +
                            "1. Add a new vehicle \n" +
                            "2. Display vehicle list \n" +
                            "3. Delete a vehicle \n" +
                            "4. Exit");
            int num = Integer.parseInt(scanner.nextLine());

            switch (num) {
                case ADD:
                    addNewVehicle();
                    break;
                case DISPLAY:
                    displayVehicles();
                    break;
                case DELETE:
                    deleteVehicle();
                    break;
                case EXIT:
                    check = false;
                    break;
            }
        }
    }
    public void addNewVehicle() {
        System.out.println("What vehicle's type you want to add? \n" +
                "1. Truck Vehicle \n" +
                "2. Car Vehicle \n" +
                "3. Motobike Vehicle");

        int type = 0;
        do {
            try {
                type = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Your vehicle type is not exist");
                System.out.println("Error:" + e.getMessage());
            }
        } while (type != 1 && type != 2 && type !=3);

        System.out.println("Vehicle ID:");
        String vehicleId = scanner.nextLine();
        System.out.println("Vehicle Type:");
        String vehicleType = scanner.nextLine();
        System.out.println("Vehicle Brand Name:");
        String vehicleBrand = scanner.nextLine();
        System.out.println("Owner Name:");
        String ownerName = scanner.nextLine();
        System.out.println("Seat Number:");
        Integer seatNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Vehicle Load Capacity:");
        Double vehicleLoadCapacity = Double.parseDouble(scanner.nextLine());
        System.out.println("Vehicle Power:");
        Double vehiclePower = Double.parseDouble(scanner.nextLine());
        System.out.println("Production Year:");
        Integer productionYear = Integer.parseInt(scanner.nextLine());

        Vehicle vehicle = new Vehicle(vehicleId, vehicleBrand, productionYear, ownerName, seatNumber, vehicleType, vehicleLoadCapacity, vehiclePower);
        if (type == 1) {
            boolean status = truckController.addVehicle(vehicle);
            displayMessage(status);
        } else if (type == 2) {
            boolean status = carController.addVehicle(vehicle);
            displayMessage(status);
        } else if (type == 3) {
            boolean status = motobikeController.addVehicle(vehicle);
            displayMessage(status);
        }
    }

    public void displayMessage(boolean status) {
        if (status == false) {
            System.out.println("Failed. Please try again!");
        } else {
            System.out.println("Successful!");
        }
    }

    public void displayVehicles() {
        int type = 0;
        do {
            try{
                System.out.println(
                        "------------------------------------- \n" +
                                "What's list you want to view: \n" +
                                "1. Truck Category \n" +
                                "2. Car Category \n" +
                                "3. Motobike Category \n");
                type = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }while (type != 1 && type != 2 && type != 3);

        if (type == 1) {
            List<Vehicle> vehicles = truckController.displayVehicle();
            arrayToText(vehicles);
        } else if (type == 2) {
            List<Vehicle> vehicles = carController.displayVehicle();
            arrayToText(vehicles);
        } else if (type == 3) {
            List<Vehicle> vehicles = motobikeController.displayVehicle();
            arrayToText(vehicles);
        }
    }

    public void arrayToText(List<Vehicle> vehicles) {
        for (Vehicle vehicle: vehicles) {
            System.out.println("[" + "Vehicle ID: " + vehicle.getVehicleId() +
                    "; Vehicle's Brand: " + vehicle.getVehicleBrand() +
                    "; Production Year: " + vehicle.getProductionYear() +
                    "; Vehicle Owner: " + vehicle.getOwnerName() +
                    "; Seat Number: " + vehicle.getSeatNumber() +
                    "; Vehicle Type: " + vehicle.getVehicleType() +
                    "; Vehicle Load Capacity: " + vehicle.getVehicleLoadCapacity() +
                    "; Vehicle Power: " + vehicle.getVehiclePower() + "]");
        }
    }

    public void deleteVehicle() {

        int type = 0;
        do {
            try{
                System.out.println("What type vehicle you want to delete? \n" +
                        "1. Truck Category \n" +
                        "2. Car Category \n" +
                        "3. Motobike Category \n");
                type = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (type != 1 && type != 2 && type != 3);

        System.out.println("Please enter vehicleID you want to delete");
        String vehicleID = scanner.nextLine();

        if(type == 1) {
            boolean isExist = truckController.isVehicleExist(vehicleID);
            if(isExist == true) {
                boolean isDeleted = truckController.deleteVehicle(vehicleID, true);
                if (isDeleted == true) {
                    System.out.println("Deleted successfully!");
                } else System.out.println("Deleted failed!");
            } else {
                System.out.println("Vehicle is not exist");
            }
        } else if (type == 2) {
            // Nho dien ham car khi viet xong
            boolean isExist = carController.isVehicleExist(vehicleID);
            if(isExist == true) {
                boolean isDeleted = carController.deleteVehicle(vehicleID, true);
                if (isDeleted == true) {
                    System.out.println("Deleted successfully!");
                } else System.out.println("Deleted failed!");
            } else {
                System.out.println("Vehicle is not exist");
            }
        } else if (type == 3) {
            // motobike
            boolean isExist = motobikeController.isVehicleExist(vehicleID);
            if(isExist == true) {
                boolean isDeleted = motobikeController.deleteVehicle(vehicleID, true);
                if (isDeleted == true) {
                    System.out.println("Deleted successfully!");
                } else System.out.println("Deleted failed!");
            } else {
                System.out.println("Vehicle is not exist");
            }
        }
    }
}


