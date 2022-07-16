package ss10_list.bt_them.service.impl;

import ss10_list.bt_them.model.XeMay;
import ss10_list.bt_them.service.IXemayService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeMayService implements IXemayService {
    private static List<XeMay> xeMayList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    @Override
    public void addXeMay() {
        XeMay xeMay = infoXeMay();
        xeMayList.add(xeMay);
        System.out.println("Them xe may thanh cong");
    }


    @Override
    public void displayXeMay() {
        for (XeMay xeMay : xeMayList) {
            System.out.println(xeMay);
        }
    }

    @Override
    public void removeXeMay() {
        System.out.println("Nhap vao bien so cua xe can xoa: ");
        String bienSoXoa = sc.nextLine();
        boolean kiemTra = false;
        for (XeMay xeMay : xeMayList) {
            if (xeMay.getBienSo() == bienSoXoa) {
                System.out.println(" Ban cao chac muon xoa khong ? \n" +
                        "1. Co \n" +
                        "2. Khong");
                int kiemTraCoKhong = Integer.parseInt(sc.nextLine());
                if (kiemTraCoKhong == 1) {
                    xeMayList.remove(xeMay);
                    System.out.println("Xoa thanh cong!.");
                }
                kiemTra = true;
                break;

            }
        }
        if (!kiemTra) {
            System.out.println("Khong tim thay");
        }
    }

    @Override
    public void findXeMay() {
        System.out.println("Nhap vao bien so cua xe can tim: ");
        String bienSoTim = sc.nextLine();
        boolean bienTam = false;

        for (XeMay xeMay : xeMayList) {
            if (bienSoTim == xeMay.getBienSo()) {
                System.out.println(xeMay);
                bienTam = true;
                break;
            }
        }
        if (!bienTam) {
            System.out.println("Không tìm thấy!");
        }
    }

    private static XeMay infoXeMay() {
        System.out.print("Nhap vao bien so xe: ");
        String bienSo = sc.nextLine();

        System.out.print("Nhap vao hang san xuat: ");
        String tenHangXe = sc.nextLine();

        System.out.print("Nhap vao nam san xuat: ");
        int namSX = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap vao chu so huu: ");
        String chuXe = sc.nextLine();

        System.out.print("Nhap vao cong xuat: ");
        int congSuat = Integer.parseInt(sc.nextLine());

        XeMay xeMay = new XeMay(bienSo, tenHangXe, namSX, chuXe, congSuat);
        return xeMay;

    }

}
