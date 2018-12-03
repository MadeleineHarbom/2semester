package opgave3;

public class DictionaryLinked implements Dictionary {
    private Node start;
    private int size;

    private class Node {
        Node next;
        Object key;
        Object value;

        @Override
        public String toString() {
            return this.key + " : " + this.value;
        }
    }

    public DictionaryLinked() {
        // Sentinel (tomt listehoved, der ikke indeholder data)
        start = new Node();
        size = 0;
    }

    @Override
    public Object get(Object key) {
        Node n = start;
        while (n.next != null) {
            if (n.next.key.equals(key)) {
                return n.next;
            }
            else {
                n = n.next;
            }
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0; //possible?
    }

    @Override
    public Object put(Object key, Object value) {
        Node n = start;
        while (n.next != null) {
            n = n.next;
        }
        Node newnode = new Node();
        newnode.key = key;
        newnode.value = value;
        n.next = newnode;
        return newnode;
    }

    @Override
    public Object remove(Object key) {
        Node n = start;
        Node found = null;
        while (n.next != null) {
            if (n.next.key.equals(key)) {
                found = n.next;
                n.next = n.next.next;
                return found;
            }
            else {
                n = n.next;
            }
        }
        return found;
    }

    @Override
    public int size() {
        return size;
    }


}
