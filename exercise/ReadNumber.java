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
        String a ="";
        String b="";
        String x="";
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
        }
        if (tram==0 && chuc ==1) {
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
        if (chuc >1) {
            for (int i = 0; i<=9; i++) {
                switch (tram) {
                    case 0:
                        x = ""; break;
                    case 1:
                        x = "One hundred"; break;
                    case 2:
                        x = "Two hundred"; break;
                    case 3:
                        x = "Three hundred"; break;
                    case 4:
                        x = "Four hundred"; break;
                    case 5:
                        x = "Five hundred"; break;
                    case 6:
                        x = "Six hundred"; break;
                    case 7:
                        x = "Seven hundred"; break;
                    case 8:
                        x = "Eight hundred"; break;
                    case 9:
                        x = "Nine hundred"; break;
                }
            }

            for (int i =2; i<=9; i++) {
                switch (chuc) {
                    case 2:
                        a = " Twenty";
                        break;
                    case 3:
                        a = " Thirty";
                        break;
                    case 4:
                        a = " Forty";
                        break;
                    case 5:
                        a = " Fifty";
                        break;
                    case 6:
                        a = " Sixty";
                        break;
                    case 7:
                        a = " Seventy";
                        break;
                    case 8:
                        a = " Eighty";
                        break;
                    case 9:
                        a = " Ninety";
                        break;
                }
            }
                for (int i = 0; i<=9; i++) {
                    switch (donVi) {
                        case 0:
                            b = ""; break;
                        case 1:
                            b = "one"; break;
                        case 2:
                            b = "two"; break;
                        case 3:
                            b = "three"; break;
                        case 4:
                            b = "four"; break;
                        case 5:
                            b = "five"; break;
                        case 6:
                            b = "six"; break;
                        case 7:
                            b = "seven"; break;
                        case 8:
                            b = "eight"; break;
                        case 9:
                            b = "nine"; break;
                    }
                }
            System.out.println("Your number is: "+ x + a + b);
            }

        }
    }

