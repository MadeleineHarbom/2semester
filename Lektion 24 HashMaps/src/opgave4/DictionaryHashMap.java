package opgave4;

public class DictionaryHashMap implements Dictionary {

	private java.util.Map<Object, Object>[] tabel; // et array af maps
	private int N = 10;
	//private int size???? Behoeves den?

	/**
	 * HashingMap constructor comment.
	 */
	public DictionaryHashMap() {
		tabel = new java.util.HashMap[N];
		for (int i = 0; i < N; i++) {
			tabel[i] = new java.util.HashMap<Object, Object>();
		}
	}

	@Override
	public Object get(Object key) {
		int i = key.hashCode() % N;
		java.util.Map<Object, Object> map = tabel[i];
		return map.get(key);
	}

	@Override
	public boolean isEmpty() {
		boolean empty = true;
		int i = 0;
		while (empty && i < N) {
			empty = (tabel[i]).isEmpty();
			i++;
		}
		return empty;
	}

	public int emptyBuckets() {
        boolean empty = true;
        int empties = 0;
        for (int i = 0; i < tabel.length; i++) {
            if (tabel[i].isEmpty()) {
                empties++;
            }
        }
        return empties;
    }

	@Override
	public Object put(Object key, Object value) {
		int i = key.hashCode() % N;
		//Tjeck hvis key allereden findes
        //Hvis key allereden findes, skal gen gamle V retunerews
        //ELLers retuneres nye V
		Object o = tabel[i].put(key, value);
		return o;
	}

	@Override
	public Object remove(Object key) {
		int i = key.hashCode() % N;
		Object o = tabel[i].remove(key);
		//Skal bare retunere V
		return o;
	}

	@Override
	public int size() {
		int size = 0;
		for (int i = 0; i < N; i++) {
			size += tabel[i].size();
		}
		return size;
	}

    @Override
    public String toString() {
        return super.toString();
    }
}
