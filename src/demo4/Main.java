package demo4;

public class Main {
    public static void main(String[] args){
       // Person p = new Person();// Không thể tạo object từ abstract class
        Person p = new Person() { // Anonymous class
            @Override
            public void run() {
                System.out.println("Male run....");
            }

            @Override
            public void eat() {
                System.out.println("Eating...");
            }
        };

        Male m = new Male();

        Person p2 = (Person) m; // upcasting
    //    p2.love();

        Male m2 = (Male) p; // downcasting
    //    m2.love();
    }
}
