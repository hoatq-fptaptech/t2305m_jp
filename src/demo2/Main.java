package demo2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
         int[] arr = new int[5];// int arr[5]

        ArrayList ls = new ArrayList();
        ls.add(1);
        ls.add("2");

        System.out.println(ls.get(0));
        System.out.println(ls.get(1));

        System.out.println(ls.size());

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(2);
//        intList.add("3");

        ArrayList<String> strList = new ArrayList<>();
        strList.add("Hello");
//        strList.add(2);

        ArrayList<Bike> bList = new ArrayList<>();
        Bike b1 = new Bike();
        bList.add(b1);

        bList.add(new Bike());
    }
}
