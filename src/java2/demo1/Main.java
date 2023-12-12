package java2.demo1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args){
        ArrayList<String>  arrayList = new ArrayList<>();

        HashSet<String> hs = new HashSet<>();
        hs.add("Hello");
        hs.add("World");
        hs.add("Hello");
        System.out.println(hs.size());

        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("BB");
        pq.add("CC");
        pq.add("AA");
        pq.add("BA");
        pq.add("AC");

        System.out.println("PQ size:"+pq.size());
        while (pq.size() > 0){
//            pq.peek(); // lấy thằng đầu danh sách chứ ko bỏ đi
            String s = pq.poll(); // lấy thằng đầu danh sách ra và bỏ đi
            System.out.println(s);
        }
        System.out.println(pq.size());
    }
}
