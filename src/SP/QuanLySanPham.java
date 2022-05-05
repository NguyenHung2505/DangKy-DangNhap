package SP;

import java.util.ArrayList;
import java.util.List;

public class QuanLySanPham implements PTQuanLy<SanPham>{
    List<SanPham>sanPhamList = new ArrayList<>();

    @Override
    public void themSanPham(SanPham sanPham) {
        sanPhamList.add(sanPham);

    }

    @Override
    public int xemChiTietSanPham(String maSP) {
        for (int i = 0; i < sanPhamList.size(); i++) {
            if(this.sanPhamList.get(i).getMaSP().equals(maSP)){
                System.out.println(sanPhamList.get(i));
                return i;
            }
        }
        return -1;
    }


    @Override
    public void suaThongTinSanPham(String maSP , SanPham sanPham) {
        int indexOf = xemChiTietSanPham(maSP);
        if(indexOf==-1){
            System.out.println("khong co");
        }else {
            sanPhamList.set(xemChiTietSanPham(maSP),sanPham);
        }



    }

    @Override
    public void xoaSanPham(String maSP) {
        int indexOf = xemChiTietSanPham(maSP);

    }

    @Override
    public void toanBoSanPham() {
        for (int i = 0; i < sanPhamList.size(); i++) {
            System.out.println(this.sanPhamList.get(i));
        }

    }
}
