# MyHashTable

## Methods:

```private int size```: 

This variable keeps track of the number of elements in the hash table.

```public MyHashTable()```: 

This is a constructor with no arguments that initializes a hash table with a default capacity of 25.

``` public MyHashTable(int capacity)``` : 

This constructor initializes a hash table with a specified capacity. It throws an exception if the capacity is not a positive value.

```public int getSize() ```: 

This method returns the current number of elements in the hash table.

```public int getCapacity()```: 

This method returns the current capacity of the hash table.

```public void put(K key, V value)```: 

This method adds a key-value pair to the hash table. If the key already exists, it updates the associated value with the new value.

```public V get(K key)```: 

This method retrieves the value associated with a given key from the hash table. If the key is found, it returns the corresponding value; otherwise, it returns null.

```public V remove(K key)```: 

This method removes the key-value pair associated with the given key from the hash table and returns the corresponding value. If the key is not found, it returns null.

```public int getBucketSize(int index)```: 

This method returns the number of elements in the bucket at the specified index. It throws an exception if the index is invalid.

```public void clear()```: 

This method clears all the elements from the hash table and resets the size to zero.

```private int getBucketIndex(K key)```: 

This private method calculates the bucket index for a given key by computing its hash code and performing modulo operation with the number of buckets. It ensures a positive bucket index.

```private static class Entry<K, V> ```: 

This is a nested static class representing an entry in the hash table. It holds a key-value pair.

## Usage:

### The ```MyHashTable``` class can be used to store key-value pairs, where the key is of type K and the value is of type V. The MyHashTable constructor takes an optional initial capacity and load factor as parameters. If these parameters are not specified, the default values of 16 for the initial capacity and 0.75 for the load factor are used.


```java
// Add some key-value pairs to the hash table
        table.put(1, "Apple");
        table.put(2, "Banana");
        table.put(3, "Orange");

        // Retrieve values based on keys
        System.out.println(table.get(1)); // Output: Apple
        System.out.println(table.get(2)); // Output: Banana
        System.out.println(table.get(3)); // Output: Orange
```

The **put()** method adds a new key-value pair to the hash table. If a key that already exists in the hash table is passed to put(), the old value is replaced with the new value.


```java int johnsAge = table.get("Apple"); // 30 ```

The **get()** method retrieves the value associated with a given key. If the key is not found in the hash table, get() returns null.


```java boolean containsBanana = table.containsValue(35); // true ```

The **containsValue()** method returns a boolean value indicating whether the given value is present in the hash table.


```java int numElementsInBucket = table.getBucketSize(0); ```

The **getBucketSize()** method returns the number of elements in the bucket with the given index.
 
 
 ```java K appleKey = table.getKey(30); ```
 
The **getKey()** method returns the key associated with the given value in the hash table.


```java table.clear(); ```

The **clear()** method removes all key-value pairs from the hash table.












