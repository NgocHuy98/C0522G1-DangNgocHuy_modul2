package ss7_abstract_iterface.exercise.exercise2.model2;

public class Square extends Shape {
    private double side = 1;
    public Square(){
    }

    public Square(double side) {
        this.side = side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled){
        super(color,filled);
        this.side = side;
    }

    public double getSide(){
        return this.side;
    }

    public double getArea(){
        return getSide()*getSide();
    }

    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
    @Override
    public String howToColor() {
        return "Color all four sides.";
    }
}
