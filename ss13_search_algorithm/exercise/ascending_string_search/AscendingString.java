package ss13_search_algorithm.exercise.ascending_string_search;

import java.util.LinkedList;
import java.util.Scanner;

public class AscendingString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap chuoi: ");
        String string = scanner.nextLine();

        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list;
        for (int i = 0; i < string.length(); i++) {

            list = new LinkedList<>();
            list.add(string.charAt(i));

            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }

            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }

        for (Character character : max) {
            System.out.print(character);
        }

    }
}
