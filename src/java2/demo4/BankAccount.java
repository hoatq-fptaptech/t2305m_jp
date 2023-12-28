package java2.demo4;

public class BankAccount {
    private int balance = 0;

    public synchronized void deposit(int amount){
        if(amount >0){
            balance += amount;
            System.out.println("Nộp tiền vao tai khoan: "+amount);
            notify();
        }
    }

    public synchronized void withdraw(int amount){
        while (balance < amount ){
            System.out.println("So tien khong du");
            try {
//                Thread.sleep(1000);
                wait();
            }catch (Exception e){}
        }
        if( amount > 0 ){
            balance -= amount;
            System.out.println("Rut thanh cong so tien: "+amount);
        }
    }
}
