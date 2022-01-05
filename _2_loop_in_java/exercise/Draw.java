package loop_in_java.exercise;

import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        System.out.println ("Menu");
        System.out.println("1. Draw the triangle top-left");
        System.out.println("2. Draw the triangle top-right");
        System.out.println("3. Draw the triangle botton-left");
        System.out.println("4. Draw the triangle botton-right");
        System.out.println("5. Draw the square");
        System.out.println("6. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = input.nextInt();
        System.out.println("Enter the row");
        int h = input.nextInt();
        switch (choice){
            case 1:
                System.out.println("Draw the triangle top-left");
                for (int i = 0;i<h;i++){
                    for (int j =0;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }

                break;
            case 2:
                System.out.println("Draw the triangle top-right");
                for (int i=0;i<h;i++){
                    for (int j=h-1;j>=0;j--){
                        if(j>i){
                            System.out.print(" ");
                        }
                        else {
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("Draw the triangle botton-left");
                for (int i=0;i<h;i++){
                    for(int j=h;j>0;j--){
                        if(j>i){
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                }
                break;
            case 4:
                System.out.println("Draw the triangle botton-right");
                for (int i = 0;i<h;i++){
                    for (int j = 0;j<h;j++){
                        if (j>=i){
                            System.out.print("*");
                        }
                        else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }

                break;
            case 5:
                System.out.println("Draw the square");
                System.out.print("Enter the length x = ");
                int x = input.nextInt();
                for (int i=0;i<x;i++){
                    for (int j=0;j<x;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 6:
                System.out.println("Draw the rectangle");
                System.out.print("Enter the long a = ");
                int a =input.nextInt();
                System.out.print("Enter the width b = ");
                int b = input.nextInt();
                for (int i=0;i<a;i++){
                    for (int j=0;j<b;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }
}
