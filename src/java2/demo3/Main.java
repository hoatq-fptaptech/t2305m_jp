package java2.demo3;

public class Main {
    public static void main(String[] args){
        SubT st = new SubT();
//        st.setName("ABC");
        st.start();

        SubR sr = new SubR();
        Thread tr = new Thread(sr);
        tr.start();

        try{
            for (int i=0;i<10;i++){
                System.out.println("main i = "+i);
                Thread.sleep(1000);
            }
        }catch (Exception e){

        }
        System.out.println("Main DONE");
    }
}
