import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


class MyHashTable<K, V> {
    private List<LinkedList<Entry<K, V>>> buckets; // List of linked lists to store entries
    private int size; // Number of elements in the hash table

    public MyHashTable() {
        this(50);
    }

    public MyHashTable(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be a positive value");
        }
        this.size = 0;
        this.buckets = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            buckets.add(new LinkedList<>());
        }
    }
}