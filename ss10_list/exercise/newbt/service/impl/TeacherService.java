package ss10_list.exercise.newbt.service.impl;

import ss10_list.exercise.newbt.model.Teacher;
import ss10_list.exercise.newbt.service.ITeacherService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TeacherService<E> implements ITeacherService {
    public static List<Teacher> teacherList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
        teacherList.add(new Teacher(1, "Dang Ngoc Huy", "21/02/1998", "nam", "Toan"));
        teacherList.add(new Teacher(2, "Ho Hai Hoc", "21/02/1995", "nam", "Ly"));
        teacherList.add(new Teacher(3, "Dang Quang Anh", "21/02/1995", "nam", "Sinh"));
        teacherList.add(new Teacher(4, "Dang Van Ti", "21/02/2001", "nam", "Su"));
        teacherList.add(new Teacher(8, "Chau Tinh Tri", "21/02/1990", "nam", "Dien Anh"));
        teacherList.add(new Teacher(5, "Chau Tinh Tri", "21/02/1990", "nam", "Dien Anh"));
    }

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
    public void findTeacher() {
        System.out.println("Nhap vao id cua giang vien can tim: ");
        int idFind = Integer.parseInt(scanner.nextLine());

        boolean isFlag = false;
        for (Teacher teacher : teacherList) {
            if (idFind == teacher.getId()) {
                System.out.println(teacher);
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("Khong tim thay");
        }

    }

    @Override
    public void findName() {
        System.out.println("Nhap vao ten cua giang vien can tim: ");
        String name = scanner.nextLine();

        boolean isFlag = false;
        for (Teacher teacher : teacherList) {
            if (teacher.getName().contains(name)) {
                System.out.println(teacher);
                isFlag = true;

            }
        }
        if (!isFlag) {
            System.out.println("Khong tim thay");
        }

    }

    @Override
    public void sortName() {
        boolean isSwap = true;
        for (int i = 0; i < teacherList.size() - 1 && isSwap; i++) {
            isSwap = false;
            for (int j = 0; j < teacherList.size() - 1 - i; j++) {
                if ((teacherList.get(j).getName().compareTo(teacherList.get(j + 1).getName())) > 0) {
                    Collections.swap(teacherList, j, j + 1);
                    isSwap=true;

                }
                if((teacherList.get(j).getName().compareTo(teacherList.get(j + 1).getName())==0)) {
                    if(teacherList.get(j).getId()>teacherList.get(j+1).getId()){
                        Collections.swap(teacherList, j, j + 1);
                        isSwap=true;

                }
            }
        }
    }
    }

    @Override
    public void displayAllTeacher() {
        for (Teacher teacher : teacherList) {
            System.out.println("Danh sach giao vien " + teacher);
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
