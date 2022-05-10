package SP;

import FileTong.FileSanPhamcsv;
import FileTong.FileUser;
import TaiKhoan.QuanLyUser;
import TaiKhoan.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
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

        do{
            System.out.println("---MENU---");
            System.out.println("lua chon chuc nang");
            System.out.println(
                    "1. dang nhap \n"
                    +"2. dang ky \n"
                    +"3.  xoa tai khoan"
            );
            luaChon = sc.nextInt();
            sc.nextLine();
            if(luaChon==2){
                System.out.println("dang ky ");
                System.out.println("nhap userName");
                String userName = sc.nextLine();
                System.out.println("nhap passworl");
                String passWorl = sc.nextLine();
                User user1 = new User(userName,passWorl);
                quanLyUser.themTaiKhoan(user1);
                fileUser.writeFileUser(quanLyUser.getUserList());

            }else if (luaChon==1){
                System.out.println("nhap userName"); String userName = sc.nextLine();
                System.out.println("nhap password"); String password = sc.nextLine();

                if (quanLyUser.viTri(userName,password)!=-1){

                    do{

                        System.out.println("---MENU---");
                        System.out.println("lua chon chuc nang");
                        System.out.println(
                                        "1. them san pham \n"
                                        +"2. hien thi cac san pham hien co :\n"
                                        +"3. tim san pham \n"
                                        +"4. thay the san pham moi \n"
                                        +"5. xoa san pham \n"
                                        +"0. Quay lai menu đăng nhập   "

                        );
                         luaChon1 = sc.nextInt();
                        sc.nextLine();
                        if(luaChon1==1){
                            System.out.println("nhap thong tin san pham :");
                            System.out.println("nhap ten san pham"); String tenSP = sc.nextLine();
                            System.out.println("nhap ma san pham"); String maSP = sc.nextLine();
                            System.out.println("nhap gia san pham"); String giaSP = sc.nextLine();
                            System.out.println("nhap HSD san pham"); String HSD = sc.nextLine();
                            SanPham sanPham = new SanPham(tenSP,maSP,giaSP,HSD);
                            quanLySanPham.themSanPham(sanPham);

                            fileSanPhamcsv.wirteFileSanPham(quanLySanPham.getSanPhamList());

                        }else if(luaChon1==2){
                            System.out.println("cac san pham hien co :");
                            quanLySanPham.toanBoSanPham();

                            System.out.println();
                        }else if(luaChon1==3){
                            System.out.println("nhap maSP de xem thong tin san pham"); String maSP1 = sc.nextLine();
                            quanLySanPham.xemChiTietSanPham(maSP1);
                        }else if(luaChon1==4){
                            System.out.println("nhap ma san pham de thay doi"); String maSP2 = sc.nextLine();
                            System.out.println("nhap thong tin san pham :");
                            System.out.println("nhap ten san pham"); String tenSP = sc.nextLine();
                            System.out.println("nhap ma san pham"); String maSP = sc.nextLine();
                            System.out.println("nhap gia san pham"); String giaSP = sc.nextLine();
                            System.out.println("nhap HSD san pham"); String HSD = sc.nextLine();
                            SanPham sanPham = new SanPham(tenSP,maSP,giaSP,HSD);
                            quanLySanPham.suaThongTinSanPham(maSP2,sanPham);

                        }else if(luaChon1==5){
                            System.out.println("nhap ma san pham muon xoa");String maSP3 = sc.nextLine();
                            quanLySanPham.xoaSanPham(maSP3);
                        }

                    }while (luaChon1!=0);

                }else System.out.println("chua co tai khoan");
            }else if (luaChon==3){
                System.out.println("nhap userName :");String userName3 =sc.nextLine();
                System.out.println("nhap passWorl :");String passWorl3 =sc.nextLine();
                quanLyUser.xoaUser(userName3,passWorl3);
                fileUser.writeFileUser(quanLyUser.getUserList());
            }

        }while (luaChon!=0);
    }
}
