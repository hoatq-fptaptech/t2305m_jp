import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        float y = (float)3.14158;
        double z = 15.15;
        char ch = 'h';
        boolean t = true;
        String s = "Hello world!";

        System.out.println(s);
        System.out.println(x);

        if(x > 5){
            System.out.println("A");
        }else if(x >= 10){
            System.out.println("B");
        }else if(x > 15){
            System.out.println("C");
        }else{
            System.out.println("D");
        }
// x=10
        switch (x){
            case 0:
                System.out.println("0");break;
            case 10:
                System.out.println("10");break;
            default:
                System.out.println("100");
        }

        for(int i=0;i<10;i++){

        }
        sayHello("Everybody");
        // scan
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so can kiem tra:");
        int number = sc.nextInt();

        if(checkPrime(number)){
            System.out.println(number+ " la so nguyen to");
        }
    }

    static void sayHello(String msg){
        System.out.println("Hello world!" + msg);
    }

    // viết 1 function kiểm tra 1 số nguyên có phải là
    // số nguyên tố hay không?
    static boolean checkPrime(int n){
        if(n<2) return false;
        if(n==2 && n==3) return true;
        // n >=4
        for(int i=2;i<=n/2;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}