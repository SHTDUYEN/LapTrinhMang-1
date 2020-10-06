package Chuong2.Bai6;

public class Account2 {
    private double balance;
    boolean ban = false; //xác định tài nguyên chưa có tuyến trình nào chiếm giữ

    Account2() {
        balance = 0;
    }

    public synchronized void setBalance(double amount) {
        if (ban) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance = amount;
        ban = true;
        notify();
    }

    public synchronized double getBalance() {
        if (!ban) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        ban = false;
        notify();
        return balance;
    }
}

class XuLy implements Runnable {
    Account2 acc;
    long amount;
    String name;
    Thread t;

    public XuLy(Account2 acc, long amount, String name) {
        this.acc = acc;
        this.amount = amount;
        this.name = name;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        acc.setBalance(amount);
        System.out.println("So tien cua tk " + name + " la: " + acc.getBalance());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Account2 acc = new Account2();
        XuLy xl1 = new XuLy(acc, 15, "Nguyen");
        XuLy xl2 = new XuLy(acc, 30, "Duyen");
        XuLy xl3 = new XuLy(acc, 45, "Anh");
    }
}
