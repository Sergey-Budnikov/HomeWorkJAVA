/* 
Реализовать консольное приложение, которое:
1. Принимает от пользователя строку вида
text~num
2. Нужно рассплитить строку по ~, сохранить text в связный список на
позицию num.
3. Если введено print~num, выводит строку из позиции num в связном
списке и удаляет её из списка. */

package Seminar;

import java.util.LinkedList;
import java.util.Scanner;

public class Sem4_002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> userList = new LinkedList<>();
        while (true) {
            System.out.println("Введите строку вида text~num для добавления элемента в список");
            System.out.println("print~num для вывода элемента и его удаления");
            System.out.println("stop для завершения работы");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
            String[] inpSplit = input.split("~");
            String text = inpSplit[0];
            int num = Integer.parseInt(inpSplit[1]);
            if (text.equals("print")) {
                if (num >= 0 && num < userList.size()) {
                    System.out.println(userList.get(num));
                    userList.remove(num);
                    System.out.println(userList);
                }
            } 
            else {
                  if (num >= 0 && num <= userList.size()) {
                    userList.add(num, text);   
                }
                System.out.println(userList);
                
            }
        }
        scanner.close();
    }
}
