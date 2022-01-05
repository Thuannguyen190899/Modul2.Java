package loop_in_java.exercise;

public class PrimeDuoi100 {
    public static void main(String[] args) {
        int count = 0;
        int n;
        int j= 1;
        boolean check;
        while(j <100) {
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
