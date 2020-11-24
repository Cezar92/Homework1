package Extra_homework;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise10 {  // 10. Write a Java program to remove a specific element from an array.
    public static void main(String[] args) {

        int[] arr = {10, 25, 66, 23, 5, 87};
        Scanner sc = new Scanner(System.in);
        System.out.println("What element do you want to remove?" + Arrays.toString(arr));
        int x = sc.nextInt();


        for (int i = x; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println("After removing the second element: " + Arrays.toString(arr));
    }
}
