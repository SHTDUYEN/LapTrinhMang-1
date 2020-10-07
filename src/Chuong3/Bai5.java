package Chuong3;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bai5 {
    public static void main(String[] args) throws IOException {
        Set<String> listDis= new HashSet<>();
        listDis.add("https://truyentranh.com");
        listDis.add("https://www.facebook.com");
        listDis.add("www.google.com.vn");
        //https://thanhnien.vn
        URL u;
        String thisLine;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhapap dia chi url");
        String ten = scanner.nextLine();
        u=new URL(ten);
        for (int i = 0 ; i < listDis.size(); i++) {
            if(listDis.contains(ten)){
                System.out.println("url cua ban da bi cam");
                return;
            }
        }
        DataInputStream dis = new DataInputStream(u.openStream());
        while((thisLine=dis.readLine())!=null)
            System.out.println(thisLine);
    }

}
