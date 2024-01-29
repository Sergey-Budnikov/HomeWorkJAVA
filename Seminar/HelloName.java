/*  
   📌 Написать программу, которая запросит пользователя ввести
   <Имя> в консоли.
   📌 Получит введенную строку и выведет в консоль сообщение
   “Привет, <Имя>!”
*/
package Seminar;

import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        System.out.print("Имя пользователя: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("Привет, " + str + "!"); // конкатенация строк
        System.out.printf("Привет, %s!", str); // обьединение через стрингбилдер
        scanner.close();
    }
}
