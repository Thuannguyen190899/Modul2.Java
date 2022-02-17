package _Module2_java._13_Thuat_toan_tim_kiem.exercise;

import java.util.Arrays;

public class TestSort {
    private static int[] a= {23,9,84,8,62};

    public static void main(String[] args) {
        buddle();
    }

    static void selection(){

    }

    static void buddle(){
        int size= a.length;

        for (int i = 0; i < size; i++) {
            boolean isSorted= true;
            for (int j = 0; j < size - i -1; j++) {
                if(a[j]> a[j+1]){
                    int tmp= a[j];
                    a[j]= a[j+1];
                    a[j+1]= tmp;
                    isSorted= false;
                }
            }

            if(isSorted)
                break;

            System.out.printf("Loop %s:  %s %n",i+1, Arrays.toString(a));

        }
    }
}
