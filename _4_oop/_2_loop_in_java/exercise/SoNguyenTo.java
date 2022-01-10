package loop_in_java.exercise;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        int count = 0;
        int n;
        int j= 1;
        boolean check;
        while(count<20) {
            check = true;
            for (n = 2 ; n < j; n++) {
                if (j % n == 0) {
                    check = false;
                }
            }
            if (check) {
                System.out.println(j);
                count++;
            }
            j++;
        }
    }
}
