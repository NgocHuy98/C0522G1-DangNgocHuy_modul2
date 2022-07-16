package ss10_list.bt_them.model;

public abstract class PhuongTien {
    private String bienSo;
    private String tenHangXe;
    private String namSX;
    private String chuXe;

    public PhuongTien() {
    }

    public PhuongTien(String bienSo, String tenHangXe, String namSX, String chuXe) {
        this.bienSo = bienSo;
        this.tenHangXe = tenHangXe;
        this.namSX = namSX;
        this.chuXe = chuXe;
    }

    public String getBienSo() {
        return bienSo;
    }

    public void setBienSo(String bienSo) {
        this.bienSo = bienSo;
    }

    public String getTenHangXe() {
        return tenHangXe;
    }

    public void setTenHangXe(String tenHangXe) {
        this.tenHangXe = tenHangXe;
    }

    public String getNamSX() {
        return namSX;
    }

    public void setNamSX(String namSX) {
        this.namSX = namSX;
    }

    public String getChuXe() {
        return chuXe;
    }

    public void setChuXe(String chuXe) {
        this.chuXe = chuXe;
    }

    @Override
    public String toString() {
        return "PhuongTien{" +
                "bienSo='" + bienSo + '\'' +
                ", tenHangXe='" + tenHangXe + '\'' +
                ", namSX='" + namSX + '\'' +
                ", chuXe='" + chuXe + '\'' +
                '}';
    }
}
