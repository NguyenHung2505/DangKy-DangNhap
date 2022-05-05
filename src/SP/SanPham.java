package SP;

public class SanPham {
    private String tenSP;
    private String maSP;
    private String giaSP;
    private String HSD;

    public SanPham() {
    }

    public SanPham(String tenSP, String maSP, String giaSP, String HSD) {
        this.tenSP = tenSP;
        this.maSP = maSP;
        this.giaSP = giaSP;
        this.HSD = HSD;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(String giaSP) {
        this.giaSP = giaSP;
    }

    public String getHSD() {
        return HSD;
    }

    public void setHSD(String HSD) {
        this.HSD = HSD;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "tenSP='" + tenSP + '\'' +
                ", maSP='" + maSP + '\'' +
                ", giaSP='" + giaSP + '\'' +
                ", HSD='" + HSD + '\'' +
                '}';
    }
}
