package nyc.c4q.ashiquechowdhury;

/**
 * Created by ashiquechowdhury on 9/7/16.
 */
public class OrderedList extends AbstractList{
    private int size;
    private Integer[] values;

    public OrderedList(int size){
        this.size = size;
        values = new Integer[size];
    }

    @Override
    int getSize() {
        return size;
    }

    @Override
    public void add(Integer integer) {
        set(2, integer);
    }

    @Override
    public Integer get(int index) {
        return values[index];
    }

    @Override
    public void set(int index, Integer value) {
        values[index] = value;
    }

    @Override
    public void remove(int index) {
//        values[index] = null;
        set(index, null);
    }
}
