package geeksForGeeks.arrays;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class SubarrayWithSameDistinctElementsAsOriginalTest {

  @Test
  public void getNumber() {
    SubarrayWithSameDistinctElementsAsOriginal testObj =
        new SubarrayWithSameDistinctElementsAsOriginal();
    assertEquals(testObj.getNumber(new int[] {2, 1, 3, 2, 3}), 5);
    assertEquals(testObj.getNumber(new int[] {2, 4, 5, 2, 1}), 2);
    assertEquals(testObj.getNumber(new int[] {2, 4, 4, 2, 4}), 9);
    assertEquals(testObj.getNumber(new int[] {1, 1}), 3);
    assertEquals(testObj.getNumber(new int[] {1}), 1);
  }
}
