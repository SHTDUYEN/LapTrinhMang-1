package Chuong2.bai1;

public class main {
    public static int n = 10;

    public static void main(String[] args) {//throws InterruptedException {

        System.out.println("Main thread running..");

        Thread thread1 = new Thread(new So_le());
        Thread thread2 = new Thread(new So_chan());
        Thread thread3 = new Thread(new In_so());
        Thread thread4 = new Thread(new In_chu());
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
