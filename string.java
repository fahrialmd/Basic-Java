public class string {
    public static void main(String[] args) {
        // String declaration
        String greeting = "Hello, World!";
        System.out.println(greeting); // Output: Hello, World!

        // String concatenation
        String name = "John";
        String message = greeting + " My name is " + name + ".";
        System.out.println(message); // Output: Hello, World! My name is John.

        // String length
        int length = message.length();
        System.out.println("Length of the message: " + length); // Output: Length of the message: 38

        // String comparison
        String str1 = "Hello";
        String str2 = "hello";
        boolean isEqual = str1.equals(str2);
        System.out.println("Are the strings equal? " + isEqual); // Output: Are the strings equal? false

        // Substring
        String subStr = message.substring(7, 12);
        System.out.println("Substring: " + subStr); // Output: Substring: World

        // Character at a specific index
        char ch = message.charAt(0);
        System.out.println("Character at index 0: " + ch); // Output: Character at index 0: H

        // String to upper case
        String upperCaseStr = message.toUpperCase();
        System.out.println("Uppercase: " + upperCaseStr); // Output: Uppercase: HELLO, WORLD! MY NAME IS JOHN.

        // String to lower case
        String lowerCaseStr = message.toLowerCase();
        System.out.println("Lowercase: " + lowerCaseStr); // Output: Lowercase: hello, world! my name is john.
    }
}
