package _Module2_java._3_Array.exercise._6_inheritance.excise.e1;

public class Circle {
    double radius;
    String color;
    Circle (){}
    Circle (double radius, String color){
        this.color = color;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
     public double getArea (){
        return radius*radius*3.14;
     }
     public double getPerimeter(){
        return radius*2*3.14;
     }

    @Override
    public String toString() {
        return "Circle {" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
