package ss4_class_and_subject.exercise.fan;

public class Fan {
    //xây dựng lớp fan(quạt)
    final int SLOW=1;
    final int MEDIUM=2;
    final int FAST=3;
    private int speed= SLOW;
    private boolean on=false;
    private double radius=5;
    private String color="blue";

    public int getSLOW(){
        return SLOW;
    }
    public int getMEDIUM(){
        return MEDIUM;
    }
    public int getFAST(){
        return FAST;
    }

    public void setSpeed(int newSpeed){
        this.speed=newSpeed;
    }
    public int getSpeed(){
        return speed;
    }

    public void setOn(boolean status){
        this.on=status;
    }
    public boolean getOn(){
        return on;
    }

    public void setRadius(double newRadius){
        this.radius=newRadius;
    }
    public double getRadius(){
        return radius;
    }

    public void setColor(String newColor){
        this.color=newColor;
    }
    public String getColor(){
        return color;
    }

    public boolean isOn(){
        return this.getOn();
    }

    public Fan(){
    }

    public String toString() {
        if (isOn()) {
            return "speed: " + getSpeed() + ", color: " + getColor() + ", radius: " + getRadius() + ", fan is on!";
        }

        return "color: " + getColor() + ", radius: " + getRadius() + ", fan is off!";
    }

}
