package ss10_list.exercise.newbt.service.impl;

import ss10_list.exercise.newbt.model.Teacher;
import ss10_list.exercise.newbt.service.ITeacherService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService<E> implements ITeacherService {
    public static List<Teacher> teacherList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void addTeacher() {
        Teacher teacher = infoTeacher();
        teacherList.add(teacher);
        System.out.println("Them moi thanh cong!. ");

    }

    @Override
    public void removeTeacher() {
        System.out.println("Moi ban nhap id can xoa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Teacher teacher : teacherList) {
            if (teacher.getId() == idRemove) {
                System.out.println(" Ban co chac muon xoa hay khong? \n" +
                        "1. Co \n" +
                        "2. Khong");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1) {
                    teacherList.remove(teacher);
                    System.out.println("Xoa thanh cong!.");
                }
                isFlag = true;
                break;

            }
        }
        if (!isFlag) {
            System.out.println("Khong tim thay");
        }


    }

    @Override
    public void displayAllTeacher() {
        for (Teacher teacher : teacherList) {
            System.out.println("Danh sach hoc sinh: " + teacher);
        }
    }

    public static Teacher infoTeacher() {
        System.out.print("Nhap id: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhap name: ");
        String name = scanner.nextLine();

        System.out.print("Nhap ngay sinh: ");
        String dateOfBirth = scanner.nextLine();

        System.out.print("Nhap gioi tinh: ");
        String gender = scanner.nextLine();

        System.out.print("Nhap chuyen mon: ");
        String specialize = scanner.nextLine();

        Teacher teacher = new Teacher(id, name, dateOfBirth, gender, specialize);
        return teacher;
    }
}
