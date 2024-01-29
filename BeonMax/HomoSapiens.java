/* Создать класс Человек, в котором будет 3 поля: имя, возраст и вес.
В классе Main создать 5 экземпляров класса Человек, 
присвоить значения их полям и вывести на экран их средний возраст. */

package BeonMax;

public class HomoSapiens {
    public static void main(String[] args) {
        Human chelik1 = new Human();
        chelik1.name = "Петро";
        chelik1.age = 17;
        chelik1.weight = 135;
        System.out.println("Меня зовут " + chelik1.name + ", мне " + chelik1.age + " лет, я вешу как пушок - " + chelik1.weight + " кило)");
        Human chelik2 = new Human();
        chelik2.age = 15;
        Human chelik3= new Human();
        chelik3.age =27;
        Human chelik4 = new Human();
        chelik4.age = 18;
        Human chelik5 = new Human();
        chelik5.age = 77;
        int res = (chelik1.age + chelik2.age + chelik3.age + chelik4.age + chelik5.age)/ 5;
        System.out.println(res);
    }
}
