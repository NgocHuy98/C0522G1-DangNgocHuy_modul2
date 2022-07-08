package ss6_Inheritance.exercise.exercise2.model2;

import java.util.Arrays;

public class Point3D extends Point {
    private float z=0.0f;

    public Point3D(){

    }

    public Point3D(float z){
        this.z=z;
    }
    public Point3D(float x, float y, float z){
        super(x,y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x,float y, float z){
      super.setXY(x,y);
      this.z=z;
    }
    public float[] getXYZ(){
        return new float[]{super.getX(),super.getY(),getZ()};
    }
    public String toString(){
        return "z = "+getZ()+ "\n"+ "[ x, y, z] = "+ Arrays.toString(getXYZ());
    }
}
