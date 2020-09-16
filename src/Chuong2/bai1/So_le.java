package Chuong2.bai1;

public class So_le implements Runnable {
    private int n;

    @Override
    public void run() {

        boolean resume = true;
        while (resume) {
            n = main.n;
            if (n != 0) {
                for (int i = 1; i < n; i++) {
                    if (i % 2 != 0) {
                        System.out.println(" (1) So le nho hon " + n + " la:" + i);
                    }
                }
                resume = false;
            } else {
                System.out.println("Chay lai buoc 1 !!!");
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }

    }

}
