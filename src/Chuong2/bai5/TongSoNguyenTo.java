package Chuong2.bai5;

public class TongSoNguyenTo implements Runnable {
    public static int sum = 0;

    @Override
    synchronized public void run() {
        boolean resume = true;
        while (resume) {
            if (main.ban) {
                for (int i = 0; i < main.list_Prime.size(); i++) {
                    sum = sum + main.list_Prime.get(i);
                    System.out.println("Thread (2) is runing...");
                }
                System.out.println("Tong cac so nguyen to: " + sum);
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}