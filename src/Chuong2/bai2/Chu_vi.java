package Chuong2.bai2;

public class Chu_vi implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        boolean resume = true;
        int dai,rong;
        while(resume) {
            dai = Nhap_2_SoThuc.dai;
            rong = Nhap_2_SoThuc.rong;
            if (dai!=0 && rong !=0) {
                int chuvi = (dai + rong)*2;
                main.chuvi = chuvi;
                System.out.println("Chu vi la:" + chuvi);
                resume = false;
            }
            else System.out.println("Chay lai buoc 2!");
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}