package opgave2;

public class SearchableArrayBin <E extends Comparable<E>> extends SearchPattern<E> {
    private E[] myArray;
    private E[] current;
    private int mid;

    public SearchableArrayBin(E[] theArray) {
        this.myArray = theArray;
    }

    public void init() {
        current = myArray;
    }

    public boolean isEmpty() {
        return this.current.length > 0;
    }
    public E select() {
        return current[current.length / 2];
    }
    public void split(E m) {

    }


}
