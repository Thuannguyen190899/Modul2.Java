package loop_in_java.practice;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        if (number < 2){
            System.out.println(number + " is not a prime");
        } else {
            boolean check = true;
            int i = 1;
            while (i<Math.sqrt(number)) {
                i++;
                if (number % i ==0){
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(number + " is a prime");
            } else {
                System.out.println(number + " is not a prime");
            }
        }
    }
}
