package ss10_list.exercise.newbt.controller;


import ss10_list.exercise.newbt.service.IStudentService;
import ss10_list.exercise.newbt.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private Scanner scanner = new Scanner(System.in);
    private IStudentService iStudentService = new StudentService();

    public void menuStudent() {
        do {
            int choose;
            while (true) {
                try {
                    System.out.println("Chao mung ban den voi quan ly hoc sinh \n" +
                            "1. Them moi hoc sinh \n" +
                            "2. Xoa hoc sinh \n" +
                            "3. Xem danh sach hoc sinh \n" +
                            "4. Tim kiem hoc sinh theo id \n" +
                            "5. Tim kiem hoc sinh theo ten \n" +
                            "6. Sap xep hoc sinh theo ten \n" +
                            "7. Quay ve menu chinh.");
                    choose = Integer.parseInt(scanner.nextLine());
                    break;

                } catch (NumberFormatException e) {
                    System.out.println("vui long nhap so");
                }
            }

            switch (choose) {
                case 1:
                    iStudentService.addStudent();
                    break;
                case 2:
                    iStudentService.removeStudent();
                    break;
                case 3:
                    iStudentService.displayAllStudent();
                    break;
                case 4:
                    iStudentService.findStudent();
                case 5:
                    iStudentService.findName();
                    break;
                case 6:
                    iStudentService.sortName();
                    break;
                case 7:
                    return;

            }
        } while (true);


    }
}
