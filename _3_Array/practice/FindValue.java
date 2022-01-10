package _Module2_java._3_Array.practice;

import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String input_name = sc.nextLine();
        boolean isExist = false;
        for (int i=0; i<students.length; i++){
            if (students[i].equals(input_name)) {
                System.out.println("The position of the name "+ input_name + " is: " + (i+1));
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("The name "+input_name +" is not found!");
        }
    }
}
