package SP;

import TaiKhoan.QuanLyUser;
import TaiKhoan.User;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws IOException {
       QuanLySanPham quanLySanPham = new QuanLySanPham();
        QuanLyUser quanLyUser = new QuanLyUser();
        Scanner sc = new Scanner(System.in);
        int luaChon;

        do{
            System.out.println("---MENU---");
            System.out.println("lua chon chuc nang");
            System.out.println(
                    "1. dang nhap \n"
                    +"2. dang ky \n"
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
                FileWriter fw1 = new FileWriter("D:\\Oppmodum2\\OnTap3\\src\\FileTong\\User.csv");
                BufferedWriter bw1 = new BufferedWriter(fw1);
                bw1.write(quanLyUser.ghiFile());
                bw1.close();

            }else if (luaChon==1){
                System.out.println("nhap userName"); String userName = sc.nextLine();
                System.out.println("nhap password"); String password = sc.nextLine();
                if (quanLyUser.viTri(userName,password)!=-1){
                    do{
                        System.out.println("---MENU---");
                        System.out.println("lua chon chuc nang");
                        System.out.println(
                                        "3. them san pham \n"
                                        +"4. hien thi cac san pham hien co :\n"
                                        +"5. tim san pham \n"
                                        +"6. thay the san pham moi \n"
                                        +"7. xoa san pham \n"
                                        +"0. thoat chuong trinh  "

                        );
                        luaChon = sc.nextInt();
                        sc.nextLine();
                        if(luaChon==3){
                            System.out.println("nhap thong tin san pham :");
                            System.out.println("nhap ten san pham"); String tenSP = sc.nextLine();
                            System.out.println("nhap ma san pham"); String maSP = sc.nextLine();
                            System.out.println("nhap gia san pham"); String giaSP = sc.nextLine();
                            System.out.println("nhap HSD san pham"); String HSD = sc.nextLine();
                            SanPham sanPham = new SanPham(tenSP,maSP,giaSP,HSD);
                            quanLySanPham.themSanPham(sanPham);
                        }else if(luaChon==4){
                            System.out.println("cac san pham hien co :");
                            quanLySanPham.toanBoSanPham();
                        }else if(luaChon==5){
                            System.out.println("nhap maSP de xem thong tin san pham"); String maSP1 = sc.nextLine();
                            quanLySanPham.xemChiTietSanPham(maSP1);
                        }else if(luaChon==6){
                            System.out.println("nhap ma san pham de thay doi"); String maSP2 = sc.nextLine();
                            System.out.println("nhap thong tin san pham :");
                            System.out.println("nhap ten san pham"); String tenSP = sc.nextLine();
                            System.out.println("nhap ma san pham"); String maSP = sc.nextLine();
                            System.out.println("nhap gia san pham"); String giaSP = sc.nextLine();
                            System.out.println("nhap HSD san pham"); String HSD = sc.nextLine();
                            SanPham sanPham = new SanPham(tenSP,maSP,giaSP,HSD);
                            quanLySanPham.suaThongTinSanPham(maSP2,sanPham);

                        }else if(luaChon==7){
                            System.out.println("nhap ma san pham muon xoa");String maSP3 = sc.nextLine();
                            quanLySanPham.xoaSanPham(maSP3);
                        }


                    }while (luaChon!=0);

                }else System.out.println("chua co tai khoan");
            }

        }while (luaChon!=0);
    }
}
