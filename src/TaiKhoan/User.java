package TaiKhoan;

import SP.SanPham;

public class User {
    private String userName;
    private String passWorl;
    private SanPham sanPham;

    public User() {
    }

    public User(String userName, String passWorl) {
        this.userName = userName;
        this.passWorl = passWorl;
    }

    public User(String userName, String passWorl, SanPham sanPham) {
        this.userName = userName;
        this.passWorl = passWorl;
        this.sanPham = sanPham;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWorl() {
        return passWorl;
    }

    public void setPassWorl(String passWorl) {
        this.passWorl = passWorl;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", passWorl='" + passWorl + '\'' +
                '}';
    }
}
