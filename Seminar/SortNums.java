/* 📌 Дан массив nums = [3,2,2,3] и число val = 3.
   📌 Если в массиве есть числа, равные заданному, нужно перенести
   эти элементы в конец массива. */

package Seminar;

import java.util.Arrays;

public class SortNums {
    public static void main(String[] args) {

       // int[] array = {3, 2, 2, 3};
        int[] array = {1, 2, 3, 4, 5, 3, 6, 7, 3, 3, 8, 9, 3};
        int val = 3;
        int right = array.length - 1;

        while (array[right] == val) {
                right--;
            }

        for ( int left = 0; left < right; left++) {
            
            if (array[left] == val) {
                array[left] = array[right];
                array[right] = val;
                right--;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
