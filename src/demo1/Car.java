package demo1;

public class Car {
    String color = "red";
    int year;
    Owner ownerOfCar = new Owner();

    void run(){
        System.out.println("Car is running...");
    }

    void clearCar(){ // method
        System.out.println("Cleaning the car...");
    }

    void printColor(){
        clearCar();
        System.out.println("My color: "+color);
    }
}
