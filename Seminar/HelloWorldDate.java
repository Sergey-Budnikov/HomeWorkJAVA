// 📌 Настроить проект, вывести в консоль “Hello world!”.
// 📌 Вывести в консоль системные дату и время.

package Seminar;

import java.time.LocalDateTime;

public class HelloWorldDate {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println(LocalDateTime.now());

       int[] array = {4, 5, 8, 6, 10};
       for (int item : array) {
        System.out.println(item + " ");
       }
    }
}
