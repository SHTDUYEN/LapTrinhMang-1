package Chuong3;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class ViewSource2 {
    public static void main(String[] args) throws IOException {
        String thisLine;
        URL u;
        URLConnection uc;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap dia chi URL: ");
        String ten = scanner.nextLine();
        u=new URL(ten);
        uc=u.openConnection();
        DataInputStream theHtml = new DataInputStream(uc.getInputStream());
        while((thisLine=theHtml.readLine())!=null)
            System.out.println(thisLine);
        theHtml.close();
    }
}
