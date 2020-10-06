package Chuong2.bai1;

class InSoLe implements Runnable {
    private int n;

    InSoLe(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 1) {
                System.out.println("In so le: " + i);
            }
        }
    }
}

class InSoChan implements Runnable {
    int n;

    public InSoChan(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println("In so chan: " + i);
            }
        }
    }
}

class InCacSo implements Runnable {
    int n;

    public InCacSo(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 1; i <= n; i++) {
            System.out.println("In cac so: " + i);
        }
    }
}

class InChu implements Runnable {

    @Override
    public void run() {
        for (int i = 'A'; i <= 'Z'; i++) {
            System.out.println("In cac chu in hoa: " + (char) i);
        }
    }
}

public class Bai1 {
    public static void main(String[] args) {//throws InterruptedException {

        System.out.println("Main thread running..");
        int n = 26;
        Thread thread1 = new Thread(new InSoLe(n));
        Thread thread2 = new Thread(new InSoChan(n));
        Thread thread3 = new Thread(new InCacSo(n));
        Thread thread4 = new Thread(new InChu());
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
