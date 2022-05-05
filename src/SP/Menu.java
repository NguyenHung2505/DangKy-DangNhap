package SP;

import TaiKhoan.QuanLyUser;
import TaiKhoan.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
       QuanLySanPham quanLySanPham = new QuanLySanPham();
        QuanLyUser quanLyUser = new QuanLyUser();
        Scanner sc = new Scanner(System.in);
        int luaChon = 0;

        do{
            System.out.println("---MENU---");
            System.out.println("lua chon chuc nang");
            System.out.println(
                    "1. dang nhap \n"
                    +"2. dang ky \n"
                    +"3. hien"
            );
            luaChon = sc.nextInt();
            sc.nextLine();
            if(luaChon==1){
                System.out.println("dang nhap ");
                System.out.println("nhap userName"); String tenSP = sc.nextLine();
                System.out.println("nhap passworl"); String maSP = sc.nextLine();
                User user1 = new User();
                quanLyUser.themTaiKhoan(user1);
            }else if(luaChon==3){
                System.out.println("hien thi");
                quanLyUser.hienThi();

            }

        }while (luaChon!=0);
    }
}
