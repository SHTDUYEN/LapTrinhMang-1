package Chuong2.Bai6;

class Callme2 {
//    synchronized void call (String msg,int num){
    void call (String msg,int num){
        System.out.print("["+num+msg);
        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(num+"]");
    }
}
class Caller2 implements Runnable{
    String msg;
    Callme2 target;
    Thread t;
    int num;
    public Caller2(Callme2 tar, String s, int num){
        target=tar;
        msg=s;
        t= new Thread(this);
        t.start();
        this.num=num;
    }
    @Override
    public void run() {
        synchronized (target) {
            target.call(msg, num);
        }
    }
}
public class DongBo2 {
    public static void main(String[] args) {
        Callme2 target = new Callme2();
        Callme2 target1 = new Callme2();
        Caller2 ob1 = new Caller2(target,"Nguyen",1);
        Caller2 ob2 = new Caller2(target,"Duyen",1);
        Caller2 ob4 = new Caller2(target1,"Test",2);
        Caller2 ob5 = new Caller2(target1,"train",2);
        Caller2 ob6 = new Caller2(target1,"I'm IT ",2);
        Caller2 ob3 = new Caller2(target,"Hello",1);
    }
}
