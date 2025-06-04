package vehicle_management.view;

import vehicle_management.model.entity.Vehicle;
import vehicle_management.model.repository.VehicleRepository;
import vehicle_management.model.service.VehicleService;

import java.util.Scanner;

public class VehicleView {
    private Scanner scanner;
    private VehicleService vehicleService;

    public VehicleView() {
    }

    public VehicleView(Scanner scanner, VehicleService vehicleService) {
        this.scanner = scanner;
        this.vehicleService = vehicleService;
    }

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
        int type = Integer.parseInt(scanner.nextLine()); //Can them validate cho thang nay, neu sai thi bat nhap lai
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
        String result = vehicleService.addNewVehicle(vehicle, type);
        switch (result) {
            case "SUCCESSED":
                System.out.println("Added a new vehicle successfully!");
                break;
            case "FAILED":
                System.out.println("Added a new vehicle failed!");
                ;
                break;
        }
    }

    public void displayVehicles() {
        System.out.println(
                "------------------------------------- \n" +
                        "What's list you want to view: \n" +
                        "1. Truck Category \n" +
                        "2. Car Category \n" +
                        "3. Motobike Category \n");
        int type = Integer.parseInt(scanner.nextLine());
        Vehicle[] vehicles = vehicleService.displayVehicles(type);
        if (vehicles.length != 0) {
            int count = 0;
            for (int i = 0; i < vehicles.length; i++) {
                if (vehicles[i] != null) {
                    System.out.println(vehicles[i].toString());
                    count++;
                }
            }

            if (count == 0) {
                System.out.println("Vehicle list is empty!");
            }
        } else {
            System.out.println("Please try again. Your vehicle list is not exist!");
        }
    }

    public void deleteVehicle() {
        System.out.println("What vehicle ID you want to delete?");
        String vehicleId = scanner.nextLine();

        boolean findVehicle = vehicleService.checkVehicle(vehicleId);

        if (findVehicle) {
            System.out.println("Are you sure to delete that vehicle? \n" +
                    "0. No, please ignore \n" +
                    "1. Yes, I want to delete");
            int conrfirmed = Integer.parseInt(scanner.nextLine());

            if (conrfirmed == 0) {
                System.out.println("Oke, we ignored");
            } else if (conrfirmed == 1) {
                boolean check = vehicleService.deleteVehicle(vehicleId, conrfirmed);
                if(check) {
                    System.out.println("Deleted successfully");
                } else {
                    System.out.println("Deleted failed");
                }
            } else {
                System.out.println("Your number is invalid");
            }
        } else {
            System.out.println("Your vehicle is not exist");
        }
    }
}
