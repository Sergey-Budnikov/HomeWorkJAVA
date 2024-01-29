package BeonMax;

public class Monster {
    int eyes;
    int hands;
    int legs;

    Monster() {
        eyes = 2;
        hands = 2;
        legs = 2;
    }
    Monster(int eyes) {
        this.eyes = eyes;
        hands = 2;
        legs = 2;    
    }
    Monster(int eyes, int hands) {
        this.eyes = eyes;
        this.hands = hands;
        legs = 2;
    }
    Monster(int eyes, int hands, int legs) {
        this.eyes = eyes;
        this.hands = hands;
        this.legs = legs;
        //System.out.println("Джиперс Криперс с " + eyes + " глазами, "
         //                                       + hands + " руками, " 
         //                                       + legs + " ногами." );
    }
    void getMonster() {
        System.out.println("Джиперс Криперс с " + eyes + " глазами, "
                                                + hands + " руками, " 
                                                + legs + " ногами." );
    }

    void voice() {
        System.out.println("Голос");
    }
    void voice(int i) {
        String result = "";
        for (int j = 0; j < i; j++) {
            result+= "Голос "; 
        }
        System.out.println(result);
    }
    void voice(int i, String word) {
        String result = "";
        for (int j = 0; j < i; j++) {
            result+= word + " ";
        }
        System.out.println(result);
    }
}
