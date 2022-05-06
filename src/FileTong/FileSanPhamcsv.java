package FileTong;

import SP.SanPham;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileSanPhamcsv {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\Oppmodum2\\OnTap3\\src\\FileTong\\SanPham.csv");
        BufferedWriter bw = new BufferedWriter(fw);
    }
}
