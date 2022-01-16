package _Module2_java._3_Array.exercise._6_inheritance.excise.e2;

public class Point2D {
    float x = 0.0f;
    float y = 0.0f;

    Point2D() {
    }

    Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    float[] arr = new float [2];

    public float getXY() {
        return arr[2];
    }

    @Override
    public String toString() {
        return "Point2D (" +
                "x = " + x +
                ", y = " + y +
                ')';
    }

}
