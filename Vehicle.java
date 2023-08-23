public class Vehicle {
    private double speed;
    private double temperature;
    private double fuelLevel;
    private double distanceFromEarth;

    public Vehicle() {

    }

    public Vehicle(double speed, double temperature, double fuelLevel, double distanceFromEarth) {
        this.speed = speed;
        this.temperature = temperature;
        this.fuelLevel = fuelLevel;
        this.distanceFromEarth = distanceFromEarth;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getFuelLevel() {
        return fuelLevel ;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getDistanceFromEarth() {
        return distanceFromEarth;
    }

    public void setDistanceFromEarth(double distanceFromEarth) {
        this.distanceFromEarth = distanceFromEarth;
    }

    public double updateDistanceFromEarth(double altitude) {
        return distanceFromEarth = altitude;
    }
}
