public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Шарик";
        dog.breed = "Такса";
        dog.speed = 10;
        dog.run();
        System.out.println(dog.info());
    }
}
