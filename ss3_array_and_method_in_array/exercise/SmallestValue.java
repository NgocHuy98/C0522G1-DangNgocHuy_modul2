package ss3_array_and_method_in_array.exercise;
import java.util.Arrays;
import java.util.Scanner;
public class SmallestValue {
    //giá trị nhỏ nhất
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        int length = sc.nextInt();
        int[] arr = new int[length];
        int i;
        for ( i = 0; i < length; i++) {
            System.out.printf("Nhập phần từ mảng [%d]", i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Mảng vừa tạo");
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        for ( i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Phần tử nhỏ nhất: " + min);
    }
}
