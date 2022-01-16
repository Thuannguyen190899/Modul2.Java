package _Module2_java._3_Array.exercise._6_inheritance.excise.e3;

public class MovablePoint extends  Point{
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;
    MovablePoint(){}
    MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    MovablePoint (float x, float y, float xSpeed, float ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed (float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float getSpeed (){
        return 2;
    }

    @Override
    public String toString() {
        return "MovablePoint (" + super.toString()+
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ')';
    }

}
