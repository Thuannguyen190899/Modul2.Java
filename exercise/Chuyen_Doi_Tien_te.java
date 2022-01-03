package _1_introduction_java.exercise;

import java.util.Scanner;

public class Chuyen_Doi_Tien_te {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số USD");
        usd = sc.nextDouble();
        double quyDoi = usd*vnd;
        System.out.println("Giá trị VND là: " + quyDoi);
    }
}
