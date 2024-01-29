package BeonMax;

public class MainWorker {
    public static void main(String[] args) {
        Worker wr = new Worker("Серёжа", "Менеджер", 10000);
        System.out.println(wr.worker(12));
    }
}
