package BeonMax;

public class Dog {
    String nickname;
    String breed;
    int speed;

    public void run() {
        String res = "";
        int i = 0;
        while (i < speed) {
            if (i == speed - 1) {
                res+= "бегу.";                  
            }
            else {
                res+= "бегу, ";
            }
            i++;
        }
        System.out.println(res);
    }

    String info() {
        return "Кличка: " + nickname + "\nПорода: " + breed + "\nСкорость: " + speed + " узлов";
    }
}
