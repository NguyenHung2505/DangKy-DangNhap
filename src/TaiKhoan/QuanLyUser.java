package TaiKhoan;

import SP.PTQuanLy;
import SP.SanPham;

import java.util.ArrayList;
import java.util.List;

public class QuanLyUser {
    List<User> userList = new ArrayList<>();


    public void themTaiKhoan(User user) {
        userList.add(user);
    }

    public void hienThi() {
        for (int i = 0; i < userList.size(); i++) {
            System.out.println(this.userList.get(i));
        }
    }

    public int viTri(String userName, String passWorl) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getUserName().equals(userName) && userList.get(i).getPassWorl().equals(passWorl)) {
                return i;
            }
        }
        return -1;
    }

//    public void sua(String userName , User user){
//        int intdexOf = viTri(userName);
//        if(intdexOf==-1){
//            System.out.println("khong thay");
//        }else {
//            userList.set(viTri(userName),user);
//        }
//    }

    public void xoa(String userName) {
        userList.remove(userName);

    }

    public String ghiFile() {
        String str = "";
        for (User user: userList) {
            str +="userName:   " + user.getUserName() + " passworl:   "+ user.getPassWorl() + "\n";
        }
        return str;
    }


}
