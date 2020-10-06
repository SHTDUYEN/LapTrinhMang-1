package Chuong2.Bai6;

public class Account1 {
    private double balance;

    void Account1() {
        balance = 0.0;
    }

    public synchronized double getBalance() {
        return balance;
    }

    public synchronized void setBalance(double balance) {
        this.balance = balance;
    }
}

class XuLy1 implements Runnable {
    Account1 tk;
    double st;
    String mag;
    int l;
    Thread t;

    public XuLy1(Account1 tk, double st, String mag) {
        this.tk = tk;
        this.st = st;
        this.mag = mag;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        tk.setBalance(st);//tuyến đoạn 1
        System.out.println("So tien cua tai khoan " + mag + " la: " + tk.getBalance());//tuyến đoạn 2
        tk.setBalance(0);//tuyến đoạn 3
        //1-2-3 đều là tuyến đoạn đồng bộ, chạy song song nhau
        try {
            Thread.sleep(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Account1 tkh = new Account1();
        XuLy1 t1 = new XuLy1(tkh, 15, "Nguyen ");
        XuLy1 t2 = new XuLy1(tkh, 30, "Nguyen1");
        XuLy1 t3 = new XuLy1(tkh, 45, "Nguyen2");
        XuLy1 t4 = new XuLy1(tkh, 25, "Nguyen3");
        //4 tuyến trình trên, mỗi tuyến trình đều có 3 tuyền đoạn chạy đồng bộ, song song nhau
        //và cùng sử dụng chung 1 tài nguyên là Account1 tkh
        //Nên khi 1 tuyến trình vừa thực hiện tuyến đoạn set xong (vd set 15 cho Nguyen)
        // thì 1 tuyến trình khác thực hiên liền tuyến đoạn get (cd get 15 cho Nguyen1)
        //trong khi tuyến đoạn set của tuyến trình đó chưa được thực hiện
        // dẫn đến dữ liệu bị ghi đè không chính xác
    }
}