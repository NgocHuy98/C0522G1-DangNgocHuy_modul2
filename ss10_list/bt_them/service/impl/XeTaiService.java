package ss10_list.bt_them.service.impl;

import ss10_list.bt_them.model.XeTai;
import ss10_list.bt_them.service.IXeTaiService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeTaiService implements IXeTaiService {
    private static List<XeTai> xeTaiList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    @Override
    public void addXeTai() {
        XeTai xeTai = infoXeTai();
        xeTaiList.add(xeTai);
        System.out.println("Them xe may thanh cong");
    }


    @Override
    public void displayXeTai() {
        for (XeTai xeTai : xeTaiList) {
            System.out.println(xeTai);
        }
    }

    @Override
    public void removeXeTai() {
        System.out.println("Nhap vao bien so cua xe can xoa: ");
        String bienSoXoa = sc.nextLine();
        boolean kiemTra = false;
        for (XeTai xeTai : xeTaiList) {
            if (xeTai.getBienSo() == bienSoXoa) {
                System.out.println(" Ban cao chac muon xoa khong ? \n" +
                        "1. Co \n" +
                        "2. Khong");
                int kiemTraCoKhong = Integer.parseInt(sc.nextLine());
                if (kiemTraCoKhong == 1) {
                    xeTaiList.remove(xeTai);
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
    public void findXeTai() {
        System.out.println("Nhap vao bien so cua xe can tim: ");
        String bienSoTim = sc.nextLine();
        boolean bienTam = false;

        for (XeTai xeTai : xeTaiList) {
            if (bienSoTim == xeTai.getBienSo()) {
                System.out.println(xeTai);
                bienTam = true;
                break;
            }
        }
        if (!bienTam) {
            System.out.println("Không tìm thấy!");
        }
    }

    private static XeTai infoXeTai() {
        System.out.print("Nhap vao bien so xe: ");
        String bienSo = sc.nextLine();

        System.out.print("Nhap vao hang san xuat: ");
        String tenHangXe = sc.nextLine();

        System.out.print("Nhap vao nam san xuat: ");
        int namSX = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap vao chu so huu: ");
        String chuXe = sc.nextLine();

        System.out.print("Nhap vao trong tai: ");
        double trongTai = Double.parseDouble(sc.nextLine());

        XeTai xeTai = new XeTai(bienSo, tenHangXe, namSX, chuXe, trongTai);
        return xeTai;

    }
}
