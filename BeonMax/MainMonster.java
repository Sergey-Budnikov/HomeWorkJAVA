/* Создать класс Монстр, с 3-мя полями типа int (кол-во глаз, ног и рук). 
Создать 4 конструктора (пустой, с 1-им параметром, 2-мя и 3-мя). 
Если в параметрах конструктора не устанавливается какое-то значение, 
то установить его равным 2.

Создать методы
void voice() - выводит на экран слово “Голос”
void voice(int i) - выводит слово голос i раз
void voice(int i, String word) - выводит слово word i раз */

package BeonMax;

public class MainMonster {
    public static void main(String[] args) {
        Monster jeepers = new Monster(14, 10, 6);
        jeepers.getMonster();
        //System.out.println(jeepers);
        jeepers.voice();
        jeepers.voice(5);
        jeepers.voice(5, "Ха");
    }
}
