package _Module2_java._3_Array.exercise;

import java.util.Scanner;

public class DeleteIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int n = sc.nextInt();
        int [] array = new int[n];
        int i =0;
        while (i< n) {
            System.out.println("Enter element "+ (i+1) + ":");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.println("Enter the element you want ro delete");
        int x = sc.nextInt();
        int c;
        for (c=i=0; i<n; i++) {

            if (x !=array[i]) {
                array[c]=array[i];
                c++;
            }

        }

        if (c==n) {
            System.out.println("No result found");
        }
        System.out.println("New array after delete " + x + " is: ");
        for (i = 0; i < c; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
