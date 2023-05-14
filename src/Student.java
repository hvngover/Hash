class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name can not be empty");
        }
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age between 0 and 120");
        }
        this.name = name;
        this.age = age;
    }

    // Override toString() method to provide a string representation of Student
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}

