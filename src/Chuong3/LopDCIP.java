package Chuong3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class LopDCIP {
    public static void main(String[] args) throws UnknownHostException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap host name");
        String ten = scanner.nextLine();
        InetAddress host =  InetAddress.getByName(ten);
        System.out.println("Host name: "+host.getHostName());
        System.out.println("Dia chi: "+host.getHostAddress());
        byte b[] = host.getAddress();
        System.out.println(b);
        int i = b[0]>=0?b[0]:256+b[0];
        if (i>=1 & i<=126)
            System.out.println(host+" thuoc lop A");
        else
            if ((i<=191)&(i>=128))
                System.out.println(host+" thuoc lop B");
            else
                if ((i<=223)&(i>=192))
                    System.out.println(host +" thuoc lop C");
    }
}
