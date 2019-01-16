package opgave2;

import java.util.ArrayList;
import java.util.List;

public class SearchableList <E extends Comparable<E>> extends SearchPattern<E> {
    private List<E> list;
    private int current;

    //skal kunne lave en linjaer soegning

    public SearchableList(List<E> list) {
        this.list = list;

    }

    //Hvad skal denne lave?
    public void init() {
        current = 0;
    }

    public boolean isEmpty() {
        return current >= list.size();
    }


    public E select() {
        return list.get(current);
    }

    //Hvad skal denne gøre?
    public void split(E m) {
        this.current ++;
    }
}
