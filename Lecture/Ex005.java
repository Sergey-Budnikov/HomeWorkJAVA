package Lecture;

import java.util.Arrays;
import java.util.List;

public class Ex005 {
    public static void main(String[] args) {
    StringBuilder day = new StringBuilder("28");
    StringBuilder month = new StringBuilder("12");
    StringBuilder year = new StringBuilder("1990");
    StringBuilder[] date = new StringBuilder[] {day, month, year};
    List<StringBuilder> d = Arrays.asList(date);
    System.out.println(d);
    date[1] = new StringBuilder("09");
    System.out.println(d);
    }
}
