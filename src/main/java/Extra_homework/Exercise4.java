package Extra_homework;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {  // Write a Java program to get a number from the user and print whether it is positive or negative.
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number number.");
        int a = sc.nextInt();

        if (a > 0) {
            System.out.println("The number is positive.");
        }
        if (a == 0) {
            System.out.println("The number is zero.");
        }
        if (a < 0)
            System.out.println("The number is negative.");
    }
}
