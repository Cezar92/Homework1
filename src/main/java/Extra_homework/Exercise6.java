package Extra_homework;

import java.util.Scanner;

public class Exercise6 { // 6. Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order,
    // "decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Type the first number.");
        int a = sc.nextInt();
        System.out.println("Type the second number.");
        int b = sc.nextInt();
        System.out.println("Type the third number.");
        int c = sc.nextInt();

        if (a < b && b < c) {
            System.out.println("The numbers are increasing.");
        } else if (a > b && b > c) {
            System.out.println("The numbers are decreasing.");
        } else {
            System.out.println("The numbers are random");
        }
    }
}
