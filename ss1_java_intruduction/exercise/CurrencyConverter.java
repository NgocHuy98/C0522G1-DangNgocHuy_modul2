package ss1_java_intruduction.exercise;

import java.util.Scanner;

public class CurrencyConverter {
    //Chuyển đổi tiền tệ
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter USD: ");
        usd = sc.nextDouble();
        double convert = vnd * usd;
        System.out.printf("Conversion value  %.2f ",convert);
    }
}
