package Chuong2.bai1;

public class So_chan implements Runnable {
    private int n;

    @Override
    public void run() {
        // TODO Auto-generated method stub
        boolean resume = true;
        while (resume) {
            n = main.n;
            if (n != 0) {
                for (int i = 1; i < n; i++) {
                    if (i % 2 == 0) {
                        System.out.println(" (2) So chan nho hon " + n + " la:" + i);
                    }
                }
                resume = false;
            } else {
                System.out.println("Chay lai buoc 2 !!!");
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }

    }
}
