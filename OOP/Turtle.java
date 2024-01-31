package OOP;

import java.time.LocalDate;

public class Turtle extends Animal {
    public Turtle(String name,LocalDate birthDay,Illness illness) {
        super(name,birthDay,illness);
    }

    @Override
    void fly() {
        System.out.println(getType() + " не летают");
    }
}
