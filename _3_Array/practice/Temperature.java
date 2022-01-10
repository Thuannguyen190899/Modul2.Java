package _Module2_java._3_Array.practice;

import java.util.Scanner;

public class Temperature {
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static void main(String[] args) {
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");

        Scanner sc = new Scanner(System.in);
        int c;
        do {
            System.out.println("Choose what you want to change?");
            c = sc.nextInt();
            System.out.println("Enter your temperature");
            double d = sc.nextDouble();
            switch (c) {
                case 1:
                    System.out.println(fahrenheitToCelsius(d) + " Celsius");
                    break;
                case 2:
                    System.out.println(celsiusToFahrenheit(d) + " Fahrenheit");
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter again");
            }
        } while (c!=0);
    }
}