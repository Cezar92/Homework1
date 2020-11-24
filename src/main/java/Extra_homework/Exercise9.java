package Extra_homework;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise9 {  // 9. Write a Java program to find the index of an array element.
    public static void main(String[] args) {

        int[] arr = {10, 25, 66, 23, 5, 87};
        Scanner sc = new Scanner(System.in);
        System.out.println("The index of what element do you want?" + Arrays.toString(arr));
        int x = sc.nextInt();
        int hold = 0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                hold = i;
            }
        }
        System.out.println("The index of: " + x + " is " + hold);

    }
}
