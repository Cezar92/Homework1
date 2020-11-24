package Extra_homework;

import java.util.Scanner;

public class Exercise8 {  // 8. Write a Java program to test if an array contains a specific value.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What number you want to check in this array?");
        int x = sc.nextInt();
        int[] arr = {10, 25, 66, 23, 5, 87};
        boolean b = false;

        for (int i : arr) {
            if (x == i) {
                b = true;
                System.out.println("The number is in this array.");
            } else {
                b = false;
            }
        }
        if (b == false) {
            System.out.println("The number is not in this array.");
        }
    }
}
