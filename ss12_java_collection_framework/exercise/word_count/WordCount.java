package ss12_java_collection_framework.exercise.word_count;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class WordCount {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi can kiem tra: ");
        String string = scanner.nextLine();

        String[] array = string.toLowerCase().split(" ");

        for (String key : array) {
            if (!treeMap.containsKey(key)) {
                treeMap.put(key, 1);
            } else {
                int count = treeMap.get(key);
                treeMap.put(key, count + 1);
            }
        }

        System.out.println(treeMap);

        Set<String> stringSet = treeMap.keySet();
        System.out.println("\n So lan xuat hien cua moi tu trong chuoi : ");
        for (String key : stringSet) {
            System.out.println(key + ": " + treeMap.get(key));
        }
    }
}
