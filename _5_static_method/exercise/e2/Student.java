package _Module2_java._3_Array.exercise._5_static_method.exercise.e2;

public class Student {
    private String name = "John";
 private  String classes = "C02";
    Student (){
    }
    Student (String name, String classes){
        this.name = name;
        this.classes = classes;
    }
    public  String getName() {
        return name;
    }

    public  String getClasses() {
        return classes;
    }
    public void setName(String name) {
        this.name = name;
    }
    public  void setClasses (String classes){
        this.classes = classes;
    }


}
