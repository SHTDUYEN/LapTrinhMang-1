package Chuong3;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.Scanner;

public class URLConnDemo {
    public static void main(String[] args) throws IOException {
        int c;
        Scanner scanner = new Scanner(System.in);
//        URL hp = new URL("https://www.facebook.com");
                URL hp = new URL("https://thanhnien.vn");
        URLConnection hpCon = hp.openConnection();
        System.out.println("Date: " + new Date(hpCon.getDate()));
        System.out.println("Content-Type: " + hpCon.getContentType());
        System.out.println("Expires: " + hpCon.getExpiration());
        System.out.println("Last-Modified: " + hpCon.getLastModified());
        int len = hpCon.getContentLength();
        System.out.println("Content-Length: " + len);
        if (len > 0) {
            System.out.println("==noi dung==");
            try (InputStream input = hpCon.getInputStream()) {
                int i = len;
                while (((c = input.read()) != -1) && i-- > 0) {
                    System.out.print((char) c);
                    if (c == '>')
                        System.out.println();
                }
            }
        } else {

        }

    }
}
