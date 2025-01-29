package homework;

import org.testng.annotations.Test;
import java.time.DayOfWeek;



public class SwitchExercises {
    public enum Operators {
        SUM,
        DIFF,
        MULTIPLY,
        DIVIDED
    }

    public enum TrafficLightColor {
        RED,
        YELLOW,
        GREEN

    }

    @Test

    //------------------ Main method to run the exercises------------------
    public void callingMethodos() {

 //       dayOfWeek(3);
 //       simpleCalculator(20,5, Operators.DIFF);
        trafficLightSimulator(TrafficLightColor.YELLOW);

    }
    // ------------------ Method for Day of the Week------------------

    public void dayOfWeek(Integer day) {

        switch (day) {
            case 1:
                System.out.println("Current day based on parameter is: " + DayOfWeek.of(day));
                break;
            case 2:
                System.out.println("Current day based on parameter is: " + DayOfWeek.of(day));
                break;
            case 3:
                System.out.println("Current day based on parameter is: " + DayOfWeek.of(day));
                break;
            case 4:
                System.out.println("Current day based on parameter is: " + DayOfWeek.of(day));
                break;
            case 5:
                System.out.println("Current day based on parameter is: " + DayOfWeek.of(day));
                break;
            case 6:
                System.out.println("Current day based on parameter is: " + DayOfWeek.of(day));
                break;
            case 7:
                System.out.println("Current day based on parameter is: " + DayOfWeek.of(day));
                break;
            default:
                System.out.println("The day for number " + day + " not exist");
        }

    }

    // ------------------ Method for performing the calculation based on the operation------------------

    public void simpleCalculator(Integer value1, Integer value2, Operators operation) {

        switch (operation) {
            case SUM:
                System.out.println("The sum is: " + (value1 + value2));
                break;

            case DIFF:
                System.out.println("The diff is: " + (value1 - value2));
                break;

            case MULTIPLY:
                System.out.println("The multiply is: " + (value1 * value2));
                break;

            case DIVIDED:
                System.out.println("The divided is: " + (value1 / value2));
                break;
        }

    }
      //------------------ Method for Traffic Light Simulator ------------------
   public void trafficLightSimulator (TrafficLightColor color) {
        switch (color) {
            case RED:
                System.out.println("STOP");
                break;
            case YELLOW:
                System.out.println("Caution! Prepare to stop.");
                break;
            case GREEN:
                System.out.println("GO");
                break;

        }
    }
}