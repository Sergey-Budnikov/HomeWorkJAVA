/* Написать метод, который переведет число из римского формата записи в арабский.
Например, MMXXIV = 2024
'I', 1
'V', 5
'X', 10
'L', 50
'C', 100
'D', 500
'M', 1000
 */

package Seminar;

import java.util.HashMap;
import java.util.Map;

public class Sem5_004 {
     static int convertRomanToArabicNum(String romanNum) {
        Map<Character, Integer> map = getMapRomanArabicNums();
        int res = 0;
        int prevNum = 0;
        for (int i = romanNum.length()-1; i >= 0; i--) {
            int currentNum = map.get(romanNum.charAt(i));
            if (currentNum < prevNum) {
                res -= currentNum;
            } else {
                res += currentNum;
            }
            prevNum = currentNum;
        }
        return res;
    }

    

    private static Map<Character, Integer> getMapRomanArabicNums() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        return map;
    }

    public static void main(String[] args) {
        System.out.println(convertRomanToArabicNum("CD"));
    }
}
