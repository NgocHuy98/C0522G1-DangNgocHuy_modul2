package ss7_abstract_iterface.practice.practice2.model2;

    public class Circle extends Shape {
        private double radius = 1.0;

        public Circle() {
        }

        public Circle(double radius) {
            this.radius = radius;
        }

        public Circle(double radius, String color, boolean filled) {
            super(color, filled);
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return Math.PI * getRadius() * getRadius();
        }

        public double getPerimeter() {
            return Math.PI * 2 * getRadius();
        }

        public String display() {
            return "A Circle with radius=" + getRadius()
                    + ", area = " + getArea()
                    + ", perimeter " + getPerimeter()
                    + ", which is a subclass of " + super.toString();
        }
    }

