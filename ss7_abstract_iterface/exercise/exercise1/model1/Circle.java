package ss7_abstract_iterface.exercise.exercise1.model1;


public class Circle extends Shape implements Resizeable {
    private double radius=1.0;

    public Circle(){
    }

    public Circle(double radius){
        this.radius=radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*getRadius()*getRadius();
    }

    public double getPerimeter(){
        return Math.PI*2*getRadius();
    }

    @Override
    public String toString(){
        return "A Circle with radius=" + getRadius()
                +", area = "+getArea()
                +", perimeter "+getPerimeter()
                + ", which is a subclass of " + super.toString();
    }
    @Override
    public void resize(double percent) {
        setRadius(getRadius() + getRadius() * percent / 100);
    }
}

