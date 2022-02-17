package _Module2_java._5_static_method.practice.p1;

import _Module2_java._5_static_method.practice.p1.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");

        s1.display();
        s2.display();
        s3.display();
    }
}
