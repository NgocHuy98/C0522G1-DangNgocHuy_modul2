package ss3_array_and_method_in_array.exercise;

import java.util.Scanner;

public class SumNumberOfDiagonalLine {
    //tổng các số trên đường chéo của ma trận vuông
    public static void main(String[] args) {
        SumNumberOfDiagonalLine teag= new SumNumberOfDiagonalLine();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hàng: ");
        int row = sc.nextInt();
        System.out.println("Nhập cột: ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        int i;
        for ( i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Nhập phần tử[%d][%d]", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
        for ( i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();

        }
        //Em thử dùng k có static;
        int newSum1=teag.sumForwardDiagonal(arr);
        System.out.println("tổng đường chéo thuận : "+newSum1);
        int newSum2=teag.sumReverseDiagonal(arr);
        System.out.println("tổng đường chéo ngược : "+newSum2);
    }

    int sumForwardDiagonal(int[][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];

        }
        return sum;
    }

     int sumReverseDiagonal(int[][] array){
        int newSum = 0;
        for (int i = 0; i < array.length; i++) {
            newSum += array[i][array.length - 1 - i];
        }
        return newSum;
    }
}
