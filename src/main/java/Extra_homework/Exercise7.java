package Extra_homework;

public class Exercise7 {  // 7. Write a Java program to calculate the average value of array elements.

    public static void main(String[] args) {

        int [] arr = {10, 20, 20, 30, 30, 40, 50, 50};
        double avg;
        double sum = 0;

        for (int j : arr) {
            sum = sum + j;
        }
        avg = sum / arr.length;
        System.out.println(avg);
    }
}
