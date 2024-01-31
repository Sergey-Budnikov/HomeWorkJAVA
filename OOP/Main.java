package OOP;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Барсик", LocalDate.of(2020, 03, 11), new Illness("Лишай"));
        System.out.println(cat.getName());
        Animal animal = new Animal();
        //cat.name = "Коля";
        //System.out.println(cat.name);
        cat.setIllness(new Illness(null));
        System.out.println(cat.getIllness());
        Animal dog = new Dog("Персик", LocalDate.of(2020, 03, 11), new Illness("Лишай"));
        System.out.println(dog.illness);
        List<Animal> list = new ArrayList<>();
        list.add(dog);
        list.add(cat);
        list.add(new Bird("Ласточка", LocalDate.of(2020,03,20),new Illness("Лишай"), 2));
        System.out.println(list);
        dog.lifeCycle();
        Animal turtle = new Turtle("Miki", LocalDate.of(20, 05, 21), new Illness("Ветрянка"));
        turtle.fly();
    }
}
