package ss7_abstract_iterface.exercise.exercise1.controller1;
import ss7_abstract_iterface.exercise.exercise1.model1.Circle;
import ss7_abstract_iterface.exercise.exercise1.model1.Rectangle;
import ss7_abstract_iterface.exercise.exercise1.model1.Shape;
import ss7_abstract_iterface.exercise.exercise1.model1.Square;

public class MainShape {

    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0]=new Circle(5,"red",true);
        shape[1]=new Rectangle(4,5,"orange",true);
        shape[2]=new Square(3,"blue",false);

        double percent=100;
        for(Shape shape1:shape){
            System.out.println(shape1+"\n Area: "+shape1.getArea());
        }
        System.out.println("Percent = "+percent+"%");

        System.out.println("After resize: ");
        for (Shape shape1:shape){
            shape1.resize(percent);
            System.out.println(shape1+"\n New area: " + shape1.getArea());
        }
    }
}
