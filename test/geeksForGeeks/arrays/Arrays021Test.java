package geeksForGeeks.arrays;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Arrays021Test {

  @Test
  public void isXTheMajorityElement() {
    Arrays021 a = new Arrays021();
    assertTrue(a.isXTheMajorityElement(new int[] {1, 1, 1, 2, 3}, 1));
    assertFalse(a.isXTheMajorityElement(new int[] {0, 1, 1, 2, 3}, 1));
    assertTrue(a.isXTheMajorityElement(new int[] {1}, 1));
    assertFalse(a.isXTheMajorityElement(new int[] {0, 1, 1, 2, 3}, 0));
    assertFalse(a.isXTheMajorityElement(new int[] {0}, 1));
  }
}
