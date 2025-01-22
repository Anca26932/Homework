package homework;

import org.testng.annotations.Test;

public class BooleanExample {
    @Test

    public void BooleanValueAssignment() {

        Boolean isTextVisible = true;

        System.out.println("Is text visible : " + isTextVisible);
        System.out.println();

        ComparisonV1();
        ComparisonV2(76, 25);
        ComparisonV2(25, 1001);
        System.out.println();

        CheckingWeatherConditions(true, false, false);
        CheckingWeatherConditions(false, true, false);
        CheckingWeatherConditions(true, false, true);
        CheckingWeatherConditions(false, true, true);
        CheckingWeatherConditions(true, true, true);
        System.out.println();
    }


    public void ComparisonV1() {

        Integer firstNumber = 506;
        Integer secondNumber = 45;
        Boolean result = firstNumber.intValue() > secondNumber.intValue();

        System.out.println("Is first number greater than second numner:  " + result);


    }

    public void ComparisonV2(int firstNumber, int secondNumber) {

        boolean result = firstNumber > secondNumber;

        System.out.println("Is first number greater than second numner:  " + result);


    }

    public void CheckingWeatherConditions(boolean isSunny, boolean isWarm, boolean chanceOfRain) {

        boolean shouldGoOut = (isSunny || isWarm) && !chanceOfRain;

        if (shouldGoOut) {
            System.out.println("You should go outside : " + shouldGoOut);
        } else {
            System.out.println("You should go outside : " + shouldGoOut);
        }
    }
}
