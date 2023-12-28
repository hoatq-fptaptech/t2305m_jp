package java2.demo4;

public class Main {
    public static void main(String[] args){
        Counter c = new Counter();

        Runnable r = ()->{  // lambda expression
            try {
                for(int i=0;i<20;i++){
//                    synchronized (c){ // synchronize object
                        c.increment();
                        c.print();
//                    }
                    Thread.sleep(1000);
                }
            }catch (Exception e){}
        };

        new Thread(r).start();
        new Thread(r).start();

        // Z
        new Thread(()->{
            try {
                for (int i=0;i<20;i++){
                    c.incrementZ();
                    c.printZ();

                    Thread.sleep(1000);
                }
            }catch (Exception e){

            }
        }).start();
    }
}
