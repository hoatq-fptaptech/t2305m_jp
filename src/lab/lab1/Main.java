package lab.lab1;

public class Main {

    public static void main(String[] args){
        Product p = new Product(1,"Iphone 15 Promax",1000.5,10,"Item");
        Product p1 = new Product(2,"Iphone 14 Promax",1000.5,10,"Item");
//        p.id = 1;
//        p.name = "Iphone 15 Promax";
//        p.price = 1000;
//        p.qty = 10;
//        p.unit = "Item";

        p.changeQty(2);
        p.changeQty(-50);
        if(p.checkStock()){
            System.out.println("Product in stock");
        }
    }
}
