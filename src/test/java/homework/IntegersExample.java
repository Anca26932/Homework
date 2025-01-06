package homework;

import org.testng.annotations.Test;

public class IntegersExample {

    @Test

    public void calculation() {

        Integer length = 10;
        Integer width = 5;
        Integer perimeter = 2 * (length + width);

        System.out.println("The perimeter of the rectangle is: " + perimeter);

        Integer minutes = 60;
        Integer seconds = minutes * 60;

        System.out.println(minutes + " minutes convert into seconds is equal to " + seconds);

        Integer side = 14;
        Integer area = side * side;

        System.out.println("The area of the square is: " + area);
    }
}
