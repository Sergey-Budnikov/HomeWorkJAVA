/* Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
максимальное количество подряд идущих 1. */

package Seminar;

public class CountBinSeriesMethod {
    public static void main(String[] args) {
        getCounterMax();
    }

    private static void getCounterMax() {
        final int[] numsArr = {1, 1, 0, 1, 1, 1};
        
        int onesCounter = 0;
        int counterMax = 0;
        for (int num : numsArr) {
            if(num == 1) {
                onesCounter++;
                counterMax = counterMax > onesCounter ? counterMax : onesCounter;
                // counterMax = Math.max(counterMax, onesCounter);
            }
            else {
                onesCounter = 0;
            }
        }
        System.out.println(counterMax);
    }
}
