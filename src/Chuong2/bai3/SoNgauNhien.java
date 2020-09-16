package Chuong2.bai3;

import java.util.Random;

public class SoNgauNhien implements Runnable {

    @Override
    synchronized public void run() {
        Random rd = new Random();
        boolean resume = true;
        while (resume) {
            int number = rd.nextInt(20) + 1;
            BinhPhuong.n = number;
            System.out.println("So vua duoc tao la: " + number);
            //resume = false;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }


    }

}
