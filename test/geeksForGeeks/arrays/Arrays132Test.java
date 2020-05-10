package geeksForGeeks.arrays;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Arrays132Test {

  @Test
  public void findPythogoreanTriplets() {
    Arrays132 a = new Arrays132();
    assertTrue(a.findPythogoreanTriplets(new int[]{3, 1, 4, 6, 5}));
    assertTrue(a.findPythogoreanTriplets(new int[]{1, 2, 4, 8, 6, 10}));
    assertTrue(a.findPythogoreanTriplets(new int[]{13, 1, 4, 61, 5, 12}));
    assertTrue(a.findPythogoreanTriplets(new int[]{25, 20, 15, 13, 7, 91, 201}));
    assertFalse(a.findPythogoreanTriplets(new int[]{10, 4, 6, 12, 5}));
  }
}
