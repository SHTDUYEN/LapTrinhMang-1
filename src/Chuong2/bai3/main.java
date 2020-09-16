package Chuong2.bai3;

public class main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new SoNgauNhien());
        Thread thread2 = new Thread(new BinhPhuong());
        thread1.start();
        thread2.start();
    }
}
