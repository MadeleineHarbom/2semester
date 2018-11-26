package opgave1;

import java.util.LinkedList;

public class LinkedQueue implements Queue {
    private LinkedList theList;

    public LinkedQueue() {
        theList = new LinkedList();
    }

    @Override
    public boolean isEmpty() {
        if (theList.size() == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void enqueue(Object newElement) {
        theList.addLast(newElement);
    }

    @Override
    public Object dequeue() {
        return theList.removeFirst();
    }

    @Override
    public int size() {
        return theList.size();
    }

    @Override
    public Object getFront() {
        return theList.getFirst();
    }
}
