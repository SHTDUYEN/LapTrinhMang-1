package Chuong3;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) throws IOException {
        URL u;
        String thisLine;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhapap dia chi url");
        String ten = scanner.nextLine();
        u=new URL(ten);
//        DataInputStream dis = new DataInputStream(u.openStream());
//        InetAddress inetAddress = InetAddress.getByAddress(u);
//        while((thisLine=dis.readLine())!=null)
//
//            System.out.println(thisLine);
        System.out.println("Ten file: "+u.getFile());
        System.out.println("Ten host: "+u.getHost());
        System.out.println("So hieu cong: "+u.getPort());
        System.out.println("Kieu giao thuc: "+u.getProtocol());
    }
}
