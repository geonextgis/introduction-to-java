/*
 * Write a Java program to add two matrices of size 2x3
 */

package code.JavaCourseCWH.src.exercises;

public class Ex38_Add_Two_Matrices {
    public static void main (String[] args) {
        
        int[][] arr1 = {{1, 2, 3},
                        {4, 5, 6}};

        int[][] arr2 = {{7, 8, 9},
                        {10, 11, 12}};

        int[][] result = {{0, 0, 0},
                          {0, 0, 0}};

        for (int i=0; i<arr1.length; i++) {
            for (int j=0; j<arr1[i].length; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(result[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
