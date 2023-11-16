package lab.lab1;

public class Product {
    int id;
    String name;
    double price;
    int qty;
    String unit;

    // constructor


    public Product(int id, String name, double price, int qty, String unit) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.unit = unit;
    }

    void changeQty(int n){
        if(n>0){
            qty += n;
        }else{
            if(qty+n<0){
                return;
            }
            qty += n;
        }
    }

    boolean checkStock(){
        if(qty > 0)
            return true;
        return false;
    }
}
