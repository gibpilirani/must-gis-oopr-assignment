import java.util.Scanner;
public class RocketController {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        Vehicle rocket =  new Vehicle(0.0, 10, 1000,10);

        //Do nto change anything above this line

        //=======================================================================================
        //Add your code below




        

        //========================================================================================
        //Do not change anything here
        RocketMonitor rocketMonitor = new RocketMonitor();


        //Simulate rocket's journey
        System.out.println("Initial values.... ");
        //Display initial values
        rocketMonitor.displayStatus(rocket, rocketName);

        //=======================================================================================
        //Add your code below this line
        




        //=======================================================================================
        //Do not change anything below
        //Calculate distance traveled based on speed and time
        double timeElapsed = 10.0; // in seconds
        double distanceTraveled = rocket.getSpeed() * timeElapsed;
        //Do not change anything above this


        //Do not change anything below this line
        //Update rocket's distance from Earth
        rocket.updateDistanceFromEarth(distanceTraveled);
        //Update readings
        RocketUpdater.updateRocket(rocket, rocket.getSpeed(), rocket.getTemperature(), distanceTraveled);

        //Show the readings on the screen to display status
        rocketMonitor.displayStatus(rocket, rocketName);
    }
}
