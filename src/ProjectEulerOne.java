/**
 * Euler Problem 1.
 */
public class ProjectEulerOne {
  /**
   * Prints the sum of multiples.
   * @param args Ignored.
   */
  public static void main(String[] args) {
    int sum = computeSumOfMultiples(1000);
    System.out.print("Sum = " + sum);
  }

  /**
   * Computes the sum of multiples below 1000.
   * @param upperBound The upper bound
   * @return the sum of mutipules.
   */
  public static int computeSumOfMultiples(int upperBound) {
    int sum = 0;
    for (int i = 1; i < upperBound; i++) {
      if ((i % 3 == 0) || (i % 5 == 0)) {
        sum = sum + i;
      }
    }
    return sum;
  }
}
