import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProjectEulerOneTest {
  /**
   * Checks sum of multiples below 10.
   * @throws Exception when an error occurs.
   */
  @Test
  public void testComputeSumOfMultiples() throws Exception {
    assertEquals("Checking for multiples below 10",23,ProjectEulerOne.computeSumOfMultiples(10));
  }
}