package opgave2;

import java.util.ArrayList;

public class UrbanDictionary<K, V> implements Dictionary<K, V> {
    private ArrayList<Pair> stuffs;

    public UrbanDictionary() {
        stuffs = new ArrayList<>();
    }

    public V get(K key) {
        for (Pair p : stuffs) {
            if (p.key.equals(key)) {
                return p.value;
            }
        }
        return null;
    }


    public boolean isEmpty() {
        if (stuffs.size() == 0) {
            return true;
        }
        else {
            return false;
        }
    }


    public V put(K key, V value) {
        try {
            Pair p = new Pair(key, value);
            stuffs.add(p);
            return p.value;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }


    public V remove(K key) {
        for (Pair p : stuffs) {
            if (p.key.equals(key)) {
                V v = p.value;
                stuffs.remove(p);
                return v;
            }
        }
        return null;
    }

    public String toString() {
        String s = "";
        for (Pair p : stuffs) {
            s += p.key + " : " + p.value + "\n";
        }
        return s;
    }


    public int size() {
        return stuffs.size();
    }

    class Pair {
        K key;
        V value;

        public Pair(K k, V v) {
            key = k;
            value = v;
        }


    }



}
