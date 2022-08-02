package case_study.utils;

import case_study.serviece.AgeInvalidException;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class RegexDate {
    private static final Scanner SCANNER = new Scanner(System.in);

    private static boolean isLeapYear(int year) {
        boolean isDivisible4 = year % 4 == 0;
        boolean isDivisible100 = year % 100 == 0;
        boolean isDivisible400 = year % 400 == 0;

        return (isDivisible4 && !isDivisible100) || isDivisible400;
    }

    public static String getDateOfBirth() {
        String dateOfBirth;
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        double age;
        while (true) {
            try {
                System.out.print("Nhap ngay sinh: ");
                dateOfBirth = SCANNER.nextLine();
                if (!dateOfBirth.matches("(0[1-9]|[12]\\d|3[0-1])/(0[1-9]|1[0-2])/(19\\d{2}|20[01]\\d)")) {
                    throw new AgeInvalidException("Vui long nhap dung dinh dang dd/mm/yyyy!");
                }

                String[] str = dateOfBirth.split("/");
                if (str[1].equals("04") || str[1].equals("06") || str[1].equals("09") || str[1].equals("11")) {
                    if (Integer.parseInt(str[0]) > 30) {
                        throw new AgeInvalidException("Vui long nhap dung so ngay trong thang (thang nay co toi đa 30 ngay)!");
                    }
                } else if (str[1].equals("02")) {
                    if (isLeapYear(Integer.parseInt(str[2]))) {
                        if (Integer.parseInt(str[0]) > 29) {
                            throw new AgeInvalidException("Vui long nhap dung so ngay trong thang (thang 2 co toi đa 29 ngay vi la nam nhuan)!");
                        }
                    } else {
                        if (Integer.parseInt(str[0]) > 28) {
                            throw new AgeInvalidException("Vui long nhap dung so ngay trong thang (thang 2 co toi đa 28 ngay)!");
                        }
                    }
                }

                age = (double) (date.getTime() - dateFormat.parse(dateOfBirth).getTime())/315576E5;
                if (age < 18 || age > 100) {
                    throw new AgeInvalidException("Ngay sinh phai nho hon ngay hien tai 18 nam va nguoi dung khong duoc quq 100 tuoi!");
                }

                return dateOfBirth;

            } catch (AgeInvalidException e) {
                System.out.println(e.getMessage());
            } catch (ParseException e) {
                e.getStackTrace();
            }
        }
    }
}
