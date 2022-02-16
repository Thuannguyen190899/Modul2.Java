package _Module2_java._3_Array.exercise._6_inheritance.excise.e2;

import java.util.Arrays;

public class TestPoint {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3, 8);
        System.out.println(point2D);
        System.out.println(Arrays.toString(point2D.getXY()));
        Point3D point3D = new Point3D(point2D.getX(), point2D.getY(), 5);
        System.out.println(Arrays.toString(point3D.getXYZ()));

    }
}
