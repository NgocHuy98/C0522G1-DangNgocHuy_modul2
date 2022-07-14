package ss10_list.exercise.newbt.service.impl;

import ss10_list.exercise.newbt.model.Student;
import ss10_list.exercise.newbt.service.IStudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService<E> implements IStudentService {

    public static List<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public void addStudent() {
        Student student = infoStudent();
        studentList.add(student);
        System.out.println("Them moi thanh cong!. ");
    }

    @Override
    public void removeStudent() {
        System.out.println("Moi ban nhap id can xoa: ");
        int idRemove= Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for(Student student: studentList) {
            if(student.getId() == idRemove) {
                System.out.println(" Ban co chac muon xoa hay khong? \n" +
                        "1. Co \n" +
                        "2. Khong");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if(chooseYesNo ==1) {
                    studentList.remove(student);
                    System.out.println("Xoa thanh cong!.");
                }
                isFlag = true;
                break;

            }
        }
        if(!isFlag) {
            System.out.println("Khong tim thay");
        }


    }

    @Override
    public void displayAllStudent() {
        for(Student student: studentList) {
            System.out.println("Danh sach hoc sinh: "+student);
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

        Student student=new Student(id,name,dateOfBirth,gender,classroom,point);
        return student;
    }
}













