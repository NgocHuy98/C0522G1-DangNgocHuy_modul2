package ss10_list.exercise.newbt.service.impl;

import ss10_list.exercise.newbt.model.Student;
import ss10_list.exercise.newbt.service.IStudentService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentService<E> implements IStudentService {

    public static List<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    static {
        studentList.add(new Student(6, "Dang Ngoc Huy", "20/02/1998", "nam", "C05", 10));
        studentList.add(new Student(2, "Dang Ngoc Ty", "20/02/1968", "nam", "C05", 9));
        studentList.add(new Student(3, "Le Huy Hoang", "20/02/1918", "nam", "C05", 8));
        studentList.add(new Student(4, "Chau Tinh Tri", "20/02/1999", "nam", "C05", 7));
        studentList.add(new Student(5, "Le Hoang Tri", "20/02/1978", "nam", "C05", 8));
        studentList.add(new Student(1, "Dang Ngoc Huy", "20/02/1998", "nam", "C05", 10));

    }


    public void addStudent() {
        Student student = infoStudent();
        studentList.add(student);
        System.out.println("Them moi thanh cong!. ");
    }

    @Override
    public void removeStudent() {
        System.out.println("Moi ban nhap id can xoa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());

        boolean isFlag = false;
        for (Student student : studentList) {
            if (student.getId() == idRemove) {
                System.out.println(" Ban co chac muon xoa hay khong? \n" +
                        "1. Co \n" +
                        "2. Khong");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1) {
                    studentList.remove(student);
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
    public void displayAllStudent() {
        for (Student student : studentList) {
            System.out.println("Danh sach hoc sinh: " + student);
        }
    }

    @Override
    public void findStudent() {
        System.out.println("Nhap vao id cua sinh vien can tim: ");
        int idFind = Integer.parseInt(scanner.nextLine());

        boolean isFlag = false;
        for (Student student : studentList) {
            if (idFind == student.getId()) {
                System.out.println(student);
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
        System.out.println("Nhap vao ten cua sinh vien can tim: ");
        String name = scanner.nextLine();

        boolean isFlag = false;
        for (Student student : studentList) {
            if (student.getName().contains(name)) {
                System.out.println(student);
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
        for (int i = 0; i < studentList.size() - 1 && isSwap; i++) {
            isSwap = false;
            for (int j = 0; j < studentList.size() - 1 - i; j++) {
                if ((studentList.get(j).getName().compareTo(studentList.get(j + 1).getName())) > 0) {
                    Collections.swap(studentList, j, j + 1);
                    isSwap = true;

                }
                if ((studentList.get(j).getName().compareTo(studentList.get(j + 1).getName()) == 0)) {
                    if (studentList.get(j).getId() > studentList.get(j + 1).getId()) {
                        Collections.swap(studentList, j, j + 1);
                        isSwap = true;

                    }
                }


            }
        }
    }

    public static Student infoStudent() {
        System.out.print("Nhap id: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhap name: ");
        String name = scanner.nextLine();

        System.out.print("Nhap ngay sinh: ");
        String dateOfBirth = scanner.nextLine();


        System.out.print("Nhap gioi tinh: ");
        String gender = scanner.nextLine();

        System.out.print("Nhap lop: ");
        String classroom = scanner.nextLine();

        System.out.print("Nhap diem: ");
        int point = Integer.parseInt(scanner.nextLine());

        Student student = new Student(id, name, dateOfBirth, gender, classroom, point);
        return student;
    }
}













