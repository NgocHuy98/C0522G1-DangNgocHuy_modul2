package ss7_abstract_iterface.exercise.exercise2.model2;


    public class Circle extends Shape implements Colorable{
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

    }

