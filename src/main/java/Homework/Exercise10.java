package Homework;

public class Exercise10 {
    public static void main(String[] args) {

        int[][] arr1 = {{1, 2, 3},
                {4, 5, 4},
                {7, 8, 9}};

        if (isSquare(arr1))
            System.out.println("The array is square.");
        else System.out.println("The array is not square.");
    }

    public static boolean isSquare(int[][] arr1) {
        for (int i = 0, l = arr1.length; i < l; i++) {
            if (arr1[i].length != l) {
                return false;
            }
        }
        return true;
    }
}

