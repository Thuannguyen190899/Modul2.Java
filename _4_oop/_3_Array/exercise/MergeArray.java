package _Module2_java._3_Array.exercise;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length arr1");
        int l1 = sc.nextInt();
        int[] arr1 = new int[l1];
        for (int i=0; i< l1; i++){
            System.out.println("Enter the element");
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter length arr2");
        int l2 = sc.nextInt();
        int [] arr2 = new int[l2];
        for (int i=0; i< l2; i++){
            System.out.println("Enter the element");
            arr2[i] = sc.nextInt();
        }
        int length = l1+l2;
        int[]  result = new int[length];
        int j = 0;
        //sử dụng vòng lặp for để lưu các phần tử trong mảng arr1 vào mảng result
        for (int element : arr1) {
            result[j] = element;
           j++;
        }
        //tương tự như vậy cho mảng arr2
        for (int element : arr2) {
            result[j] = element;
            j++;
        }
        //hiển thị mảng result ra màn hình
        for (int i = 0; i < length; i++) {
            System.out.print(result[i] + "\t");
        }
}
    }

