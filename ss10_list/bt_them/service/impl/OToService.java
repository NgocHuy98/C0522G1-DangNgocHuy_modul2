package ss10_list.bt_them.service.impl;

import ss10_list.bt_them.model.OTo;
import ss10_list.bt_them.service.IOToService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OToService implements IOToService {
    private static List<OTo> oToList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    @Override
    public void addOTo() {
        OTo oTo = infoOTo();
        oToList.add(oTo);
        System.out.println("Them xe may thanh cong");
    }


    @Override
    public void displayOTo() {
        for (OTo oTo : oToList) {
            System.out.println(oTo);
        }
    }

    @Override
    public void removeOTo() {
        System.out.println("Nhap vao bien so cua xe can xoa: ");
        String bienSoXoa = sc.nextLine();
        boolean kiemTra = false;
        for (OTo oTo : oToList) {
            if (oTo.getBienSo() == bienSoXoa) {
                System.out.println(" Ban cao chac muon xoa khong ? \n" +
                        "1. Co \n" +
                        "2. Khong");
                int kiemTraCoKhong = Integer.parseInt(sc.nextLine());
                if (kiemTraCoKhong == 1) {
                    oToList.remove(oTo);
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
    public void findOTo() {
        System.out.println("Nhap vao bien so cua xe can tim: ");
        String bienSoTim = sc.nextLine();
        boolean bienTam = false;

        for (OTo oTo : oToList) {
            if (bienSoTim == oTo.getBienSo()) {
                System.out.println(oTo);
                bienTam = true;
                break;
            }
        }
        if (!bienTam) {
            System.out.println("Không tìm thấy!");
        }
    }

    private static OTo infoOTo() {
        System.out.print("Nhap vao bien so xe: ");
        String bienSo = sc.nextLine();

        System.out.print("Nhap vao hang san xuat: ");
        String tenHangXe = sc.nextLine();

        System.out.print("Nhap vao nam san xuat: ");
        int namSX = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap vao chu so huu: ");
        String chuXe = sc.nextLine();

        System.out.print("Nhap vao so cho ngoi: ");
        int soChoNgoi = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap vao kieu xe xe: ");
        String kieuXe = sc.nextLine();

        OTo oTo = new OTo(bienSo, tenHangXe, namSX, chuXe, soChoNgoi, kieuXe);
        return oTo;

    }
}
