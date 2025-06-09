package Bai11_ArrayList.vehicle.vehicle_management.model.repository;

import Bai11_ArrayList.vehicle.vehicle_management.model.entity.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleRepository {
    private List<Vehicle> truckCategory = new ArrayList<>(50);
    private List<Vehicle> carCategory = new ArrayList<>(50);
    private List<Vehicle> motobikeCategory = new ArrayList<>(50);

    public String addnewVehicle(Vehicle vehicle, int vehicletype) {
        final int TRUCK = 1;
        final int CAR = 2;
        final int MOTOBIKE = 3;

        switch (vehicletype) {
            case 1:
                truckCategory.add(vehicle);
                return "SUCCESSED";
            case 2:
                carCategory.add(vehicle);
                return "SUCCESSED";
            case 3:
                motobikeCategory.add(vehicle);
                return "SUCCESSED";
            default:
                return "FAILED";
        }
    }

    public List<Vehicle> displayVehicles(int type) {
        final int TRUCK = 1;
        final int CAR = 2;
        final int MOTOBIKE = 3;

        switch (type) {
            case TRUCK:
                return this.truckCategory;
            case CAR:
                return this.carCategory;
            case MOTOBIKE:
                return this.motobikeCategory;
            default:
                return new ArrayList<>();
        }
    }

    public boolean checkVehicle(String vehicleId) {
        if(findVehicle(truckCategory, vehicleId) != -1) {
            return true;
        } else if (findVehicle(carCategory, vehicleId) != -1) {
            return true;
        } else if (findVehicle(motobikeCategory, vehicleId) != -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean deleteVehicle(String vehicleId, int confirmed) {
        if(confirmed == 1) {
            if(findVehicle(truckCategory, vehicleId) != -1) {
                truckCategory.set(findVehicle(truckCategory,vehicleId), null);
                return true;
            } else if (findVehicle(carCategory, vehicleId) != -1) {
                carCategory.set(findVehicle(carCategory, vehicleId), null);
                return true;
            } else if (findVehicle(motobikeCategory, vehicleId) != -1) {
                motobikeCategory.set(findVehicle(motobikeCategory, vehicleId), null);
                return true;
            } else {
                return false;
            }
        }else {
            return false;
        }
    }

    private int findVehicle(List<Vehicle> tempArray, String vehicleId) {
        for (int i = 0; i < tempArray.size(); i++) {
            if (tempArray.get(i) != null) {
                if (tempArray.get(i).getVehicleId().equals(vehicleId)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
