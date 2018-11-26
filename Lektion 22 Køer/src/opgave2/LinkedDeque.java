package opgave2;

import java.util.LinkedList;

public class LinkedDeque implements Deque {
    private LinkedList theList;

    public void AddFirst(Object e) {
        theList = new LinkedList();
    }

    public void addLast(Object e) {
        theList.addLast(e);
    }

    public Object removeFirst() {
        return theList.removeFirst();
    }

    public Object removeLast() {
        return theList.removeLast();
    }

    public Object getFirst() {
        return theList.getFirst();
    }

    public Object getLast(){
        return theList.getLast();
    }

    public int getSize() {
        return theList.size();
    }

    public boolean isEmpty(){
        if (theList.size() == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
