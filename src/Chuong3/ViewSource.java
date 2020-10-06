package Chuong3;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ViewSource {
    public static void main(String[] args) throws IOException {
        URL u;
        String thisLine;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhapap dia chi url");
        String ten = scanner.nextLine();
        u=new URL(ten);
        DataInputStream dis = new DataInputStream(u.openStream());
        while((thisLine=dis.readLine())!=null)
            System.out.println(thisLine);
    }
}
