package BeonMax;

public class TestBeonMax {
    public static void main(String[] args) {
        int time = 19;
        boolean goodWeather = false;
        boolean night = time >= 23 || time <= 5;

        if (!night && goodWeather) {
            System.out.println("Гулять");
        }
        if (!night && !goodWeather) {
            System.out.println("Читать книгу");
        }
        if (night) {
            System.out.println("Спать");
        }
        }
    }
