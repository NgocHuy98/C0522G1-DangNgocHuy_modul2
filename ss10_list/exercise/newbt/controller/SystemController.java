package ss10_list.exercise.newbt.controller;


import java.util.Scanner;

public class SystemController {
    public static void menuSystemController() {
        StudentController studentController = new StudentController();
        TeacherController teacherController = new TeacherController();
        Scanner scanner = new Scanner(System.in);
        do {
            int choose;
            while (true) {
                try {
                    System.out.println("Chao mung ban den voi Codegym. \n" +
                            "1.Quan ly hoc sinh.\n" +
                            "2. Quan ly giang vien. \n " +
                            "3. Thoat");

                    System.out.print("Moi ban nhap lua chon: ");
                    choose = Integer.parseInt(scanner.nextLine());
                    break;

                } catch (NumberFormatException e) {
                    System.out.println("vui long nhap so");
                }
            }

            switch (choose) {
                case 1: {
                    studentController.menuStudent();
                    break;
                }
                case 2: {
                    teacherController.menuTeacher();
                }
                case 3: {
                    System.exit(1);
                }
            }

        } while (true);
    }
}
