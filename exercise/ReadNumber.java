package _1_introduction_java.exercise;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        int tram, chuc, donVi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Which number that you want to read?");
        tram = sc.nextInt();
        chuc = sc.nextInt();
        donVi = sc.nextInt();

        if (tram ==0 &&chuc==0){
            switch (donVi) {
                case 0:
                    System.out.println("Zero"); break;
                case 1:
                    System.out.println("One");break;
                case 2:
                    System.out.println("Two");break;
                case 3:
                    System.out.println("Three");break;
                case 4:
                    System.out.println("Four");break;
                case 5:
                    System.out.println("Five");break;
                case 6:
                    System.out.println("Six");break;
                case 7:
                    System.out.println("Seven");break;
                case 8:
                    System.out.println("Eight");break;
                case 9:
                    System.out.println("Nine");break;
                default:
                    System.out.println("Out of ability");
            }
        } else if (tram==0 && chuc ==1) {
            switch (donVi) {
                case 0:
                    System.out.println("Ten");break;
                case 1:
                    System.out.println("Eleven");break;
                case 2:
                    System.out.println("Twelve");break;
                case 3:
                    System.out.println("Thirteen");break;
                case 4:
                    System.out.println("Fourteen");break;
                case 5:
                    System.out.println("Fifteen");break;
                case 6:
                    System.out.println("Sixteen");break;
                case 7:
                    System.out.println("Seventeen");break;
                case 8:
                    System.out.println("Eighteen");break;
                case 9:
                    System.out.println("Nineteen");break;
            }
        }
    }
}
