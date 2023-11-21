package demo3;

public class SheepDog extends Dog{

    @Override
    public void eat(){
        super.eat();
        super.run();
        this.run();
        System.out.println("SheepDog eat...");
        System.out.println("SheepDog eat...");
        System.out.println("SheepDog eat...");
        System.out.println("SheepDog eat...");
    }


    public void run(){

    }
}
