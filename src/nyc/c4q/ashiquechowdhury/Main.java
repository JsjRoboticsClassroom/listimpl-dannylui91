package nyc.c4q.ashiquechowdhury;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        AbstractList list = new OrderedList(50);
        list.add(300);

        list.set(0, 1000);
        list.set(1, 2000);
        //for some reason your .add method does list.set(2, 300)
        list.set(3, 3000);

        System.out.println(list.get(2));
    }
}
