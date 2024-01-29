/* 
1) Написать метод, который принимает массив элементов, помещает их в стэк
и выводит на консоль содержимое стэка.
2) Написать метод, который принимает массив элементов, помещает их в
очередь и выводит на консоль содержимое очереди. */

package Seminar;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Sem4_003 {  
    public static void main(String[] args) {
        int[] elements = {1, 4, 6, 21, 89};

        Stack<Integer> stack = new Stack<>();
            for (Integer element : elements) {
                stack.push(element);
            }
            while (!stack.isEmpty()) {
                System.out.print(stack.pop() + " ");
            }

        System.out.println();

        Queue<Integer> queue = new LinkedList<>();
            for (Integer element : elements) {
                queue.add(element);
            }
        System.out.println(queue);
    }
}
