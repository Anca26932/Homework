package homework;

import org.testng.annotations.Test;

public class IfBlocksExercises {
@Test

    public void gradeCalculator (Integer value){

        if( value >= 90) {
            System.out.println("This is A because  " + value + " is greater or equal with 90 ");
        } else if ( value >= 80 && value <= 89) {
            System.out.println("This is B because  " + value + " is between 80 and 89 ");
        } else if ( value >= 70 && value <= 79) {
            System.out.println("This is C because  " + value + " is between 70 and 79 ");
        } else if ( value >= 60 && value <= 69) {
            System.out.println("This is D because  " + value + " is between 60 and 69 ");
        } else {
            System.out.println("This is F because  " + value + " is below 60 ");

        }
    }
    public void passwordChecker (String value) {

        boolean weak = value.length() < 8;
        boolean moderate = value.length() >= 8 && !value.matches(".*\\d.*");

        if(weak) {
            System.out.println("Weak Password");
        } else if ( moderate) {
            System.out.println("Moderate Password");
        } else {
            System.out.println("Strong Password");
        }
    }

    public void leapYearChecker (Integer year){


        System.out.println("Enter a year:" + year );
        boolean isLeapYear = ( year % 4 == 0 && year % 100 != 0 )|| (year % 400 == 0);

        if (isLeapYear){
            System.out.println(year + " is a leap year.");
        }else
            System.out.println(year + " is not a leap year.");

    }

}
