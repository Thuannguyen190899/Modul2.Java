package _1_introduction_java.practice;

import java.util.Scanner;

public class DateInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which month that you want to count das?");
        int month = sc.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("There are 31 days in month");
                break;
            case 2:
                System.out.println("There are 28 or 29 days in month");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("There are 30 days in month");
                break;
            default:
                System.out.println("No result found");
        }

    }
}
