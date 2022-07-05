package ss3_array_and_method_in_array.exercise;
import java.util.Scanner;
public class SumOfNumberInArr2D {
    //Tổng các số trong 1 cột
    public static void main(String[] args) {
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
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();

        }
        int sum=0;
        for ( i = 0; i < arr.length; i++) {
            for (int j = 0; j < 1; j++) {
                    sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
