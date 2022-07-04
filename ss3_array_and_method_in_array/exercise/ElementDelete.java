package ss3_array_and_method_in_array.exercise;

import java.util.Scanner;

public class ElementDelete {
    // xóa phần tử trong mảng
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length, i;
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            length = sc.nextInt();
        } while (length <= 0);

        int[] arr = new int[length];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (i = 0; i < length; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Nhập số nguyên : ");
        int numbers = sc.nextInt();
        int index=0;
        for ( i = 0; i < arr.length; i++) {
            if (arr[i] != numbers) {
                arr[index] = arr[i];
                index++;
            }
        }
        length = index;
        System.out.println("Mảng còn lại sau khi xóa phần tử " + numbers + " là: ");
        for (i = 0; i < length; i++) {
            System.out.print(arr[i] + "\t");

        }
    }
}
