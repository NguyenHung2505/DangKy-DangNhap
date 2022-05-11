package SP;

import FileTong.FileSanPhamcsv;
import FileTong.FileUser;
import TaiKhoan.QuanLyUser;
import TaiKhoan.User;

import java.io.*;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) throws IOException {

        QuanLySanPham quanLySanPham = new QuanLySanPham();
        QuanLyUser quanLyUser = new QuanLyUser();
        FileUser fileUser = new FileUser();
        FileSanPhamcsv fileSanPhamcsv = new FileSanPhamcsv();
        Scanner sc = new Scanner(System.in);
        int luaChon;
        int luaChon1;

        do {
            System.out.println("---MENU---");
            System.out.println("Lua chon chuc nang");
            System.out.println(
                    "(1.) ===  Dang nhap === \n"
                            + "(2.) ---  Dang ky ---\n"
                            + "(3.) --- Xoa tai khoan ---\n"
                            + "(0.) --- Thoat chuong trinh ---"
            );
            luaChon = sc.nextInt();
            sc.nextLine();
            if (luaChon == 2) {
                System.out.println("Dang ky :");
                System.out.println("Nhap userName :");
                String userName = sc.nextLine();
                System.out.println("Nhap passworl :");
                String passWorl = sc.nextLine();
                User user1 = new User(userName, passWorl);
                quanLyUser.themTaiKhoan(user1);
                fileUser.writeFileUser(quanLyUser.getUserList());

            } else if (luaChon == 1) {
                System.out.println("Nhap userName :");
                String userName = sc.nextLine();
                System.out.println("Nhap password :");
                String password = sc.nextLine();

                if (quanLyUser.viTri(userName, password) != -1) {

                    do {

                        System.out.println("---MENU---");
                        System.out.println("Lua chon chuc nang");
                        System.out.println(
                                " (1.) Them san pham \n"
                                        + "(2.) Hien thi cac san pham hien co :\n"
                                        + "(3.) Tim san pham \n"
                                        + "(4.) Thay the san pham moi \n"
                                        + "(5.) Xoa san pham \n"
                                        + "(0.) Quay lai menu dang nhap .   "

                        );
                        luaChon1 = sc.nextInt();
                        sc.nextLine();
                        if (luaChon1 == 1) {
                            System.out.println("Nhap thong tin san pham :");
                            System.out.println("Nhap ten san pham");
                            String tenSP = sc.nextLine();
                            System.out.println("Nhap ma san pham");
                            String maSP = sc.nextLine();
                            System.out.println("Nhap gia san pham");
                            String giaSP = sc.nextLine();
                            System.out.println("Nhap HSD san pham");
                            String HSD = sc.nextLine();
                            SanPham sanPham = new SanPham(tenSP, maSP, giaSP, HSD);
                            quanLySanPham.themSanPham(sanPham);

                            fileSanPhamcsv.wirteFileSanPham(quanLySanPham.getSanPhamList());

                        } else if (luaChon1 == 2) {
                            System.out.println("cac san pham hien co :");
                            quanLySanPham.toanBoSanPham();

                            System.out.println();
                        } else if (luaChon1 == 3) {
                            System.out.println("nhap maSP de xem thong tin san pham");
                            String maSP1 = sc.nextLine();
                            quanLySanPham.xemChiTietSanPham(maSP1);
                        } else if (luaChon1 == 4) {
                            System.out.println("Nhap ma san pham de thay doi :");
                            String maSP2 = sc.nextLine();
                            System.out.println("Nhap thong tin san pham :");
                            System.out.println("Nhap ten san pham :");
                            String tenSP = sc.nextLine();
                            System.out.println("Nhap ma san pham :");
                            String maSP = sc.nextLine();
                            System.out.println("Nhap gia san pham :");
                            String giaSP = sc.nextLine();
                            System.out.println("Nhap HSD san pham :");
                            String HSD = sc.nextLine();
                            SanPham sanPham = new SanPham(tenSP, maSP, giaSP, HSD);
                            quanLySanPham.xemChiTietSanPham(maSP2);
                            quanLySanPham.suaThongTinSanPham(maSP2, sanPham);
                            fileSanPhamcsv.wirteFileSanPham(quanLySanPham.getSanPhamList());
                            System.out.println(" Cap nhat thanh cong !");
                            System.out.println("San pham moi cap nhat : ");
                            quanLySanPham.xemChiTietSanPham(maSP);


                        } else if (luaChon1 == 5) {
                            System.out.println("Nhap ma san pham muon xoa");
                            String maSP3 = sc.nextLine();
                            quanLySanPham.xoaSanPham(maSP3);
                            fileSanPhamcsv.wirteFileSanPham(quanLySanPham.getSanPhamList());
                        }

                    } while (luaChon1 != 0);

                } else System.out.println("Tai khoan nay chua co");
                System.out.println("Moi ban chon phim (2) de dang ky !");
            } else if (luaChon == 3) {
                System.out.println("Nhap userName :");
                String userName3 = sc.nextLine();
                System.out.println("Nhap passWorl :");
                String passWorl3 = sc.nextLine();
                quanLyUser.xoaUser(userName3, passWorl3);
                fileUser.writeFileUser(quanLyUser.getUserList());
            }

        } while (luaChon != 0);
    }
}
