package ss10_list.bt_them.model;

public class XeTai extends PhuongTien{
    private int trongTai;

    public XeTai(){
    }

    public XeTai(String bienSo, String tenHangXe, String namSX, String chuXe,int trongTai){
        super(bienSo, tenHangXe, namSX, chuXe);
        this.trongTai=trongTai;
    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai{" +
                "trongTai=" + trongTai +
                '}'+" "+super.toString();
    }
}
