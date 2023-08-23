public class Rocket {
    private String name;
    private final double MIN_TEMPERATURE = -24; //Degrees celcius
    private final double MAX_TEMPERATURE = 2000;  //Degree celcius

    private final double MAX_WEIGHT = 4000; //4000 TONNES

    private int flightHours;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMIN_TEMPERATURE() {
        return MIN_TEMPERATURE;
    }

    public double getMAX_TEMPERATURE() {
        return MAX_TEMPERATURE;
    }

    public double getMAX_WEIGHT() {
        return MAX_WEIGHT;
    }

    public int getFlightHours() {
        return flightHours;
    }

    public void setFlightHours(int flightHours) {
        this.flightHours = flightHours;
    }
}
