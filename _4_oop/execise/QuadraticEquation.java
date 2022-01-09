package _Module2_java._4_oop.execise;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;
    public QuadraticEquation() {
    }
    public QuadraticEquation (double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant() {
        return this.b*this.b - 4*this.a*this.c;
    }
    public double getRoot1() {
        return (-this.b-Math.sqrt(b*b - 4*this.a*this.c))/2*this.a;
    }
    public double getRoot2() {
        return (-this.b+Math.sqrt(b*b - 4*this.a*this.c))/2*this.a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a:");
        double a = sc.nextDouble();
        System.out.println("Enter number b:");
        double b = sc.nextDouble();
        System.out.println("Enter number c:");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("x = " + quadraticEquation.getRoot1());
        } else if (quadraticEquation.getDiscriminant()>0) {
            System.out.println("x1 = " + quadraticEquation.getRoot1());
            System.out.println("x2 = " + quadraticEquation.getRoot2());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
