package Lecture;

import java.util.*;

public class Ex007 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pr = new PriorityQueue<Integer>();
        pr.add(123);
        pr.add(3);
        pr.add(13);
        pr.add(1);
        System.out.println(pr);
        System.out.println(pr.poll());
        System.out.println(pr.poll());
        System.out.println(pr.poll());
        System.out.println(pr.poll());
    }
}
