package demo3;

public class Dog extends Animal{

    private String name;

    public Dog() {
    }

    public Dog(String kind, int yearOld,String name){
        super(kind,yearOld);
        this.name = name;
    }
    public void drink(){

    }

    @Override
    public void eat(){
        super.eat();
        System.out.println("Dog eating...");
        System.out.println("Dog eating...");
        System.out.println("Dog eating...");
        System.out.println("Dog eating...");
        System.out.println("Dog eating...");
    }
}
