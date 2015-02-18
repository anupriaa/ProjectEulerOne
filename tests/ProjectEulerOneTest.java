import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests the ComputeSumOfMultiples() method for small upper bounds.
 */
public class ProjectEulerOneTest {
  /**
   * Tests the ComputeSumOfMultiples() method for small values of upper bound.
   * @throws Exception if error occurs.
   */
  @Test
  public void testComputeSumOfMultiples() throws Exception {
    assertEquals("Checking for upper bound = 10" , 23 , ProjectEulerOne.computeSumOfMultiples(10));
    assertEquals("Checking for upper bound = 20" , 78 , ProjectEulerOne.computeSumOfMultiples(20));
  }
}