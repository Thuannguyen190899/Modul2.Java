package _Module2_java._3_Array.exercise._8_.mvc.model.repository;

import _Module2_java._3_Array.exercise._8_.mvc.model.model.Student;

public class StudentRepository implements IStudentRepository {
    private static Student [] students = new Student[20];
    static {
        students [0] = new Student(1,"HaiTT","1998-01-01",9);
        students [1] = new Student(2,"TrungDP","1998-01-01",9);
        students [2] = new Student(3,"TrungDC","1998-01-01",9);
    }

    @Override
    public Student[] getAll() {
        return students;
    }
    @Override
    public void add(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students [i] = student;
                break;
            }
        }
        System.out.println("Danh sách sau khi thêm là:");
        for (Student Thuan: students) {
            if (Thuan == null) {
                break;
            }
            System.out.println(student);
        }
    }
    public void delete(Student student) {

    }
}
