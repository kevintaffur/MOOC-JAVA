
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        int stars = 1;
        int spaces = size - 1;
        for (int i = spaces; i >= 0; i--) {
            printSpaces(i);
            printStars(stars);
            stars++;
        }
    }

    public static void christmasTree(int height) {
        int spaces = height - 1;
        // stars per line.
        int stars = 1;
        // place for the base of the tree.
        int half = spaces - 1;
        for (int i = spaces; i >= 0; i--) {
            printSpaces(i);
            printStars(stars);
            stars += 2;
        }

        for (int i = 0; i < 2; i++) {
            printSpaces(half);
            printStars(3);
        }

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
