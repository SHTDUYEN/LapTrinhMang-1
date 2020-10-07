package Chuong2.bai2;

import java.util.Scanner;

class HinhChuNhat {
    private float chieuDai;
    private float chieuRong;
    private float chuVi;
    private float dienTich;


    public float getChuVi() {
        return chuVi;
    }

    public void setChuVi(float chuVi) {
        this.chuVi = chuVi;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public float getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(float chieuDai) {
        this.chieuDai = chieuDai;
    }

    public float getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(float chieuRong) {
        this.chieuRong = chieuRong;
    }
}

class Thread1 extends Thread {
    HinhChuNhat hinhChuNhat ;

    public Thread1(HinhChuNhat hinhChuNhat) {
        System.out.println("Thread 1 duoc tao.");
        this.hinhChuNhat = hinhChuNhat;
        start();

    }

    public synchronized void run() {

        Scanner scanner = new Scanner(System.in);
        float canh;
        do{
            System.out.print("Nhap chieu dai: ");
            canh = scanner.nextFloat();
        }while (canh <=0);
        hinhChuNhat.setChieuDai(canh);

        do{
            System.out.print("Nhap chieu rong: ");
            canh = scanner.nextFloat();
        }while (canh <=0);
        hinhChuNhat.setChieuRong(canh);

        System.out.println("Thread1 da xong");

    }
}

class Thread2 extends Thread{
    HinhChuNhat hinhChuNhat;


    public Thread2(HinhChuNhat hinhChuNhat) {
        System.out.println("Thread 2 duoc tao.");
        this.hinhChuNhat = hinhChuNhat;
        start();
    }

    @Override
    public synchronized void run() {
        while (hinhChuNhat.getChieuRong()==0 ||hinhChuNhat.getChieuDai()==0) {
            System.out.println("Thread2 cho du lieu.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        hinhChuNhat.setChuVi((hinhChuNhat.getChieuDai() + hinhChuNhat.getChieuRong()) * 2);
        System.out.println("Thread2 da xong");
    }

}

class Thread3 extends Thread {
    HinhChuNhat hinhChuNhat;

    public Thread3(HinhChuNhat hinhChuNhat) {
        System.out.println("Thread 3 duoc tao.");
        this.hinhChuNhat = hinhChuNhat;
        start();
    }

    public synchronized void run() {
        while (hinhChuNhat.getChieuDai()==0||hinhChuNhat.getChieuRong()==0) {
            System.out.println("Thread3 cho du lieu.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        hinhChuNhat.setDienTich(hinhChuNhat.getChieuDai() * hinhChuNhat.getChieuRong());
        System.out.println("Thread3 da xong");
    }
}

public class Bai2 {
    public static void main(String[] args) {
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        Thread1 thread1 = new Thread1(hinhChuNhat);
        Thread2 thread2 = new Thread2(hinhChuNhat);
        Thread3 thread3 = new Thread3(hinhChuNhat);

        while (hinhChuNhat.getChuVi()==0||hinhChuNhat.getDienTich()==0){
            System.out.println("Thread main cho du lieu.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Chu vi: "+hinhChuNhat.getChuVi());
        System.out.println("Dien tich: "+hinhChuNhat.getDienTich());
        //các luồng vẫn chạy song song
    }

}
