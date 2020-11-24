package Extra_homework;

import java.util.Scanner;

public class Exercise2 {  // 2. Write a Java program that reads a number in inches, converts it to meters.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the value in inches: ");
        double in = sc.nextDouble();
        double m ;

        m = in * 0.0254;
        System.out.println(in + " inches = "+ m + " metres");

    }
}
