package _Module2_java._3_Array.exercise._3_Array.exercise;

import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            array[i] = sc.nextInt();
        }
        int [] arr = new int[(size+1)];
        System.arraycopy(array, 0, arr, 0, array.length);

        System.out.println("Enter your element which you want to insert:");
        int x = sc.nextInt();
        System.out.println("Enter your index where you want to insert:");
        int index = sc.nextInt();
        if (index <= 1 || index > array.length) {
            System.out.println("Can not insert");
        } else {

            for (int j = arr.length-1; j >= index; j--) {
                if (j == index) {
                    arr[j] = x;
                }
                arr[j] = arr[j - 1];
            }
            }
            System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j : arr) {
            System.out.print(j);
        }
        }

    }
