package _Module2_java._14_Thuattoansapxep.practice;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println();
        BubbleSortByStep.bubbleSortByStep(list);
    }
    public static void bubbleSortByStep( int [] list) {

        for (int k = 0; k < list.length ; k++) {
            boolean needNextPass = true;
            for (int i = 0; i < list.length - k -1; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = false;
                }
            }
                if (needNextPass)
                    break;
                  System.out.printf("Loop %s:  %s %n",(k+1), Arrays.toString(list));
        }
    }
}

