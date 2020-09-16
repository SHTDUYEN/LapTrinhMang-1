package Chuong2.Bai6;

public class NganHang {
    long balance;

    public NganHang(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long deposit) {
        this.balance += deposit;
    }
}
 class GiaoDich implements Runnable {
NganHang A ;
long deposit;

     public GiaoDich(NganHang a, long deposit) {
         A = a;
         this.deposit = deposit;
     }

     @Override
      public void run() {
         synchronized (A) {


             System.out.println(A.getBalance() + " " + deposit);
             A.setBalance(deposit);
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             System.out.println(A.getBalance()+" Giao dich thanh cong" + deposit);
         }
     }
 }
 class Main {
     public static void main(String[] args) {
         NganHang a =new NganHang(500000);
         Thread t1 = new Thread(new GiaoDich(a,-100000));
         t1.start();
         Thread t2 = new Thread(new GiaoDich(a,300000));
         t2.start();

     }
 }