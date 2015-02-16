import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests the ProjectEulerOne class on small numbers.
 */
public class ProjectEulerOneTest {
  /**
   * Tests sum of multiples with 10.
   * @throws Exception if problem occurs during inspection.
   */
  @Test
  public void testComputeSumOfMultiples() throws Exception {
    assertEquals("test multiples below 10", 23 , ProjectEulerOne.computeSumOfMultiples(10));
  }

  /**
   * Checks if parameter is a multiple of 10.
   * @throws Exception if problem occurs.
   */
  @Test
  public void testCheckIfMultiple() throws Exception {
    assertEquals("test for 3", true , ProjectEulerOne.checkIfMultiple(3));
    assertEquals("test for 5", true , ProjectEulerOne.checkIfMultiple(5));
    assertEquals("test for 8", false , ProjectEulerOne.checkIfMultiple(8));
  }
}