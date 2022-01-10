package loop_in_java.practice;

import java.util.Scanner;

public class InterestRate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the investment amount");
        double investment = sc.nextDouble();
        System.out.println("Enter your interest rate (% per year)");
        double interestRate = sc.nextDouble();
        System.out.println("Enter the number of months");
        int month = sc.nextInt();
        double interest = 0;
        for(int i = 0; i < month; i++){
            interest +=investment * (interestRate/100)/12 * month;
        }
        System.out.println("The interest after "+month+" month is: "+ interest);
    }
}
