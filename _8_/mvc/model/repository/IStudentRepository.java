package _Module2_java._3_Array.exercise._8_.mvc.model.repository;

import _Module2_java._3_Array.exercise._8_.mvc.model.model.Student;

public interface IStudentRepository {
    default Student[] getAll() {
        return new Student[0];
    }

    void add(Student student);
    void delete(Student student);
}
