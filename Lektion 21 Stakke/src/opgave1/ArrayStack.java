package opgave1;

public class ArrayStack<T> implements Stack<T>{

    private T[] array;
    private int counter;

    public ArrayStack(int size) {
        this.array = (T[]) new Object[size];
        this.counter = 0;
    }

    @Override
    public void push(T element) {
        array[counter] = element;
        counter++;
    }

    @Override
    public T pop() {
        try {
            T t = array[counter-1];
            counter --;
            return t;
        }
        catch (Exception e) {
            return null;
        }

    }

    @Override
    public T peek() {
        try {
            T t = array[counter-1];
            return t;
        }
        catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean isEmpty() {
        return counter ==0;
    }

    @Override
    public int size() {
        return this.counter;
    }

    @Override
    public String toStirng() {
        String s = "";
        for (int i = 0; i < counter; i++) {
            s += " " + array[i];
        }
        return s;
    }
}
