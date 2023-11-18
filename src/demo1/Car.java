package demo1;

public class Car {
    String color = "red";
    int year;
    Owner ownerOfCar = new Owner();

    public Car(){

    }

    public Car(String c){

    }

    public Car(String color,int year, Owner ownerOfCar){
        this.color = color;
        this.year= year;
        this.ownerOfCar = ownerOfCar;
    }

    void run(){
        System.out.println("Car is running...");
    }

    void run(String msg){
        System.out.println("Car is running..."+ msg);
    }

    boolean run(int msg){
        return true;
    }

    void run(String s,int n){

    }

    void run(int s,String n){

    }

    void clearCar(){ // method
        System.out.println("Cleaning the car...");
    }

    void printColor(){
        clearCar();
        System.out.println("My color: "+color);
    }
}
