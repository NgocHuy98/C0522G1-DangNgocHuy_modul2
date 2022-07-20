package ss14_sort_algorithm.exercise.insertion_sort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];

        for (int i = 0; i < list.length; i++) {
            System.out.println("Nhap phan tu thu " + i + " : ");
            list[i] = scanner.nextInt();
        }
        System.out.println("mang vua tao: " + Arrays.toString(list));
        insertionSort(list);

    }
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            System.out.println("lay  " + array[i]);
            int key = array[i];
            int j;
            for (j = i - 1; j >= 0 && array[j] > key; j--) {
                System.out.println(array[j] + " > " + key);
                System.out.println("hoan doi " + array[j + 1] + " cho " + array[j]);
                array[j + 1] = array[j];
            }
            array[j + 1] = key;
            System.out.println(Arrays.toString(array));
        }
    }
}
