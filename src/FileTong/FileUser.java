package FileTong;

import TaiKhoan.User;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class FileUser {
    //        đọc file
    public List<User> readFileUser(List<User> userList) throws Exception {
        FileReader fileReader = new FileReader("D:\\Oppmodum2\\OnTap3\\src\\FileTong\\User.csv");
        Scanner scanner = new Scanner(fileReader);
        if (scanner.nextLine() != null) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] arr = line.split(",");
                userList.add(new User(arr[0], arr[1]));
            }
        } else {
            throw new Exception();
        }

        scanner.close();
        return userList;
    }

    public void writeFileUser(List<User> userList) throws IOException {

//        ghi file
        FileWriter fw1 = new FileWriter("D:\\Oppmodum2\\OnTap3\\src\\FileTong\\User.csv");
        BufferedWriter bw1 = new BufferedWriter(fw1);
        String str = "UserName , Password \n";
        for (User user : userList) {
            str += user.getUserName() + "," + user.getPassWorl() + "\n";
        }
        bw1.write(str);
        bw1.close();
        fw1.close();

    }
}

