package _Module2_java._3_Array.exercise._6_inheritance.excise.e1;

public class Cylinder extends Circle {
    double height;
    Cylinder () {
    }
    Cylinder (double radius, double height, String color){
        this.color = color;
        this.height = height;
        this.radius = radius;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public  double getVolume (){
        return getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder {" +
                "height=" + height +
                "} and " + super.toString() + " Volume="+ getVolume();
    }
}
