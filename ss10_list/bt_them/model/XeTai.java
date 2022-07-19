package ss10_list.bt_them.model;

public class XeTai extends PhuongTien{
    private double trongTai;

    public XeTai(){
    }

    public XeTai(String bienSo, String tenHangXe, int namSX, String chuXe,double trongTai){
        super(bienSo, tenHangXe, namSX, chuXe);
        this.trongTai=trongTai;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai " +
                " trongTai = " + trongTai +
                " "+super.toString();
    }
}
