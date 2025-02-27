package homework;


import org.testng.annotations.Test;

import java.util.Random;

public class BreakAndContinueExercises {
    @Test


    public void callingMethodos() {
//          findFirstPositiveDivisor(10);
//          sumPositiveNumbers();
          guessTheNumberGame(new int[]{1, 2, 4, 8, 10});



    }

    public void findFirstPositiveDivisor(int value) {
        for (int i = 2; i <= value; i++) {
            if (value % i == 0) {
                System.out.println("First positive divisor (other than 1): " + i);
                break;

            }
        }
    }
    public void sumPositiveNumbers (){
        int[] numbers = {5, -3, 8, 0};

        int sum = 0;

        for (int number : numbers) {
            if (number == 0) {
                break;
            }

            if (number < 0) {
                System.out.println("Negative number skipped.");
                continue;
            }

            sum += number;
        }
        System.out.println("Final sum of positive numbers: " + sum);

    }

    public void guessTheNumberGame (int [] numbers){
        int attempts = 5;
        int secretNumber = new Random().nextInt(10) + 1;

        for (int i = 0; i < numbers.length; i++){

            if ( numbers[i] == secretNumber){
                System.out.println("You guessed the number " + secretNumber);
                break;
            }
            if (i == attempts ){
                System.out.println("You reach the maximum attepmts. The number was" + secretNumber);

            }
        }
    }

}

