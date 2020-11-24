package Homework;

import java.util.Scanner;

public class Exercise4 {  // 4. Check if a number is palindrom ( e.g palindrom 1221, 34143), read the number from keyboard.

    public static void main(String[] args) {
        System.out.println("Type an integer number:");
        Scanner sc = new Scanner(System.in);
        int nr = sc.nextInt();
        int i = 0;
        String st = String.valueOf(nr);
        int a = st.length();
        String st2 = "";

        while (i < a) {

            st2 = st2 + st.charAt(a - 1);
            a--;
        }
        if (st.equals(st2)) {
            System.out.println("The number is palindrom.");
        } else
            System.out.println("The number is not palindrom");
    }
}
