package ss4_class_and_subject.exercise;

public class QuadraticEquation {
    double numberA, numberB, numberC;

    public QuadraticEquation(double numberA, double numberB, double numberC) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.numberC = numberC;
    }

    private double getNumberA() {
        return this.numberA;
    }

    private double getNumberB() {
        return this.numberB;
    }

    private double getNumberC() {
        return this.numberC;
    }

    public double getDelta() {
        return getNumberB() * getNumberB() - 4 * getNumberA() * getNumberC();
    }

    public double getRoot1() {
        return (-getNumberB() - Math.sqrt(getDelta())) / (2 * getNumberA());
    }

    public double getRoot2() {
        return (-getNumberB() + Math.sqrt(getDelta())) / (2 * getNumberA());
    }

    public String getDisplay() {
        if (getDelta() > 0) {
            return "pt có 2 nghiệm phân biệt x1 = " + getRoot1() + "\n" + "x2 = " + getRoot2();
        }
        if (getDelta() == 0) {
            return "Pt có nghiệm kép x1 = x2 = " + getRoot1();
        }
        return "pt vô nghiệm";
    }

}
