public class RocketMonitor extends Rocket{
    public static void displayStatus(Vehicle rocket, Rocket rocketName) {
        System.out.println("Rocket " + rocketName.getName() + " is launching ....");
        System.out.println("Rocket's Speed: " + rocket.getSpeed() + " m/s");
        System.out.println("Rocket's Temperature: " + rocket.getTemperature() + " °C");
        System.out.println("Rocket's Fuel Level: " + rocket.getFuelLevel() + " liters");
        System.out.println("Distance from Earth: " + rocket.getDistanceFromEarth() + " meters above sea level");
    }
}
