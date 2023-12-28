package java2.demo4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        BankAccount b = new BankAccount();

        // Luong nap tien
        new Thread(()->{
            for (int i = 0;i<10;i++){
                b.deposit(200);
                try {
                    Thread.sleep(1000);
                }catch (Exception e){}
            }
        }).start();

        // luong rut tien
        new Thread(()->{
            b.withdraw(1000);
        }).start();
    }
    public static void main2(String[] args){
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
