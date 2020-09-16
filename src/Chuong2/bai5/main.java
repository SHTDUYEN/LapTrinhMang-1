package Chuong2.bai5;

import java.util.ArrayList;

public class main {
    public static ArrayList<Integer> list_Prime = new ArrayList<>();
    public static boolean ban = false;

    public static void main(String[] args) {
        Thread thread1 = new Thread(new SoNguyenTo());
        Thread thread2 = new Thread(new TongSoNguyenTo());
        thread1.start();
        thread2.start();
    }
}
