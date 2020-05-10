package geeksForGeeks.arrays;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class CountRepeatedElementsTest {

  @Test
  public void findCount() {
    CountRepeatedElements testObj = new CountRepeatedElements();
    assertEquals(testObj.findCount(new int[]{1, 2, 3, 4, 4, 4, 5, 6}), new int[]{4, 3});
    assertEquals(testObj.findCount(new int[]{4, 4, 4, 4, 4}), new int[]{4, 5});
    assertEquals(testObj.findCount(new int[]{6, 7, 8, 9, 10, 10, 11}), new int[]{10, 2});
    assertEquals(testObj.findCount(new int[]{6, 7, 8, 9, 10, 10, 10}), new int[]{10, 3});
    assertEquals(testObj.findCount(new int[]{1, 1}), new int[]{1, 2});
  }
}
