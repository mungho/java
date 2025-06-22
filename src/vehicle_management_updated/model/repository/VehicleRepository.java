package vehicle_management_updated.model.repository;

import vehicle_management.model.entity.Vehicle;

import java.io.*;

public class VehicleRepository {
//    private Vehicle[] truckCategory = new Vehicle[100];
//    private Vehicle[] carCategory = new Vehicle[100];
//    private Vehicle[] motobikeCategory = new Vehicle[100];
    private final String TRUCK_PATH = "src/vehicle_management_updated/model/repository/file/TruckCategory.txt";
    private final String CAR_PATH = "src/vehicle_management_updated/model/repository/file/CarCategory.txt";
    private final String MOTOBIKE_PATH = "src/vehicle_management_updated/model/repository/file/MotobikeCategory.txt";

    public void addVehicle(String typeVehicle, Vehicle vehicle) throws FileNotFoundException {
        File truckCategory = new File(TRUCK_PATH);
        File carCategory = new File(CAR_PATH);
        File motobikeCategory = new File(MOTOBIKE_PATH);

        if (!truckCategory.exists()) {
            throw new FileNotFoundException("Truck file path is invalid");
        }

        if (!carCategory.exists()) {
            throw new FileNotFoundException("Car file path is invalid");
        }

        if (!motobikeCategory.exists()) {
            throw new FileNotFoundException("Motobike file path is invalid");
        }

        if (typeVehicle.equals("TRUCK")) {
            try (BufferedOutputStream truckInsert = new BufferedOutputStream(new FileOutputStream(truckCategory))) {
                truckInsert.write(vehicle.toString().getBytes());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (typeVehicle.equals("CAR")) {
            try (BufferedOutputStream carInsert = new BufferedOutputStream(new FileOutputStream(carCategory))) {
                carInsert.write(vehicle.toString().getBytes());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (typeVehicle.equals("MOTOBIKE")) {
            try (BufferedOutputStream motobikeInsert = new BufferedOutputStream(new FileOutputStream(motobikeCategory))) {
                motobikeInsert.write(vehicle.toString().getBytes());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

        public String addnewVehicle(Vehicle vehicle, int vehicletype) throws FileNotFoundException {
        final int TRUCK = 1;
        final int CAR = 2;
        final int MOTOBIKE = 3;

        switch (vehicletype) {
            case 1:
//                this.addToArray(this.truckCategory, vehicle);
                this.addVehicle("TRUCK", vehicle);
                return "SUCCESSED";
            case 2:
//                this.addToArray(this.carCategory, vehicle);
                this.addVehicle("CR", vehicle);
                return "SUCCESSED";
            case 3:
//                this.addToArray(this.motobikeCategory, vehicle);
                this.addVehicle("MOTOBIKE", vehicle);
                return "SUCCESSED";
            default:
                return "FAILED";
        }
    }

    public void displayVehicles(int type) {

    }

//    public boolean checkVehicle(String vehicleId) {
//        if(findVehicle(truckCategory, vehicleId) != -1) {
//            return true;
//        } else if (findVehicle(carCategory, vehicleId) != -1) {
//            return true;
//        } else if (findVehicle(motobikeCategory, vehicleId) != -1) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public boolean deleteVehicle(String vehicleId, int confirmed) {
//        if(confirmed == 1) {
//            if(findVehicle(truckCategory, vehicleId) != -1) {
//                truckCategory[findVehicle(truckCategory,vehicleId)] = null;
//                return true;
//            } else if (findVehicle(carCategory, vehicleId) != -1) {
//                carCategory[findVehicle(carCategory, vehicleId)] = null;
//                return true;
//            } else if (findVehicle(motobikeCategory, vehicleId) != -1) {
//                motobikeCategory[findVehicle(motobikeCategory, vehicleId)] = null;
//                return true;
//            } else {
//                return false;
//            }
//        }else {
//            return false;
//        }
//    }

    private void addToArray(Vehicle[] vehicles, Vehicle vehicle) {
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] == null) {
                vehicles[i] = vehicle;
                break;
            }
        }
    }

    private int findVehicle(Vehicle[] tempArray, String vehicleId) {
        for (int i = 0; i < tempArray.length; i++) {
            if (tempArray[i] != null) {
                if (tempArray[i].getVehicleId().equals(vehicleId)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
