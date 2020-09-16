package Chuong2.Bai6;

public class GiaoDienRunnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Call("ping",1000));
        t1.start();
        Thread t2 = new Thread(new Call("pong",333));
        t2.start();
    }
}
class Call implements Runnable{
    String text;
int delay;

    public Call(String text, int delay) {
        this.text = text;
        this.delay = delay;
    }

    @Override
    public void run() {
      for (int i =0;i<15;i++){
          System.out.println(text);
          try{
              Thread.sleep(delay);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }

    }
}
