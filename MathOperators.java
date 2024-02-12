/**
 * A program that prints math operations.
 *
 * @author Ioana Marinescu
 * @version 1.0
 * @since 2024-02-012
 */

public final class MathOperators {
    /**
     * Private constructor to prevent instantiation of this utility class.
     */
    private MathOperators() {
    }

    /**
     * The main method prints various math operations.
     *
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        final int three = 3;
        final int six = 6;
        System.out.println("Addition: " + (2 + 2));
        System.out.println("Subtraction: " + (2 - 2));
        System.out.println("Multiplication: " + (2 * three));
        System.out.println("Division: " + (six / 2));
        System.out.println("More Division: " + 2 / (float) three);
    }
}
