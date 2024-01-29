/* 
Реализовать стэк с помощью массива.
Нужно реализовать методы:
size(), empty(), push(), peek(), pop(). */

package Seminar;

public class Sem4_004 {
    static int[] array;
    static int capacity;
    static int topIndex;
    public static void main(String[] args) {
        capacity = 4;
        array = new int[capacity];
        topIndex = -1;

        System.out.println(empty());
        push(5);
        push(1);
        System.out.println(size());
        push(2);
        push(7);
        System.out.println(size());
        System.out.println(peek());
        System.out.println(pop());
        System.out.println(size());
        System.out.println(empty());
    }

    public static int size() {
        return topIndex + 1;
    }

    public static boolean empty() {
        return topIndex == -1;
    }

    public static void push(int num) {
        array[++topIndex] = num;
    }

    public static int peek() {
        return array[topIndex];
    }

    public static int pop() {
        return array[topIndex--];
    }
    
}
