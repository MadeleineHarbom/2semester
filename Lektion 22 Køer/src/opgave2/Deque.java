package opgave2;

public interface Deque {

    public void AddFirst(Object e);

    public void addLast(Object e);

    public Object removeFirst();

    public Object removeLast();

    public Object getFirst();

    public Object getLast();

    public int getSize();

    public boolean isEmpty();

}
