package SP;

import FileTong.FileSanPhamcsv;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class QuanLySanPham implements PTQuanLy<SanPham> {
    FileSanPhamcsv fileSanPhamcsv = new FileSanPhamcsv();
    private List<SanPham> sanPhamList = new ArrayList<>();
    private List<SanPham> quanLySanPhamList = new ArrayList<>();

    public List<SanPham> getSanPhamList() {
        return sanPhamList;
    }

    public QuanLySanPham() throws Exception {
        quanLySanPhamList = fileSanPhamcsv.readFileSanPham(sanPhamList);
    }

    @Override
    public void themSanPham(SanPham sanPham) {
        sanPhamList.add(sanPham);

    }


    @Override
    public int xemChiTietSanPham(String maSP) {
        for (int i = 0; i < sanPhamList.size(); i++) {
            if (this.sanPhamList.get(i).getMaSP().equals(maSP)) {
                System.out.println(sanPhamList.get(i));
                return i;
            }
        }
        return -1;
    }


    @Override
    public void suaThongTinSanPham(String maSP, SanPham sanPham) {
        int indexOf = xemChiTietSanPham2(maSP);
        if (indexOf == -1) {
            System.out.println("khong co");
        } else {
            sanPhamList.set(xemChiTietSanPham2(maSP), sanPham);
        }


    }

    @Override
    public void xoaSanPham(String maSP) {
        int indexOf = xemChiTietSanPham(maSP);
        if (indexOf == -1) {
            System.out.println("khooong cooo !");
        } else {
            sanPhamList.remove(indexOf);
        }

    }

    @Override
    public void toanBoSanPham() {
        for (int i = 0; i < sanPhamList.size(); i++) {
            System.out.println(this.sanPhamList.get(i));
        }

    }

    @Override
    public int xemChiTietSanPham2(String ma) {
        for (int i = 0; i < sanPhamList.size(); i++) {
            if (this.sanPhamList.get(i).getMaSP().equals(ma)) {
                return i;
            }
        }
        return -1;
    }

}
