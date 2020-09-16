package Chuong2.bai1;

public class In_chu implements Runnable {
    @Override
    public void run() {

        for (int i = 65; i < 91; i++) {
            System.out.println("(4) Chu Hoa thu " + (i - 64) + " la:" + (char) i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }

    }
}
