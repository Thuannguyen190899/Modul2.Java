package _1_introduction_java.practice;

import java.util.Scanner;

public class BodyMass {
    public static void main(String[] args) {
        double weight;
        double height;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter weight:");
        weight = sc.nextDouble();
        System.out.println("Enter height:");
        height = sc.nextDouble();
        double bmi = weight/Math.pow(height, 2);
        if (bmi < 18.5){
            System.out.println(bmi+ ": Underweight");
        } else
            if (bmi<25.0) {
                System.out.println(bmi+ ": Normal");
            } else
                if (bmi < 30.0) {
                    System.out.println( bmi+ ": Overweight");
                } else {
                    System.out.println( bmi+ ": Obese");
                }
        }
    }

