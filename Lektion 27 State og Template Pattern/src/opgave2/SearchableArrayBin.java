package opgave2;

public class SearchableArrayBin <E extends Comparable<E>> extends SearchPattern<E> {
    private E[] myArray;
    private int left;
    private int mid;
    private int right;

    public SearchableArrayBin(E[] theArray) {
        this.myArray = theArray;
    }

    public void init() {
        this.left = 0;
        this.right = this.myArray.length;
        this.mid = (left + right) /2;
    }

    public boolean isEmpty() {
        return this.left == this.right;
    }
    public E select() {
        return myArray[mid];
    }
    public void split(E m) {
        if (select().compareTo(m) > 0) {
            right = this.mid -1;
        }
        else {
            left = this.mid + 1;
        }

    }


}
