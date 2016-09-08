package nyc.c4q.ashiquechowdhury;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        AbstractList list = new OrderedList(50);
        list.add(300);
        System.out.println(list.get(2));
    }
}
