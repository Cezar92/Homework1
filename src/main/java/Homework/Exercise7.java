package Homework;
import java.util.Scanner;
public class Exercise7 {  // 7. Change the implementation of the calculator from the previous meeting to not stop after one calculation. (Hint: put switch inside a while loop)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean b = true;

        while (b) {
            System.out.println("introduceti primul numar:");
            int n1 = sc.nextInt();
            System.out.println("introduceti al doilea numar:");
            int n2 = sc.nextInt();
            System.out.println("introduceti operatia dorita pentru cele doua numere");
            String operatie = sc.next();

            switch (operatie) {
                case "+":
                    System.out.println("Suma numerelor este " + (n1 + n2));
                    break;
                case "-":
                    System.out.println("Diferenta numerelor este " + (n1 - n2));
                    break;
                case "*":
                    System.out.println("Produsul numerelor este " + (n1 * n2));
                    break;
                case "/":
                    System.out.println(n1 + " Impartit la " + n2 + " este" + (n1 / n2));
                    break;
                default:
                    System.out.println("Operatie necunoscuta");
            }
            System.out.println("Do you want to continue?");
            b = sc.nextBoolean();
        }
        System.out.println();
    }
}


