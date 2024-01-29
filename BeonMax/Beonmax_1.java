package BeonMax;

public class Beonmax_1 {
    public static void main(String[] args) {
        int sec = 900121;
        int days = sec / 86400;
        //int hour = (sec - days * 86400) / 3600;   
         int hour = (sec % 86400) / 3600;
        //int minute = (sec - days * 86400 - hour * 3600) / 60;
         int minute = (sec % 86400 % 3600 ) / 60;
        //int secomds = sec - days * 86400 - hour * 3600 - minute * 60;
         int secomds = sec % 86400 % 3600 % 60;
        System.out.println("Общее количество секунд: " + sec);
        System.out.println("Количество дней: " + days);
        System.out.println("Количество часов: " + hour);
        System.out.println("Количество минут: " + minute);
        System.out.println("Количество секунд: " + secomds);
    }
}
