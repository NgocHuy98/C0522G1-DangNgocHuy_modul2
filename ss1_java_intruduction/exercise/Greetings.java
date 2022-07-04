package ss1_java_intruduction.exercise;
import java.util.Scanner;
public class Greetings {
    //hiển thị lời chào
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.print("Hello: "+name);
    }
}

