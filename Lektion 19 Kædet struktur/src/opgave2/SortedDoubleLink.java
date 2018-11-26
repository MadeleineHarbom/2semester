package opgave2;

import java.util.NoSuchElementException;

public class SortedDoubleLink {
    private Node first;
    private Node last;

    public SortedDoubleLink() {
        first = new Node();
        last = new Node();
        first.next = last;
        last.previous = first;
    }




    public void addElement(String element) {
        if (!first.next.equals(last)) {
            if (element.compareTo(first.next.data) < 0) {
                Node newNode = new Node();
                newNode.data = element;
                newNode.next = first.next;
                newNode.previous = first;
                first.next.previous = newNode;
                first.next = newNode;

            }
            else {
                Node n = first.next;
                while (!(n.next.equals(last))) {
                    if ((element.compareTo(n.data) > 0) && (element.compareTo(n.next.data) < 0)) {
                        Node newNode = new Node();
                        newNode.data = element;

                        newNode.next = n.next;
                        newNode.previous = n.previous;
                        n.next.previous = newNode;
                        n.next = newNode;
                        return;
                    } else {
                        n = n.next;
                    }
                }
                Node newNode = new Node();
                newNode.data = element;

                newNode.previous = n;
                newNode.next = n.next;

                newNode.next.previous = newNode;
                n.next = newNode;

            }

            }

        else {
                Node newNode = new Node();
                newNode.data = element;
                first.next = newNode;
                newNode.next = last;
                last.previous = newNode;
                newNode.previous = first;


        }

    }


    public boolean removeElement(String element) {
        // NOT WORKING
        Node n = first.next;
        while (!(n.equals(last))) {
            if (element.equals(n.data)) {
                n.previous.next = n.next; //her gaar der galt
                n.next.previous = n.previous;
                return true;
            }

            else {
                n = n.next;
            }

        }
        return false;
    }

    public int countElements() {
        int i = 0;
        Node n = first.next;
        while(!(n.equals(last))) {
            i++;
            n = n.next;
        }
        return i;

    }

    public String toString() {
        String s = "";
        if (first.next.equals(last)) {
            return "List is empty";
        }
        Node n = first.next;
        while (!(n.equals(last)) ) {
            if (!(n.previous.equals(first))) {
                s += ", ";
            }
            s += n.data;
            n = n.next;
        }

        return s;
    }






    class Node {
        public String data;
        public Node next;
        public Node previous;
    }


}
