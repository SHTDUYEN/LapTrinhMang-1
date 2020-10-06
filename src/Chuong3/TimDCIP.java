package Chuong3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TimDCIP {
    public static void main(String[] args) throws UnknownHostException {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap hostname");
        String ten = nhap.nextLine();
        InetAddress host = InetAddress.getByName(ten);
        System.out.println("Host name: "+host.getHostName());
        System.out.println("Dia chi: "+host.getHostAddress());
    }
}
