package Homework;

import java.util.Scanner;

public class Exercise3 {  // 3. Display the max digit from a number, read the number from keyboard.
    public static void main(String[] args) {
        System.out.println("Type a number.");
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int max = 0;

        for (int i = 0; i < st.length(); i++){
            if (Character.getNumericValue(st.charAt(i)) > max){
                max = Character.getNumericValue(st.charAt(i));
            }
        }
        System.out.println("The max number is: "+ max);
    }
}
