package vehicles.model.repository;

import vehicles.model.entity.Vehicle;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TruckRepository implements IVehicleRepository {

    @Override
    public boolean addVehicle(Vehicle vehicle, String path, boolean isAppend) {
        File file = new File(path);
        boolean status = false;

        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file, isAppend))) {
            byte[] bytes = (vehicle.toString() + "\n").getBytes();
            bos.write(bytes);
            status = true;
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
        return status;
    }

    @Override
    public List<Vehicle> displayVehicle(String path) {
        File file = new File(path);
        List<Vehicle> vehicles = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] teampArray = line.split(",");

                String vehicleId = teampArray[0];
                String vehicleBrand = teampArray[1];
                Integer productionYear = Integer.parseInt(teampArray[2]);
                String ownerName = teampArray[3];
                Integer seatNumber = Integer.parseInt(teampArray[4]);
                String vehicleType = teampArray[5];
                Double vehicleLoadCapacity = Double.parseDouble(teampArray[6]);
                Double vehiclePower = Double.parseDouble(teampArray[7]);

                Vehicle vehicle = new Vehicle(vehicleId, vehicleBrand, productionYear, ownerName, seatNumber, vehicleType, vehicleLoadCapacity, vehiclePower);
                vehicles.add(vehicle);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return vehicles;
    }

    @Override
    public boolean deleteVehicle(String vehicleId, boolean isConfirmed, String path) {
        File file = new File(path);
        List<Vehicle> vehicles = new ArrayList<>();

        if (isConfirmed == true) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] teampArray = line.split(",");

                    String tempvehicleId = teampArray[0];
                    String vehicleBrand = teampArray[1];
                    Integer productionYear = Integer.parseInt(teampArray[2]);
                    String ownerName = teampArray[3];
                    Integer seatNumber = Integer.parseInt(teampArray[4]);
                    String vehicleType = teampArray[5];
                    Double vehicleLoadCapacity = Double.parseDouble(teampArray[6]);
                    Double vehiclePower = Double.parseDouble(teampArray[7]);

                    Vehicle vehicle = new Vehicle(tempvehicleId, vehicleBrand, productionYear, ownerName, seatNumber, vehicleType, vehicleLoadCapacity, vehiclePower);
                    vehicles.add(vehicle);
                }

                int index = findVehicle(vehicleId, vehicles);

                if (index != -1) {
                    vehicles.remove(vehicles.get(index));
                }

            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }


            clearCSV(path);
            for (Vehicle vehicle : vehicles) {
                addVehicle(vehicle, path, true);
            }
            return true;
        } else return false;
    }

    public int findVehicle(String vehicleid, List<Vehicle> vehicles) {
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicleid.equals(vehicles.get(i).getVehicleId())) {
                return i;
            }
        }
        return -1;
    }

    public boolean isVehicleExist(String vehicleid, List<Vehicle> vehicles) {
        if (findVehicle(vehicleid, vehicles) != -1) {
            return true;
        } else return false;
    }

    public void clearCSV(String path) {
        File file = new File(path);

        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file))) {

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
