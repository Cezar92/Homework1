package Homework;

public class Exercise2_1 {  //2. Display the smallest number from an array of numbers (2 versions:  with foreach)

    public static void main(String[] args) {
        
        int[] num = {100, 25, 3, 41, 15, 20, 58, 69, 89, 63, 46, 1};
        int min =num[0];


        for (int i :num) {
            if (i < min){
                min = i;
            }
        }
        System.out.println(min);
    }
}



