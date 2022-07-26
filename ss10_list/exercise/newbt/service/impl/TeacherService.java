package ss10_list.exercise.newbt.service.impl;


import ss10_list.exercise.newbt.model.Student;
import ss10_list.exercise.newbt.model.Teacher;
import ss10_list.exercise.newbt.service.ITeacherService;

import ss10_list.exercise.newbt.utils.ReadFileTeacher;

import ss10_list.exercise.newbt.utils.WriteFileTeacher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private static final String PATH = "ss10_list/exercise/newbt/file/teacher.txt";

    public static List<Teacher> teacherList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static final String REGEX = "^(((0[1-9]|[12][0-9]|30)[-/](0[13-9]|1[012])|31[-/]" +
            "(0[13578]|1[02])|(0[1-9]|1[0-9]|2[0-8])[-/]02)[-/][0-9]{4}|29[-/]02" +
            "[-/]([0-9]{2}(([2468][048]|[02468][48])|[13579][26])|([13579][26]|[02468]" +
            "[048]|0[0-9]|1[0-6])00))$";

    //    static {
//        teacherList.add(new Teacher(1, "Dang Ngoc Huy", "21/02/1998", "nam", "Toan"));
//        teacherList.add(new Teacher(2, "Ho Hai Hoc", "21/02/1995", "nam", "Ly"));
//        teacherList.add(new Teacher(3, "Dang Quang Anh", "21/02/1995", "nam", "Sinh"));
//        teacherList.add(new Teacher(4, "Dang Van Ti", "21/02/2001", "nam", "Su"));
//        teacherList.add(new Teacher(8, "Chau Tinh Tri", "21/02/1990", "nam", "Dien Anh"));
//        teacherList.add(new Teacher(5, "Chau Tinh Tri", "21/02/1990", "nam", "Dien Anh"));
//    }
    public void writeFile() {
        WriteFileTeacher.writeTeacherFile(PATH, teacherList);
    }

    public void readFile() {
        List<Teacher> list = ReadFileTeacher.readTeacherFile(PATH);
        teacherList.clear();
        teacherList.addAll(list);
    }

    @Override
    public void addTeacher() {
        readFile();
        Teacher teacher = infoTeacher();
        teacherList.add(teacher);
        System.out.println("them moi thanh cong: ");
        writeFile();

    }

    @Override
    public void removeTeacher() {
        readFile();
        System.out.println("Moi ban nhap id can xoa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Teacher teacher : teacherList) {
            if (teacher.getId() == idRemove) {
                int chooseYesNo;
                while (true) {
                    try {
                        System.out.println(" Ban co chac muon xoa hay khong? \n" +
                                "1. Co \n" +
                                "2. Khong");
                        chooseYesNo = Integer.parseInt(scanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Vui long nhap so");
                    }
                }

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
        readFile();
        int idFind;
        while (true) {

            try {
                System.out.println("Nhap vao id cua giang vien can tim: ");
                idFind = Integer.parseInt(scanner.nextLine());
                break;

            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so");
            }
        }

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
        readFile();
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
        readFile();
        boolean isSwap = true;
        for (int i = 0; i < teacherList.size() - 1 && isSwap; i++) {
            isSwap = false;
            for (int j = 0; j < teacherList.size() - 1 - i; j++) {
                if ((teacherList.get(j).getName().compareTo(teacherList.get(j + 1).getName())) > 0) {
                    Collections.swap(teacherList, j, j + 1);
                    isSwap = true;

                }
                if ((teacherList.get(j).getName().compareTo(teacherList.get(j + 1).getName()) == 0)) {
                    if (teacherList.get(j).getId() > teacherList.get(j + 1).getId()) {
                        Collections.swap(teacherList, j, j + 1);
                        isSwap = true;

                    }
                }
            }
        }
    }

    @Override
    public void displayAllTeacher() {
        readFile();
        for (Teacher teacher : teacherList) {
            System.out.println("Danh sach giao vien " + teacher);
        }
    }


    public static String formatName() {
        System.out.print("Nhap ten: ");
        String name = scanner.nextLine();
        String[] arr = name.toLowerCase().trim().split("");
        StringBuilder str = new StringBuilder().append(arr[0].toUpperCase());
        for (int i = 1; i < arr.length; i++) {
            if (!arr[i].equals(" ")) {
                if (arr[i - 1].equals(" ")) {
                    str.append(arr[i].toUpperCase());
                } else {
                    str.append(arr[i]);
                }
            } else if (!arr[i + 1].equals(" ")) {
                str.append(arr[i]);
            }
        }
        return str.toString();
    }


    public static Teacher infoTeacher() {
        int id;
        while (true) {
            try {
                System.out.print("Nhap id: ");
                id = Integer.parseInt(scanner.nextLine());
                for (Teacher teacher : teacherList) {
                    if (teacher.getId() == id) {
                        throw new DuplicateIDException("Trùng ID giang vien!!!");
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!!!");
            } catch (DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }

        String name = formatName();

        String dateOfBirth;
        do {
            System.out.print("Nhap ngay sinh: ");
            dateOfBirth = scanner.nextLine();
            if (dateOfBirth.matches(REGEX)) {
                System.out.println("Ngay sinh hop le");
                break;
            } else {
                System.out.println("Nhập sai, vui long nhap lai");
            }
        } while (true);

        System.out.print("Nhap gioi tinh: ");
        String gender = scanner.nextLine();

        System.out.print("Nhap chuyen mon: ");
        String specialize = scanner.nextLine();

        return new Teacher(id, name, dateOfBirth, gender, specialize);
    }
}
