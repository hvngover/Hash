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
        return size; // Return the number of elements in the hash table
    }

    public int getCapacity() {
        return buckets.size(); // Return the capacity of the hash table
    }

    public void put(K key, V value) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }

        int bucketIndex = getBucketIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets.get(bucketIndex);
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value; // If key already exists, update the value
                return;
            }
        }

        bucket.add(new Entry<>(key, value)); // Add a new entry to the bucket
        size++;

        public V get (K key){
            int bucketIndex = getBucketIndex(key);
            LinkedList<Entry<K, V>> bucket = buckets.get(bucketIndex);
            for (Entry<K, V> entry : bucket) {
                if (entry.key.equals(key)) {
                    return entry.value; // Return the value associated with the key
                }
            }
            return null; // Key not found
        }

        public V remove (K key){
            int bucketIndex = getBucketIndex(key);
            LinkedList<Entry<K, V>> bucket = buckets.get(bucketIndex);
            for (Entry<K, V> entry : bucket) {
                if (entry.key.equals(key)) {
                    bucket.remove(entry); // Remove the entry from the bucket
                    size--;
                    return entry.value; // Return the value of the removed entry
                }
            }
            return null; // Key not found
        }

        public int getBucketSize ( int index){
            if (index < 0 || index >= buckets.size()) {
                throw new IllegalArgumentException("Invalid bucket index");
            }
            LinkedList<Entry<K, V>> bucket = buckets.get(index);
            return bucket.size(); // Return the size of the specified bucket
        }

        public void clear () {
            for (LinkedList<Entry<K, V>> bucket : buckets) {
                bucket.clear(); // Clear all the buckets
            }
            size = 0; // Reset the size to zero
        }
        private int getBucketIndex (K key){
            int hashCode = key.hashCode();
            int bucketIndex = hashCode % buckets.size();
            return Math.abs(bucketIndex);
        }


    }
}
