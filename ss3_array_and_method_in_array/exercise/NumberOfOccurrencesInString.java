package ss3_array_and_method_in_array.exercise;

import java.util.Scanner;

public class NumberOfOccurrencesInString {
    //Số lần số hiện của ký tự trong chuỗi
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String str = sc.nextLine();
        System.out.println("Nhập kí tự cần đếm: ");
        char character = sc.nextLine().charAt(0);
        int count = 0;
        int i;
        for (i = 0; i < str.length(); i++) {
            if (character == str.charAt(i)) {
                count++;
            }
        }
        if (count != 0) {
            System.out.println("Số lần xuất hiện của kí tự " + character + ": " + count);
        } else {
            System.out.println("Kí tự không có trong chuỗi");
        }
    }
}
