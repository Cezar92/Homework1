package Homework;
import java.util.Scanner;
public class Exercise11 {

    public static void main(String[] args) {
        System.out.println("Chose the month (from 1 to 12)");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int daysInMonth = 0;

        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                daysInMonth = 31;

                break;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                daysInMonth = 30;
                break;
            case 2: // February
                daysInMonth = 28;
                break;
        }
        System.out.println("The " + month + "'th month has " + daysInMonth + " days.");
    }
}
