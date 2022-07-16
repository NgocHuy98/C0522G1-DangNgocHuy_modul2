package ss10_list.bt_them.controller;

import ss10_list.bt_them.service.IOToService;
import ss10_list.bt_them.service.IXeTaiService;
import ss10_list.bt_them.service.IXemayService;
import ss10_list.bt_them.service.impl.OToService;
import ss10_list.bt_them.service.impl.XeMayService;
import ss10_list.bt_them.service.impl.XeTaiService;

import java.util.Scanner;

public record PhuongTienCanTimKiem() {
    private static Scanner scanner = new Scanner(System.in);
    private static IOToService iOtoService=new OToService() ;
    private static IXeTaiService iXeTaiService=new XeTaiService();
    private static IXemayService iXemayService=new XeMayService();

    public void danhSachTimKiem() {
        do{
            System.out.println("Moi ban chon:\n"+
                    "1. Tim xe tai \n" +
                    "2. Tim xe o to \n" +
                    "3. Tim xe may \n" +
                    "4. Quay ve menu chinh.");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iXeTaiService.findXeTai();
                case 2:
                    iOtoService.findOTo();
                    break;
                case 3:
                    iXemayService.findXeMay();
                    break;
                case 4:
                    return;
            }
        } while (true);

    }

}
