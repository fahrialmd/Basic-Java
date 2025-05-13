public class operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b)); // 15
        System.out.println("Subtraction: " + (a - b)); // 5
        System.out.println("Multiplication: " + (a * b)); // 50
        System.out.println("Division: " + (a / b)); // 2
        System.out.println("Modulus: " + (a % b)); // 0

        // Relational Operators
        System.out.println("Equal to: " + (a == b)); // false
        System.out.println("Not equal to: " + (a != b)); // true
        System.out.println("Greater than: " + (a > b)); // true
        System.out.println("Less than: " + (a < b)); // false
        System.out.println("Greater than or equal to: " + (a >= b)); // true
        System.out.println("Less than or equal to: " + (a <= b)); // false

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("Logical AND: " + (x && y)); // false
        System.out.println("Logical OR: " + (x || y)); // true
        System.out.println("Logical NOT: " + (!x)); // false

        // Bitwise Operators
        int p = 5, q = 3; // 0101 and 0011 in binary
        System.out.println("Bitwise AND: " + (p & q)); // 1 (0001)
        System.out.println("Bitwise OR: " + (p | q)); // 7 (0111)
        System.out.println("Bitwise XOR: " + (p ^ q)); // 6 (0110)

        // Assignment Operators
        int c = 10;
        c += 5; // c = c + 5
        System.out.println("Add and assign: " + c); // 15
        c -= 3; // c = c - 3
        System.out.println("Subtract and assign: " + c); // 12
        c *= 2; // c = c * 2
        System.out.println("Multiply and assign: " + c); // 24
        c /= 4; // c = c / 4
        System.out.println("Divide and assign: " + c); // 6
        c %= 2; // c = c % 2
        System.out.println("Modulus and assign: " + c); // 0

        // Unary Operators
        int d = 5;
        System.out.println("Unary plus: " + (+d)); // 5
        System.out.println("Unary minus: " + (-d)); // -5
        System.out.println("Increment: " + (++d)); // 6
        System.out.println("Decrement: " + (--d)); // 5

        // Ternary Operator
        int e = 10, f = 20;
        int max = (e > f) ? e : f;
        System.out.println("Ternary operator (max): " + max); // 20

        // Shift Operators
        int g = 8; // 1000 in binary
        System.out.println("Left shift: " + (g << 2)); // 32 (100000 in binary)
        System.out.println("Right shift: " + (g >> 2)); // 2 (10 in binary)
        System.out.println("Unsigned right shift: " + (g >>> 2)); // 2
    }
}
