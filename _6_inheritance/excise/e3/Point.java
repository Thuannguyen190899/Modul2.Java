package _Module2_java._3_Array.exercise._6_inheritance.excise.e3;

public class Point {
    float x = 0.0f;
    float y = 0.0f;
    Point(){
    }
    Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float getXY(){
        return 2;
    }

    @Override
    public String toString() {
        return "Point {" +
                "x = " + x +
                ", y = " + y +
                '}';
    }
}
