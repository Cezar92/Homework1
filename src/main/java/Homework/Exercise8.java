package Homework;

import java.util.Scanner;

public class Exercise8 { // 8. Calculate and display the factorial of a given number n. (ex: 4! = 1*2*3*4)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number: ");
        int n = sc.nextInt();
        int i = 1;
        int f = 1;

        while (i <= n) {
            f = f * i;
            i++;
        }
        System.out.println("The facorial of " + n + " is " + f);
    }
}
