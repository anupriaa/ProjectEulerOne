import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests the ComputeSumOfMultiples() method of ProjectEulerOne class.
 */
public class ProjectEulerOneTest {
  /**
   * Tests the method ComputeSumOfMultiples() for smaller upper bounds.
   * @throws Exception if error occurs.
   */
  @Test
  public void testComputeSumOfMultiples() throws Exception {
    assertEquals("Checks for below 10", 23 , ProjectEulerOne.computeSumOfMultiples(10));
    assertEquals("Checks for below 10", 78 , ProjectEulerOne.computeSumOfMultiples(20));
  }
}