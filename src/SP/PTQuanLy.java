package SP;

public interface PTQuanLy<S> {
    void themSanPham(S s);

    int xemChiTietSanPham(String maSP);

    void suaThongTinSanPham(String maSP, SanPham sanPham);

    void xoaSanPham(String maSP);

    void toanBoSanPham();

    int xemChiTietSanPham2(String s);
}
