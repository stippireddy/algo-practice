package geeksForGeeks.arrays;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Arrays130Test {

  @Test
  public void findLargestPairSum() {
    Arrays130 testObj = new Arrays130();
    assertEquals(testObj.findLargestPairSum(new int[]{1, 2}), 3);
    assertEquals(testObj.findLargestPairSum(new int[]{1, 2, 3, 4, 5, 6}), 11);
    assertEquals(testObj.findLargestPairSum(new int[]{12, 34, 10, 6, 40}), 74);
    assertEquals(testObj.findLargestPairSum(new int[]{6, 5, 4, 3, 2, 1}), 11);
  }
}
