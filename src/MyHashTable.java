import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


class MyHashTable<K, V> {
    private List<LinkedList<Entry<K, V>>> buckets; // List of linked lists to store entries
    private int size; // Number of elements in the hash table

    public MyHashTable() {
        this(35); // Default capacity is 35
    }

    public MyHashTable(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be a positive value");
        }
        this.size = 0;
        this.buckets = new ArrayList<>(capacity);// Create a new ArrayList with specified capacity
        for (int i = 0; i < capacity; i++) {
            buckets.add(new LinkedList<>()); // Initialize each bucket with an empty linked list
        }
    }
    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return buckets.size();
    }


}