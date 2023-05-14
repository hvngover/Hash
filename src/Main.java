import java.util.Random;
public class Main {
    public static void main(String[] args) {
        MyHashTable<MyTests, Student> table = new MyHashTable<>();

        Random rand = new Random();
        for (int i = 0; i < 10000; i++) {
            MyTests key = new MyTests(rand.nextInt(1000), "Name" + i);
            Student value = new Student("Major" + i, rand.nextInt(4) + 1);
            table.put(key, value);
        }
    }
}