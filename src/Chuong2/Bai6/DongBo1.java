package Chuong2.Bai6;

public class DongBo1 {
    public static void main(String[] args) {
Caller cl = new Caller("Nguyen");
Thread t1 = new Thread(new CallMe(cl,1000));
t1.start();
Thread t2 = new Thread(new CallMe(cl,500));
t2.start();
    }
}
class CallMe implements Runnable{
Caller cl ;
int delay;

    public CallMe(Caller cl, int delay) {
        this.cl = cl;
        this.delay = delay;
    }

    @Override
    public void run() {
synchronized (cl){
    for (int i = 0; i < 5; i++) {
        System.out.println(cl.name +" " + delay);
        try{
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
    }
}
class Caller{
    String name;

    public Caller(String name) {
        this.name = name;
    }
}
