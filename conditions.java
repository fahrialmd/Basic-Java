public class conditions {
    public static void main(String[] args) {
        // If statement
        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        }

        // If-else statement
        int y = 20;
        if (y < 10) {
            System.out.println("y is less than 10");
        } else {
            System.out.println("y is greater than or equal to 10");
        }

        // Switch statement
        int day = 3;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            default -> System.out.println("Invalid day");
        }
    }
}
