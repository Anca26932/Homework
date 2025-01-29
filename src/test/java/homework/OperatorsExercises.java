package homework;

import org.testng.annotations.Test;

public class OperatorsExercises {
    @Test
    //------------------ Main method to run the exercises------------------
    public void callingMethodos (){
//        arithmeticOperators();
//        System.out.println();
//
//        checkEvenOrOdd(5);
//        checkEvenOrOdd(100);

//        compoundAssignmentOperators();

    }

    //------------------ Method for Basic Arithmetic Operations ------------------

    public void arithmeticOperators () {

        Integer number1 = 10;
        Integer number2 = 5;

        System.out.println("The sum is: " + (number1 + number2));
        System.out.println("The difference is: " + (number1 - number2));
        System.out.println("The multiplication is: " + (number1 * number2));
        System.out.println("The division is: " + (number1 / number2));

    }

    // ------------------ Modulus Magic ------------------

    public void checkEvenOrOdd (Integer value){

        String[] messageDisplayed = {value + " is even", value + " is odd"};
        int result = value % 2;                      //check if a number (input from the user) is even or odd
        System.out.println(messageDisplayed[result]);
    }

    //------------------ Method for Compound Assignment Operators------------------
     Integer X = 10;

    public void compoundAssignmentOperators (){

        //Equivalent to x = x + 5
        System.out.println("Addition Assignment " + (X += 5));

        //Equivalent to x = x - 5
        System.out.println("Subtraction Assignment " + ( X -= 5));

        // Equivalent to x = x * 5
        System.out.println("Multiplication Assignment "+ (X *= 5));

       // Equivalent to x = x / 5
        System.out.println("Division Assignment " + (X /= 5));

    }
}


