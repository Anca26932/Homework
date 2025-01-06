package homework;

public class DoubleExample {

    public void calculation() {

        Double radius = 5.5;
        Double height = 14.2;
        Double volume = Math.PI * Math.pow(radius, 2) * height;

        System.out.println("The volume of the cylinder is : " + volume);

        Double fahrenheit = 75.6;
        Double convertToCelsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("Convert Fahrenheit in Celsius: " + convertToCelsius);

        Double shorterSideA = 23.6;
        Double shorterSideB = 25.1;
        Double lengthOfTheHypotenuse = Math.sqrt(shorterSideA * shorterSideA + shorterSideB * shorterSideB);

        System.out.println("Calculate the Hypotenuse of a Right-Angled Triangle : " + lengthOfTheHypotenuse);

    }


}
