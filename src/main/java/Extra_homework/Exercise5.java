package Extra_homework;

import java.util.Scanner;

public class Exercise5 {  // Write a program in Java to input 5 numbers from keyboard and find their sum and average.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the first number.");
        int a = sc.nextInt();
        System.out.println("Type the second number.");
        int b = sc.nextInt();
        System.out.println("Type the third number.");
        int c = sc.nextInt();
        System.out.println("Type the fourth number.");
        int d = sc.nextInt();
        System.out.println("Type the last number.");
        int e = sc.nextInt();


        int sum = a + b + c + d + e;
        int avg = sum / 5;
        System.out.println("The sum is: "+sum+ ", and the average is: "+ avg);
    }
}
