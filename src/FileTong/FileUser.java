package FileTong;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileUser {
    public static void main(String[] args) throws IOException {
        FileWriter fa = new FileWriter("D:\\Oppmodum2\\OnTap3\\src\\FileTong\\User.csv");
        BufferedWriter ba = new BufferedWriter(fa);
    }
}
