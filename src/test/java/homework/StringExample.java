package homework;

import org.testng.annotations.Test;

public class StringExample {
    @Test

    public void displayWelcome() {

        String welcomeValue = "Hello World !";
        System.out.println(welcomeValue);

        concatenateStrings();
        replaceCharacters();


    }

    public void concatenateStrings() {

        String firstName = "My name is Anca ";
        String lastName = " and the last name is Creta";
        System.out.println(firstName + lastName);

    }

    public void replaceCharacters() {


        String originalString = "Exercise";

        char oldChar = 'r';
        char newChar = 'F';

        String modifiedString = originalString.replace(oldChar, newChar);

        System.out.println("Original String : " + originalString);
        System.out.println("Modified String : " + modifiedString);

    }
}
