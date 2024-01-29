/* Напишите программу которая принимает два параметра типа boolean,
   первый показыает, что уже ночь, второй показывает, что на улице хорошая погода.
   и в зависимости от условий показывает что вам делать. Если уже ночь,
   то выводится надпись "Спать". если сейчас день и на улице хорошая погода, 
   тогда надпись "Гулять". Если сейчас день и на улице плохая погода.
   тогда "Читать книгу". 
*/

package BeonMax;

public class Beonmax_2 {
    public static void main(String[] args) {
        int time = 24;
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
