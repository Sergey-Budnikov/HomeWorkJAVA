/* Дано четное число N (>0) и символы c1 и c2. 
Написать метод, который вернет строку длины N, которая 
состоит из чередующихся символов c1 и c2, начиная с c1. */

package Seminar;

public class Sem2_001 {
    public static void main(String[] args) {
        int n = 100_000;
        char c1 = 'a';
        char c2 = 'z';

        long start = System.currentTimeMillis();
        // System.out.println(lineCharStr( n, c1, c2));
        lineCharStr( n, c1, c2);
        System.out.println(System.currentTimeMillis() - start);

        System.out.println();

        start = System.currentTimeMillis();
        //System.out.println(lineCharStringBuilder( n, c1, c2));
        lineCharStringBuilder( n, c1, c2);
        System.out.println(System.currentTimeMillis() - start);

    }
     public static String lineCharStr(int n, char c1, char c2) {
        String str = "";
        for (int i = 0; i < n/2; i++) {
            str += Character.toString(c1) + Character.toString(c2);
        }
        
        return str;
     }

      public static String lineCharStringBuilder(int n, char c1, char c2) {

        StringBuilder sb = new StringBuilder(n);  // по умолчанию 16 символов в ()

        for (int i = 0; i < n/2; i++) {
            sb.append(c1).append(c2);
        }
        
        return sb.toString();
     }
}
