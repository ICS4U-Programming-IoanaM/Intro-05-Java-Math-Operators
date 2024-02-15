/**
 * A program that prints math operations.
 *
 * @author Ioana Marinescu
 * @version 1.0
 * @since 2024-02-012
 */
public final class MathOperators {
  /** Private constructor to prevent instantiation of this utility class. */
  private MathOperators() {
    // Wow no no whitespace.
  }

  /**
   * The main method prints various math operations.
   *
   * @param args Command-line arguments (not used in this program)
   */
  public static void main(final String[] args) {
    final int three = 3;
    final int six = 6;
    final int four = 4;
    System.out.println("Addition: 2 + 2 = " + (2 + 2));
    System.out.println("Subtraction: 2 - 2 = " + (2 - 2));
    System.out.println("Multiplication: 2 * 3 = " + (2 * three));
    System.out.println("Division: 6 / 2 = " + (six / 2));
    System.out.println("More Division: 2 / 3 = " + 2 / (float) three);
    System.out.println("Even More Division: 2 / 3 = " + 2 / (double) three);
    System.out.println("Exponential: 2^3 = " + (int) (Math.pow(2, three)));
    System.out.println("Square Root: √4 = " + (int) (Math.sqrt(four)));
  }
}
