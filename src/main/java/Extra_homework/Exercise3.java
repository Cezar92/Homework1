package Extra_homework;

import java.util.Scanner;

public class Exercise3 {  // 3. Write a Java program that accepts four integer from the user and prints equal if all four are equal, and not equal otherwise.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the first number.");
        int a = sc.nextInt();
        System.out.println("Type the second number.");
        int b = sc.nextInt();
        System.out.println("Type the third number.");
        int c = sc.nextInt();
        System.out.println("Type the last number.");
        int d = sc.nextInt();

        if (a==b && b==c && c==d){
            System.out.println("Numbers are equal.");
        } else
            System.out.println("Numbers are not equal!");
    }
}
