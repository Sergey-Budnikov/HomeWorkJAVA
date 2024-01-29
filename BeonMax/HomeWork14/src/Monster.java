public class Monster {

    int eyes;
    int arms;
    int legs;

    //this можно не указывать, я это делаю для удобства, чтобы сразу было видно, что обращаюсь к переменным экземпляра
    Monster() {
        this.eyes = 2;
        this.legs = 2;
        this.arms = 2;
    }

    Monster(int eyes) {
        this.eyes = eyes;
        this.arms = 2;
        this.legs = 2;
    }

    Monster(int eyes, int arms) {
        this.eyes = eyes;
        this.arms = arms;
        this.legs = 2;
    }

    Monster(int eyes, int arms, int legs) {
        this.eyes = eyes;
        this.arms = arms;
        this.legs = legs;
    }

    void voice() {
        System.out.println("Голос");
    }

    void voice(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Голос");
        }
    }

    void voice(int n, String word) {
        for (int i = 0; i < n; i++) {
            System.out.println(word);
        }
    }
}
