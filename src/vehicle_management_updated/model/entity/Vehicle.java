package vehicle_management_updated.model.entity;

public class Vehicle {
    private String vehicleId;
    private String vehicleBrand;
    private Integer productionYear;
    private String ownerName;
    private Integer seatNumber;
    private String vehicleType;
    private Double vehicleLoadCapacity;
    private Double vehiclePower;

    public Vehicle() {
    }

    public Vehicle(String vehicleId, String vehicleBrand, Integer productionYear, String ownerName, Integer seatNumber, String vehicleType, Double vehicleLoadCapacity, Double vehiclePower) {
        this.vehicleId = vehicleId;
        this.vehicleBrand = vehicleBrand;
        this.productionYear = productionYear;
        this.ownerName = ownerName;
        this.seatNumber = seatNumber;
        this.vehicleType = vehicleType;
        this.vehicleLoadCapacity = vehicleLoadCapacity;
        this.vehiclePower = vehiclePower;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleBrand() {
        return vehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(Integer productionYear) {
        this.productionYear = productionYear;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Double getVehicleLoadCapacity() {
        return vehicleLoadCapacity;
    }

    public void setVehicleLoadCapacity(Double vehicleLoadCapacity) {
        this.vehicleLoadCapacity = vehicleLoadCapacity;
    }

    public Double getVehiclePower() {
        return vehiclePower;
    }

    public void setVehiclePower(Double vehiclePower) {
        this.vehiclePower = vehiclePower;
    }

    @Override
    public String toString() {
        return "[" + "Vehicle ID: " + vehicleId +
                "; Vehicle's Brand: " + vehicleBrand +
                "; Production Year: " + productionYear +
                "; Vehicle Owner: " + ownerName +
                "; Seat Number: " + seatNumber +
                "; Vehicle Type: " + vehicleType +
                "; Vehicle Load Capacity: " + vehicleLoadCapacity +
                "; Vehicle Power: " + vehiclePower + "]";
    }
}
