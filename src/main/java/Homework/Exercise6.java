package Homework;

import java.util.Scanner;

public class Exercise6 {  // 6. Change the implementation of the calculator from the previous meeting to use only if-else instead of switch.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Type the first number:");
        int n1 = sc.nextInt();
        System.out.println("Type the second number:");
        int n2 = sc.nextInt();
        System.out.println("Type the operation:");
        String operatie = sc.next();

        if (operatie.equals("+")) {
            System.out.println("The sum of numbers is: " + (n1 + n2));
        }
        else if (operatie.equals("-")) {
            System.out.println("The diference of numbers is: " + (n1 - n2));
        }
        else if (operatie.equals("*")) {
            System.out.println("The product of numbers is: " + (n1 * n2));
        }
        else if (operatie.equals("/")) {
            System.out.println(n1 + " divided with " + n2 + " is " + (n1 / n2));
        }else {
            System.out.println("Unknown operation.");
        }
    }
}

