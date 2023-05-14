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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // If the objects are the same, they are equal
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // If the object is null or belongs to a different class, they are not equal
        }
        MyTests other = (MyTests) obj; // Cast the object to MyTests type
        return id == other.id && (name != null ? name.equals(other.name) : other.name == null); // Compare the id and name for equality
    }
}
