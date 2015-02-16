/**
 * To solve problem Euler one.
 */
public class ProjectEulerOne {
  /**
   * Prints the sum of multiples of 3 or 5 below 1000.
   * @param args An argument, ignored.
   */
  public static void main(String[] args) {
    int sum = computeSumOfMultiples(1000);
    System.out.print("Sum = " + sum);
  }

  /**
   * Calculates and returns the sum of multiples of 3 or 5.
   * @param upperBound The upper bound for summation
   * @return the Sum.
   */
  public static int computeSumOfMultiples(int upperBound) {
    int sum = 0;
    for (int i = 1; i < upperBound; i++) {
      if (checkIfMultiple(i)) {
        sum = sum + i;
      }
    }
    return sum;
  }

  /**
   * Checks if an integer is a multiple of 3 or 5.
   * @param i Integer to check.
   * @return true if a multiple of 3 or 5.
   */
  public static boolean checkIfMultiple(int i) {
    if ((i % 3 == 0) || (i % 5 == 0)) {
      return true;
    }
    else {
      return false;
    }
  }
}
