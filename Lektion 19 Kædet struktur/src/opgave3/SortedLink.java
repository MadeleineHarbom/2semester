package opgave3;

import java.util.NoSuchElementException;

public class SortedLink {
    private Node first;

    public SortedLink() {
        first = null;
    }

    public void addFirst(String element) {
        if (first == null) {
            Node newNode = new Node();
            newNode.data = element;
            first = newNode;
        }
        else {
            Node newNode = new Node();
            newNode.data = element;
            newNode.next = first;
            first = newNode;
        }
    }

    public String getFirst() {
        if (first == null) {
            throw new NoSuchElementException();
        }
        return first.data;
    }

    public Node getFirstNode() {
        if (first == null) {
            throw new NoSuchElementException();
        }
        return first;
    }

    public void addElement(String element) {

        if (first != null) {
            Node n = first;
            if (element.compareTo(first.data)<0) {
                Node newNode = new Node();
                newNode.data = element;
                newNode.next = first;
                first = newNode;

            }
            else {
                while (n != null) {
                    if (n.next == null) {
                        Node newNode = new Node();
                        newNode.data = element;
                        n.next = newNode;
                        break;
                    }
                    else if (element.compareTo(n.data) > 0 && element.compareTo(n.next.data) < 0) {
                        Node newNode = new Node();
                        newNode.data = element;
                        newNode.next = n.next;
                        n.next = newNode;
                        break;
                    }
                    else {
                        n = n.next;
                    }
                }
            }


        }

        else {
            addFirst(element);
        }
          
    }

    public boolean removeElement(String element) {
        if (first != null) {
            if (first.data.equals(element)) {
                first = first.next;
                return true;
            }
            Node n = first;
            while (n.next != null) {
                if (element.equals(n.next.data)) {
                    n.next = n.next.next;
                    return true;
                }

                    else {
                        n = n.next;
                }

            }
        }
        return false;
    }

    public int countElements() {
        int i = 0;
        if (first != null) {
            i = 1;
            Node n = first;
            while (n.next != null) {
                i++;
                n = n.next;
            }
        }
        return i;

    }

    public String toString() {
        String s = "";
        if (first != null) {
            Node n = first;
            s += n.data;
            while (n.next != null) {
                s += ", ";
                n = n.next;
                s += n.data;
            }

        }
        return s;
    }

    public void addAll(SortedLink sl) {
        Node n = sl.getFirstNode();
        while (n != null){
            this.addElement(n.data);
            n = n.next;
        }
    }






    class Node {
        public String data;
        public Node next;
    }


}
