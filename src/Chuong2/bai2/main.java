package Chuong2.bai2;

public class main {
    public static int chuvi;
    public static int dientich;
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Nhap_2_SoThuc());
        Thread thread2 = new Thread(new Chu_vi());
        Thread thread3 = new Thread(new Dien_tich());
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
