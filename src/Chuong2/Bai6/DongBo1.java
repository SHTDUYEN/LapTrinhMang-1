package Chuong2.Bai6;

class Callme {
    synchronized void call (String msg,int num){
//    void call (String msg,int num){
        System.out.println("["+num+msg);
        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(num+"]");
    }
}
class Caller implements Runnable{
    String msg;
    Callme target;
    Thread t;
    int num;
    public Caller(Callme tar, String s, int num){
        target=tar;
        msg=s;
        t= new Thread(this);
        t.start();
        this.num=num;
    }
    @Override
    public void run() {
        target.call(msg,num);
    }
}
public class DongBo1 {
    public static void main(String[] args) {
        Callme target = new Callme();
        Callme target1 = new Callme();
        Caller ob1 = new Caller(target,"Nguyen",1);
        Caller ob2 = new Caller(target,"Duyen",1);
        Caller ob4 = new Caller(target1,"Test1",2);
        Caller ob5 = new Caller(target1,"train1",2);
        Caller ob6 = new Caller(target1,"I'm IT ",2);
        Caller ob3 = new Caller(target,"Hello",1);
    }
}
