/**
 * Solves Project Euler Problem 1.
 */
public class ProjectEulerOne {
  /**
   * Computes and prints the sum of all the multiples of 3 or 5 below 1000.
   * @param args ignored.
   */
  public static void main(String[] args) {
    int sum = computeSumOfMultiples(1000);
    System.out.print("Sum = " + sum);
  }

  /**
   * Computes the sum of all the multiples of 3 or 5 below upperBound.
   * @param upperBound The upper bound for calculating sum of multiples.
   * @return the sum of multiples.
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
