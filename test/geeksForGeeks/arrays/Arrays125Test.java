package geeksForGeeks.arrays;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Arrays125Test {

  @Test
  public void containsDuplicateWithinKDistace() {
    Arrays125 testObj = new Arrays125();
    assertTrue(testObj.containsDuplicateWithinKDistace(new int[] {1, 2, 3, 1, 4, 5}, 3));
    assertFalse(testObj.containsDuplicateWithinKDistace(new int[] {1, 2, 3, 4, 1, 2, 3, 4}, 3));
    assertFalse(testObj.containsDuplicateWithinKDistace(new int[] {1, 2, 3, 4, 1, 2, 3, 4}, 3));
    assertFalse(testObj.containsDuplicateWithinKDistace(new int[] {1, 2, 3, 4, 5}, 3));
  }
}
