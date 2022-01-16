package _Module2_java._3_Array.exercise._6_inheritance.practice.heDoiTuongHinhHoc;

public class Rectangle extends Shape {
   private double width, length = 1.0;
    Rectangle (){
    }
    Rectangle (double width, double length){
        this.width = width;
        this.length = length;
    }
public  Rectangle (double width, double length, String color, boolean isFilled) {
        super(color,isFilled);
        this.width = width;
        this.length = length;
}
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea () {
        return this.length*this.width;
    }
    public double getPerimeter(){
        return (this.length+this.width)/2;
    }
    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
    }
}
