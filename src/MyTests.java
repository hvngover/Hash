class MyTests {
    private int id;
    private String name;

    public MyTests(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        int result = 17; // Start with a prime number as the initial result
        result = 31 * result + id; // Multiply by a prime number and add the id
        result = 31 * result + (name != null ? name.hashCode() : 0); // Multiply by a prime number and add the hashCode of the name (or 0 if name is null)
        return result; // Return the final hash code
    }

}
