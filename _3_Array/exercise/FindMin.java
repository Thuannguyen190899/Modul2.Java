package _Module2_java._3_Array.exercise._3_Array.exercise;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        size = sc.nextInt();
        int[] array = new int[size];
        int i =0;
        while (i< array.length) {
            System.out.println("Enter element "+ (i+1) + ":");
            array[i] = sc.nextInt();
            i++;
        }

        int min = array[0];
        int j;
        int index =0;
        for ( j=0; j< array.length; j++) {
            if (array[j]<min) {
                min = array[j];
                index = j;
            }
        }
        System.out.println("The min is: " +min+", array[" + index+ "]");
    }
}
