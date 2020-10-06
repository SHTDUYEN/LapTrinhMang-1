package Chuong2.Bai6;

import java.io.IOException;

public class NgatTuyenDoan extends Thread{
    public void run(){
        System.out.println("Toi cam thay buon ngu. Danh thuc toi sau tam gio");
        try {
            Thread.sleep(1000*60);
            System.out.println("Do la mot giac ngu ngan");
        } catch (InterruptedException e) {
            System.err.println("chi nam phut nua thoi ...");
        }
    }

    public static void main(String[] args) throws IOException {
        Thread sleeply = new NgatTuyenDoan();
        sleeply.start();
        System.out.println("Nhan enter de ngat luong");
        System.in.read();
        sleeply.interrupt();
    }
}
