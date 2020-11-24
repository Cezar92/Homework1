package Homework;

import java.util.Scanner;

public class Exercise5 {  // 5. Display all the prime numbers lower than a given number, read the number from keyboard

    public static boolean prim(int n) {
        for (int i = 2; i < n; i++) {
            if ((n % i) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int sum = 0;
//        int i = 1;
        int n = 2;
        System.out.println("Type the maximum number.");
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();

        while(n<j){
            if (prim(n)){
                System.out.println(n);
//                sum = sum +n;
//                i++;
            }
            n++;
        }
//        System.out.println("The sum is "+ sum);
    }
}


