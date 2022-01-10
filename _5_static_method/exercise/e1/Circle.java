package _Module2_java._3_Array.exercise._5_static_method.exercise.e1;

public class Circle {
        private double radius = 1;
        private String color = "red";
        Circle (){

        }
        Circle (double radius) {
            this.radius = radius;
        }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return radius*radius*3.14;
    }
}
