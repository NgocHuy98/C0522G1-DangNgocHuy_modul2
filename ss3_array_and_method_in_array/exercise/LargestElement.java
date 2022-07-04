package ss3_array_and_method_in_array.exercise;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hàng: ");
        int row = sc.nextInt();
        System.out.println("Nhập cột: ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Nhập phần tử[%d][%d]", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
        int max = arr[0][0];
        System.out.println("Ma trận vừa tạo: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Phần tử lớn nhất: " + max);
    }
}
