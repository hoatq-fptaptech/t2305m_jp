package demo6;

public class Main {
    public static void main(String[] args){
        try { // xử lý ngoại lệ
            int x = 10;
            int y = 2;
            System.out.println("x : y =");
            if(y < 5){
                throw new Exception("Không được chia bé hơn 5"); // chủ động phát ra ngoại lệ
            }
            int z = x / y;
            System.out.println(z);

        }catch (ArithmeticException e){
            System.out.println("Error: Arithmetic");
        }catch (Exception e){ // reflection
            System.out.println("Error: "+e.getMessage());
        }finally { // có thể có hoặc không
            // lúc nào cũng chạy qua
        }

    }

    public static  void demo() throws Exception{ // có khả năng hàm này sẽ có sự cố nhưng nó ko đặt try catch
        System.out.println("Demo Exception");
        int a = 2;
        int b = 0;
        System.out.println(a/b);
    }

    public static void demo2() throws Exception{
        demo();
    }
}
