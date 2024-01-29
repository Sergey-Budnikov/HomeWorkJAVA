package BeonMax;

public class Worker {
    String name;
    String post;
    int wages;

    Worker(String name, String post, int wages ) {
        this.name = name;
        this.post = post;
        this.wages = wages;
    }

    String worker(int i) {
        return "Сотрудник: " + name + 
               ";\nДолжность: " + post + 
               ";\nЗарплата за " + i + " месяцев " + i*wages;
    }
}
