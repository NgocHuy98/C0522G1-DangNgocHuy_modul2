package ss6_Inheritance.exercise.exercise3.model3;

import java.util.Arrays;

public class Point {
    private float x=0.0f;
    private float y=0.0f;

    public Point(){

    }

    public Point(float x,float y){
        this.x=x;
        this.y=y;
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
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }

    public float[] getXY(){
        return new float[]{getX(), getY()};
    }
    public String toString(){
        return "[ x, y ] = "+ Arrays.toString(getXY());
    }

}
