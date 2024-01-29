package Lecture;

import java.util.List;

public class Ex002 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(22);

        for(Object o : list) {
            System.out.println(o);
        }
    }
}
