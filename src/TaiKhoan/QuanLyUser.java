package TaiKhoan;

import FileTong.FileUser;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class QuanLyUser {
    FileUser fileUser = new FileUser();
    private List<User> userList = new ArrayList<>();
    private List<QuanLyUser> quanLyUserList = new ArrayList<>();

    public QuanLyUser() throws FileNotFoundException {
        userList = fileUser.readFileUser(userList);
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

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

    public void xoaUser(String userName, String passWorl) {
        int intdexOff = viTri(userName, passWorl);
        if (intdexOff == -1) {
            System.out.println("khong co");
        } else {
            userList.remove(intdexOff);
        }
    }


//    public String ghiFile() {
//        String str = "";
//        for (User user: userList) {
//            str += user.getUserName() + ","+ user.getPassWorl() + "\n";
//        }
//        return str;
//    }


}
