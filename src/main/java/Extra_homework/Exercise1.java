package Extra_homework;

import java.util.Scanner;

public class Exercise1 {   // 1. Write a Java program to convert temperature from Fahrenheit to Celsius degree.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the temperature in Fahrenheit: ");
        double fr = sc.nextDouble();
        double c ;

        c = (fr-32)*5/9;
        System.out.println("The temperature in celsius degree is: "+c);
    }
}
