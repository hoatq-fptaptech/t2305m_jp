package demo2;

public class Bike {
    private String brand;
    private int year;

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year < 2000)
            return;
        this.year = year;
    }

    public  void showInfo(){
        System.out.println("Brand: "+brand);
    }
}
