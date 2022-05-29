package javaRushCourse.arrays;


import java.util.Arrays;

public class arraysTask1 {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray = new int[firstArray.length + secondArray.length];


    public static void main(String[] args) {
        resultArray = Arrays.copyOf(firstArray, firstArray.length + secondArray.length);
        System.arraycopy(secondArray, 0, resultArray, firstArray.length, secondArray.length);
        for (int j : resultArray) {
            System.out.print(j + ", ");
        }
    }
}
