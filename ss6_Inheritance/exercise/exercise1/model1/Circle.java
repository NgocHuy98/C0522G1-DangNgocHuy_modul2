package ss6_Inheritance.exercise.exercise1.model1;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return Math.PI*getRadius()*getRadius();
    }

    public double getPerimeter(){
        return Math.PI*2*getRadius();
    }

    public String toString(){
        return "Circle has radius " +getRadius()
                + " area = "+getArea()
                +" perimeter "+getPerimeter()
                +" with color of "+getColor();
    }
}
