package demo5;

public class Main {
    public static void main(String[] args){
//        StudentInterface st = new StudentInterface();

        StudentInterface st = new StudentInterface() {
            @Override
            public void learn() {

            }

            @Override
            public void playGame() {

            }
        };

        AptechInterface apt = new AptechInterface() {
            @Override
            public void code(String s) {

            }
        };

        // lambda expression
        AptechInterface apt2 = (s)->{

        };
    }
}
