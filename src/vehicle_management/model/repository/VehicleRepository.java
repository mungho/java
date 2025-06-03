package vehicle_management.model.repository;

import vehicle_management.model.entity.Vehicle;

public class VehicleRepository {
    private Vehicle[] truckCategory = new Vehicle[100];
    private Vehicle[] carCategory = new Vehicle[100];
    private Vehicle[] motobikeCategory = new Vehicle[100];

    public String addnewVehicle(Vehicle vehicle, int vehicletype) {
        final int TRUCK = 1;
        final int CAR = 2;
        final int MOTOBIKE = 3;

        switch (vehicletype) {
            case 1:
                this.addToArray(this.truckCategory, vehicle);
                return "SUCCESSED";
            case 2:
                this.addToArray(this.carCategory, vehicle);
                return "SUCCESSED";
            case 3:
                this.addToArray(this.motobikeCategory, vehicle);
                return "SUCCESSED";
            default:
                return "FAILED";
        }
    }

    public Vehicle[] displayVehicles(int type) {
        switch (type) {
            case 1:
                return this.truckCategory;
            case 2:
                return this.carCategory;
            case 3:
                return this.motobikeCategory;
        }
        return new Vehicle[0];
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
                truckCategory[findVehicle(truckCategory,vehicleId)] = null;
                return true;
            } else if (findVehicle(carCategory, vehicleId) != -1) {
                carCategory[findVehicle(carCategory, vehicleId)] = null;
                return true;
            } else if (findVehicle(motobikeCategory, vehicleId) != -1) {
                motobikeCategory[findVehicle(motobikeCategory, vehicleId)] = null;
                return true;
            } else {
                return false;
            }
        }else {
            return false;
        }
    }

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
