import java.util.LinkedList;

public class HashTable<K, V> {
    private static int size = 0;
    private final int tableSize = 100;
    LinkedList<Entry<K, V>>[] table;


    public HashTable () {
        this.table = new LinkedList[tableSize];
    }

    public void put(K key, V value) {
        int index = hash(key);
        if (table[index] == null) {
            table[index] = new LinkedList<Entry<K, V>>();
        }
        for (Entry<K, V> entry: table[index]) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }
        table[index].add(new Entry<K, V>(key, value));
        size++;
    }

    public V get(K key) {
        int index = hash(key);
        if (table[index] != null) {
            for (Entry<K, V> entry : table[index]) {
                if (entry.getKey().equals(key)) {
                    return entry.getValue();
                }
            }
        }
        return null;
    }

    public void remove (K key) {
        int index = hash(key);
        if (table[index] != null) {
            for (Entry<K, V> entry: table[index]) {
                if (entry.getKey().equals(key)) {
                    table[index].remove(entry);
                    size--;
                    return;
                }
            }
        }
    }

    public int size() {
        return size;
    }

    public Boolean isEmpty() {
        for (LinkedList<Entry<K, V>> linkedList: table) {
            if (linkedList != null && !linkedList.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    private int hash(K key) {
        return Math.abs(key.hashCode() % tableSize);
    }

    private static class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }
    }
}