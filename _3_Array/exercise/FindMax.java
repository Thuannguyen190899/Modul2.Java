package _Module2_java._3_Array.exercise._3_Array.exercise;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix;
        matrix = new int [5][5];
        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = sc.nextInt();
            }
            }
        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");
        int max = matrix[0][0];
        for (int row =0; row< matrix.length; row ++){
            for (int col =0; col< matrix[0].length; col++){
                if(max<matrix[row][col]){
                    max = matrix[row][col];
                }
            }
            System.out.println("The max is: "+max);
        }
    }

}
