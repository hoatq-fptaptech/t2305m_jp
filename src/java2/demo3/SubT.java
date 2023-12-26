package java2.demo3;

public class SubT extends Thread{
    @Override
    public void run() {
        try{
            for (int i=0;i<20;i++){
                System.out.println("subT i = "+i);
                Thread.sleep(1000);
            }
        }catch (Exception e){

        }
    }
}
