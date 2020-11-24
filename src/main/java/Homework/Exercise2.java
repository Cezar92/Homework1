package Homework;

public class Exercise2 {   // 2. Display the smallest number from an array of numbers (2 versions: with normal for)
    public static void main(String[] args) {

        int[] num = {100, 25, 3, 41, 15, 20, 58, 69, 89, 63, 46, 1};
        int min =num[0];
        int i;

        for (i=0; i<num.length; i++){
            if (num[i] < min){
                min = num[i];
            }
        }
        System.out.println(min);
    }
}
