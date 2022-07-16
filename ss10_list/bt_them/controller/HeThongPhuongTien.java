package ss10_list.bt_them.controller;

import java.util.Scanner;

public class HeThongPhuongTien {
    public static void phuongTien() {
        PhuongTienCanXoa phuongTienCanXoa = new PhuongTienCanXoa();
        PhuongTienCanThem phuongTienCanThem = new PhuongTienCanThem();
        PhuongTienCanHienThi phuongTienCanHienThi = new PhuongTienCanHienThi();
        PhuongTienCanTimKiem phuongTienCanTimKiem= new PhuongTienCanTimKiem();
        Scanner scanner = new Scanner(System.in);
        System.out.println("He thong quan li phuong tien. \n" +
                "1. Them moi phuong tien.\n" +
                "2. Hien thi phuong tien.\n" +
                "3. Xoa phuong tien.\n" +
                "4. Tim kiem theo bien so xe \n" +
                "5. thoat.");

        System.out.print("Moi ban nhap lua chon: ");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1: {
                phuongTienCanThem.danhSachThem();
                break;
            }
            case 2: {
                phuongTienCanHienThi.danhSachHienThi();
                break;
            }
            case 3: {
                phuongTienCanXoa.danhSachXoa();
                break;
            }
            case 4: {
                phuongTienCanTimKiem.danhSachTimKiem();
                break;
            }
            case 5: {
                System.exit(1);
            }
        }
    }
}
