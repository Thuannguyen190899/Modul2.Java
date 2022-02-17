package _Module2_java._14_Thuattoansapxep.practice;

public class SelectionSort {

    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void selectionSort (double [] list) {
        int size = list.length;
        for (int i = 0; i < size; i++) {
            double min = list[i];
            int indexMin = i;
            for (int j = i + 1; j < size; j++) {
                if (min > list[j]) {
                    min = list[j];
                    indexMin = j;
                }
            }
            if (indexMin != i) {
                list[indexMin] = list [i];
                list [i] = min;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
