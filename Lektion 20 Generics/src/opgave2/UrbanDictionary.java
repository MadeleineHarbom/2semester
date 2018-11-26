package opgave2;

public class UrbanDictionary<K, V> implements Dictionary<K, V> {
    //private Object[] elements; Lave en hashMap
    private int currentSize;
    private int head;
    private int tail;






    public V get(K key);


    public boolean isEmpty();


    public V put(K key, V value);


    public V remove(K key);


    public int size();
}
