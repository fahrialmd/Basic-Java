public class class_simple {

    // Fields
    private final String name;
    private final int age;

    // Constructor
    public class_simple(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Create an object of the class
        class_simple person = new class_simple("Alice", 25);
        person.displayDetails(); // Call the method
    }
}
