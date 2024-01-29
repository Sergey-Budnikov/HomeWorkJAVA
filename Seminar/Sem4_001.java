/* 
📌 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
📌 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
Сравните с предыдущим.
 */

package Seminar;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Sem4_001 {
    public static void main(String[] args) {
        int count = 10_000;

        System.out.println("Добавление элементов в конец списка");
        long start = System.currentTimeMillis();
        fillArrayListLAddLast(count);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        fillLinkedListLAddLast(count);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start));

        System.out.println();

        System.out.println("Добавление элементов в начало списка");
        start = System.currentTimeMillis();
        fillArrayListLAddFirst(count);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        fillLinkedListLAddFirst(count);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start));

        System.out.println();

        System.out.println("Добавление элементов в середину списка");
        start = System.currentTimeMillis();
        fillArrayListLAddMiddle(count);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        fillLinkedListLAddMiddle(count);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start));
    }

    public static ArrayList<Integer> fillArrayListLAddLast(int count) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            arrayList.addLast(i);
        }
        return arrayList;
    }

    public static LinkedList<Integer> fillLinkedListLAddLast(int count) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            linkedList.addLast(i);
        }
        return linkedList;
    }

    public static ArrayList<Integer> fillArrayListLAddFirst(int count) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            arrayList.addFirst(i);
        }
        return arrayList;
    }

    public static LinkedList<Integer> fillLinkedListLAddFirst(int count) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            linkedList.addFirst(i);
        }
        return linkedList;
    }

    public static ArrayList<Integer> fillArrayListLAddMiddle(int count) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            arrayList.add(arrayList.size() / 2, i);
        }
        return arrayList;
    }

    public static LinkedList<Integer> fillLinkedListLAddMiddle(int count) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            linkedList.add(linkedList.size() / 2, i);
        }
        return linkedList;
    }
}
    

