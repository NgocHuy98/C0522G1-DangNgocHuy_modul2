package ss10_list.bt_them.model;

public class XeMay extends PhuongTien {
    private int congSuat;

    public XeMay(){
    }

    public XeMay(String bienSo, String tenHangXe, String namSX, String chuXe,int congSuat){
        super(bienSo, tenHangXe, namSX, chuXe);
        this.congSuat=congSuat;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "XeMay{" +
                "congSuat=" + congSuat +
                '}'+" "+super.toString();
    }
}
