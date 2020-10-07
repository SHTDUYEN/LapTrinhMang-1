package Chuong2.bai3;

import java.io.IOException;
import java.util.Random;
class number{
    private int itemp;

    public number(int itemp) {
        this.itemp = itemp;
    }

    public int getItemp() {
        return itemp;
    }

    public void setItemp(int itemp) {
        this.itemp = itemp;
    }
}
class Thread1 extends Thread{
    number temp;
    public Thread1(number temp){
        this.temp=temp;
        start();
    }
    public synchronized void run(){
        Random rd = new Random();
        for (;;) {
            temp.setItemp(1 + rd.nextInt(20));
            System.out.println("Thread 1: " + temp.getItemp());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Thread2 extends Thread{
    number temp;

    public Thread2(number temp) {
        this.temp = temp;
        start();
    }
    public synchronized void run(){
        for (;;) {
            System.out.println("Thread 2: " + temp.getItemp() * temp.getItemp());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Bai3 {
    public static void main(String[] args) throws IOException {
        number temp = new number(0);
        Thread1 thread1 = new Thread1(temp);
        Thread2 thread2 = new Thread2(temp);
        System.out.println("Nhan enter de ngat");
        System.in.read();
        thread1.stop();
        thread2.stop();
    }
}
