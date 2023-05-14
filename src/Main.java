import java.util.Random;
public class Main {
    public static void main(String[] args) {
        MyHashTable<MyTests, Student> table = new MyHashTable<>();
// Create new HashTable with MyTestClass keys and Student values

        Random rand = new Random(); // Add 10,000 random elements to hash table
        for (int i = 0; i < 10000; i++) {
            MyTests key = new MyTests(rand.nextInt(1000), "Name" + i);
            Student value = new Student("Major" + i, rand.nextInt(4) + 1);
            table.put(key, value);
        }

        // Print number of elements in each bucket
        for (int i = 0; i < table.getCapacity(); i++) {
            int bucketSize = table.getBucketSize(i);
            System.out.println("Bucket " + i + " size: " + bucketSize);
        }

        table.clear(); // Clear hash table and add 10,000 random elements again
        for (int i = 0; i < 10000; i++) {
            MyTests key = new MyTests(rand.nextInt(1000), "Name" + i);
            Student value = new Student("Major" + i, rand.nextInt(4) + 1);
            table.put(key, value);
        }
        // Print number of elements in each bucket again
        for (int i = 0; i < table.getCapacity(); i++) {
            int bucketSize = table.getBucketSize(i);
            System.out.println("Bucket " + i + " size: " + bucketSize);
        }
    }
}