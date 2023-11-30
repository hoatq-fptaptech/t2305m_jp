package demo7;

public class Tree {
    private int yearOld;

    public Tree(int yearOld) {
        this.yearOld = yearOld;
    }

    public int getYearOld() {
        return yearOld;
    }

    public void setYearOld(int yearOld) {
        this.yearOld = yearOld;
    }

    public Tree grownUp(){
        System.out.println("Tree grown up..");
        return this;
    }

    public Tree die(){
        System.out.println("Tree ...");
        return this;
    }
}
