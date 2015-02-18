/**
 * Solves Project Euler problem 1.
 */
public class ProjectEulerOne {
  /**
   * Computes the sum of multiples below 1000.
   * @param args ignored.
   */
  public static void main(String[] args) {
    int sum = computeSumOfMultiples(1000);
    System.out.print("Sum = " + sum);
  }
  /**
   * Computes the sum of multiples of 3 and 5 below upperBound.
   * @param upperBound The upper bound for computing the sum.
   * @return the sum.
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
