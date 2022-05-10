package FileTong;

import SP.SanPham;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class FileSanPhamcsv {
//    ghi file
    public void wirteFileSanPham(List<SanPham>sanPhamList) throws IOException {
        FileWriter fw2 = new FileWriter("D:\\Oppmodum2\\OnTap3\\src\\FileTong\\SanPham.csv");
        BufferedWriter bw2 = new BufferedWriter(fw2);
        String str2 = "";
        for (SanPham sanPham: sanPhamList) {
            str2 += sanPham.getTenSP() + ","+ sanPham.getMaSP() + "," + sanPham.getGiaSP() + ","+sanPham.getHSD() + "\n";
        }
        bw2.write(str2);
        bw2.close();

    }


//    dooc file

    public List<SanPham> readFileSanPham(List<SanPham>sanPhamList) throws IOException {
        FileReader fr = new FileReader("D:\\Oppmodum2\\OnTap3\\src\\FileTong\\SanPham.csv");
        Scanner sc =  new Scanner(fr);
        while (sc.hasNext()){
            String line = sc.nextLine();
            String[] arr = line.split(",");
            sanPhamList.add(new SanPham(arr[0], arr[1], arr[2],arr[3]));
        }
        sc.close();
        return sanPhamList;
    }

}
