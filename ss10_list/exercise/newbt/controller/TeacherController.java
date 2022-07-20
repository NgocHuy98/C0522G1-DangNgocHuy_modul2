package ss10_list.exercise.newbt.controller;

import ss10_list.exercise.newbt.service.ITeacherService;
import ss10_list.exercise.newbt.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private Scanner scanner = new Scanner(System.in);
    private ITeacherService iTeacherService=new TeacherService();
    public void menuTeacher() {
        do{
            System.out.println("Chao mung ban den voi quan ly giang vien \n"+
                    "1. Them moi giang vien \n" +
                    "2. Xoa giang vien \n" +
                    "3. Xem danh sach giang vien \n" +
                    "4. Tim giang vien theo id \n"+
                    "5. Tim giang vien theo ten \n"+
                    "6. Sap xep giang vien theo ten \n"+
                    "7. Quay ve menu chinh.");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iTeacherService.addTeacher();
                    break;
                case 2:
                    iTeacherService.removeTeacher();
                    break;
                case 3:
                    iTeacherService.displayAllTeacher();
                    break;
                case 4:
                    iTeacherService.findTeacher();
                    break;
                case 5:
                    iTeacherService.findName();
                    break;
                case 6:
                    iTeacherService.sortName();
                    iTeacherService.displayAllTeacher();
                    break;

                case 7:
                    return;
            }
        } while (true);



    }


}
