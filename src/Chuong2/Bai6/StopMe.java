package Chuong2.Bai6;

import java.io.IOException;

public class StopMe extends Thread{
    public void run(){
        int count =1;
        System.out.println("Toi co the dem. Xem toi di!");
        for (;;){
            System.out.println(count++ +" ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Thread counter = new StopMe();
        counter.start();
        System.out.println("Nhan enter de dung luong dem");
        System.in.read();
        counter.stop();
    }
}
