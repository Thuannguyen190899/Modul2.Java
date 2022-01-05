package loop_in_java.practice;

import java.util.Scanner;

public class CommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number a:");
        int a = input.nextInt();
        System.out.println("Enter number b:");
        int b = input.nextInt();
        int i=2;
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Greatest common factor: " + a);
    }
}
