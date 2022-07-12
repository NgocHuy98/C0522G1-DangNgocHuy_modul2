package ss8_cleancode.practice.practice1;
public class Calculator {
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculate(int firstNumber, int secondNumber, char operator) {
        switch (operator) {
            case ADDITION:
                return firstNumber + secondNumber;
            case SUBTRACTION:

                return firstNumber - secondNumber;
            case MULTIPLICATION:
                return firstNumber * secondNumber;
            case DIVISION:
                if (secondNumber != 0)
                    return firstNumber / secondNumber;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
