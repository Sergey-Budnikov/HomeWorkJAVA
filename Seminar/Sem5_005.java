/* Написать метод, который переведёт данное целое число в римский формат.
// 1000, "M"
// 900, "CM"
// 500, "D"
// 400, "CD"
// 100, "C"
// 90, "XC"
// 50, "L"
// 40, "XL"
// 10, "X"
// 9, "IX"
// 5, "V"
// 4, "IV"
// 1, "I"
 */

package Seminar;

import java.util.LinkedHashMap;
import java.util.Map;

public class Sem5_005 {
     static String convertToRoman(int number) {
        StringBuilder res = new StringBuilder();
        Map<Integer, String> nm = getNumsMap();

        for (Integer n : nm.keySet()) {
            int d = number / n;
            if (d > 0) {
                for (int i = 0; i < d; i++) {
                    res.append(nm.get(n));
                }
            }
            number %= n;
        }

        return res.toString();

    }

    private static Map<Integer, String> getNumsMap() {
        Map<Integer, String> numsMap = new LinkedHashMap<>();
        numsMap.put(1000, "M");
        numsMap.put(900, "CM");
        numsMap.put(500, "D");
        numsMap.put(400, "CD");
        numsMap.put(100, "C");
        numsMap.put(90, "XC");
        numsMap.put(50, "L");
        numsMap.put(40, "XL");
        numsMap.put(10, "X");
        numsMap.put(9, "IX");
        numsMap.put(5, "V");
        numsMap.put(4, "IV");
        numsMap.put(1, "I");

        return numsMap;
    }

    static public void main(String[] args) {
        System.out.println(convertToRoman(2024));
        System.out.println(convertToRoman(3567));
    }
}
