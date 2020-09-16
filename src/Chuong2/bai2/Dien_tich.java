package Chuong2.bai2;

public class Dien_tich implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        boolean resume = true;
        int dai,rong;
        while(resume) {
            dai = Nhap_2_SoThuc.dai;
            rong = Nhap_2_SoThuc.rong;
            if (dai!=0 && rong!=0) {
                int dientich = dai*rong;
                main.dientich = dientich;
                System.out.println("Dien Tich la: " + dientich);
                resume = false;
            }
            else System.out.println("Chay lai buoc 3!");
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
