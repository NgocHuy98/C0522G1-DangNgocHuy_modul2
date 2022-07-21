package ss15_exception_debug.exercise.model;

public class Triangle {
    private double firstEdge;
    private double secondEdge;
    private double thirdEdge;

    public Triangle() {
    }

    public Triangle(double firstEdge, double secondEdge, double thirdEdge)throws IllegalRightTriangleException {
        if (firstEdge <= 0 || secondEdge <= 0 || thirdEdge <= 0) {
            throw new IllegalRightTriangleException("Canh cua tam giac phai lon hon 0");
        } else if (firstEdge + secondEdge <= thirdEdge
                   || firstEdge + thirdEdge <= secondEdge
                   || secondEdge + thirdEdge <= firstEdge) {
            throw new IllegalRightTriangleException("Canh cua tam giac phai thoa man a + b > c \n" +
                    "a + c > b \n" +
                    "b + c > a");
        } else {
            this.firstEdge = firstEdge;
            this.secondEdge = secondEdge;
            this.thirdEdge = thirdEdge;
        }
    }

    public double getFirstEdge() {
        return firstEdge;
    }

    public void setFirstEdge(double firstEdge) {
        this.firstEdge = firstEdge;
    }

    public double getSecondEdge() {
        return secondEdge;
    }

    public void setSecondEdge(double secondEdge) {
        this.secondEdge = secondEdge;
    }

    public double getThirdEdge() {
        return thirdEdge;
    }

    public void setThirdEdge(double thirdEdge) {
        this.thirdEdge = thirdEdge;
    }

    @Override
    public String toString() {
        return "Triangle: " +
                "firstEdge = " + firstEdge +
                ", secondEdge = " + secondEdge +
                ", thirdEdge = " + thirdEdge ;
    }
}
