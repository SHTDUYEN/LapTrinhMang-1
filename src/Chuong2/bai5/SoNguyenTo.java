package Chuong2.bai5;

public class SoNguyenTo implements Runnable {
    public static boolean prime(int n) {
        if (n < 2) return false;
        for (int i = 2; i < (n - 1); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    //public static int snt;
    @Override
    synchronized public void run() {
        // TODO Auto-generated method stub
        for (int i = 1; i <= 100; i++) {
            if (prime(i)) {
                Chuong2.bai5.main.list_Prime.add(i);
                System.out.println("Thread (1) is runing...");

            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        Chuong2.bai5.main.ban = true;
    }
}
