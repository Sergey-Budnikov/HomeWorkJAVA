package OOP;

import java.time.LocalDate;

public class Cat extends Animal {
    Cat(String name,LocalDate birthDay,Illness illness) {
        super(name,birthDay,illness);
    }

    @Override
    void fly() {
        System.out.println(getType() + " не летают");
    }

    @Override
    void swim() {
        System.out.println(getType() + " не плавают");
    }
}
