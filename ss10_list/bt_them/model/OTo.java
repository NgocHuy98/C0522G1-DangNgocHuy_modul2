package ss10_list.bt_them.model;

public class OTo extends PhuongTien{
    private int soChoNgoi;
    private String kieuXe;

    public OTo(){
    }

    public OTo(String bienSo, String tenHangXe, int namSX, String chuXe, int soChoNgoi, String kieuXe){
        super(bienSo, tenHangXe, namSX, chuXe);
        this.soChoNgoi=soChoNgoi;
        this.kieuXe=kieuXe;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "Oto: " +
                " soChoNgoi = " + soChoNgoi +
                ", kieuXe = " + kieuXe +
                " "+super.toString();
    }
}
