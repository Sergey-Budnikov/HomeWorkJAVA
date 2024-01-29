package OOP;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Барсик", LocalDate.of(2020, 03, 11), new Illness("Лишай"));
        System.out.println(cat.getName());
        Animal animal = new Animal();
        //cat.name = "Коля";
        //System.out.println(cat.name);
        cat.setIllness(new Illness(null));
        System.out.println(cat.getIllness());
        Dog dog = new Dog("Персик", LocalDate.of(2020, 03, 11), new Illness("Лишай"));
        System.out.println(dog.getType());
    }
}
