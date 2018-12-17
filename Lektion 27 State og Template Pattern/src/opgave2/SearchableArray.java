package opgave2;

import java.util.List;

public class SearchableArray <E extends Comparable<E>> extends SearchPattern<E> {
    private E[] myArray;
    private int current;

    public SearchableArray(E[] theArray) {
        this.myArray = theArray;
    }


    public void init() {
        current = 0;
    }

    public boolean isEmpty() {
        return current >= this.myArray.length;
    }


    public E select() {
        return myArray[current];
    }

    //Hvad skal denne gøre?
    public void split(E m) {
        this.current ++;
    }
}
