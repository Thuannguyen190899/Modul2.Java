package _Module2_java._3_Array.exercise._5_static_method.practice.p1;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";
    Student (int r, String n) {
        rollno = r;
        name = n;
    }
    static void change() {
        college = "CODEGYM";
    }
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
