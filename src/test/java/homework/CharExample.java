package homework;

import org.checkerframework.checker.units.qual.C;
import org.testng.annotations.Test;

public class CharExample {

    @Test
    public void metodaCharacter() {
        char letter = 'M';
        System.out.println("The character is : " + letter);


        convertCase();
        concatenateCharacterWithString();
    }


    public void convertCase() {
        char lowercaseletter = 'a';
        char uppercaseletter = 'B';

        System.out.println("The upper case letter is : " + Character.toUpperCase(lowercaseletter));
        System.out.println("The lower case letter is : " + Character.toLowerCase(uppercaseletter));


    }

    public void concatenateCharacterWithString() {
        char letter = 'A';
        String word = "Example";

        System.out.println("Concatenate letter in the beginning and the end of word string : " + letter + word + letter);

    }


}
