package Chuong2.bai3;

public class BinhPhuong implements Runnable {
    public static int n;

    @Override
    synchronized public void run() {

        boolean resume = true;
        while (resume) {
            if (n > 0) {
                System.out.println("Binh phuong so vua duoc tao la: "
                        + n * n);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }

    }

}
