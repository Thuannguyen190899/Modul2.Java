package _Module2_java._3_Array.exercise._6_inheritance.excise.e2;

public class Point3D extends Point2D {
    float z = 0.0f;
    Point3D (){}
    Point3D (float x, float y, float z){
        this.x =x;
        this.y = y;
         this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void  setXYZ (float x, float y, float z){
        getX();
        getY();
        this.z = z;
    }
    public float[] getXYZ() {
        float [] array = new float[] {getX(),getY(),z};
        return array;
    }

    @Override
    public String toString() {
        return "Point3D ("  +
                "x = " + x +
                ", y = " + y +
                ", z = " + z +
                ')' ;
    }

}
