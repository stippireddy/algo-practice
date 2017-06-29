package geeksForGeeks.arrays;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Arrays055Test {

  @Test
  public void findSubArrayWithGivenSumPositive() {
    Arrays055 a = new Arrays055();
    Assert.assertArrayEquals(
        a.findSubArrayWithGivenSumPositive(new int[] {1, 2, 3, 7, 5}, 12), new int[] {2, 4});
    Assert.assertArrayEquals(
        a.findSubArrayWithGivenSumPositive(new int[] {12, 2, 3, 7, 5}, 12), new int[] {1, 1});
    Assert.assertArrayEquals(
        a.findSubArrayWithGivenSumPositive(new int[] {1, 2, 3, 6, 6}, 12), new int[] {1, 4});
    Assert.assertArrayEquals(
        a.findSubArrayWithGivenSumPositive(new int[] {1, 2, 3, 4, 12}, 12), new int[] {5, 5});
    Assert.assertArrayEquals(
        a.findSubArrayWithGivenSumPositive(new int[] {1, 4}, 2), new int[] {-1, -1});
  }

  @Test
  public void findSubArrayWithGivenSumNegative() {
    Arrays055 a = new Arrays055();
    Assert.assertArrayEquals(
        a.findSubArrayWithGivenSumNegative(new int[] {1, 2, 3, 7, 5}, 12), new int[] {2, 4});
    Assert.assertArrayEquals(
        a.findSubArrayWithGivenSumNegative(new int[] {12, 2, 3, 7, 5}, 12), new int[] {1, 1});
    Assert.assertArrayEquals(
        a.findSubArrayWithGivenSumNegative(new int[] {1, 2, 3, 6, 6}, 12), new int[] {1, 4});
    Assert.assertArrayEquals(
        a.findSubArrayWithGivenSumNegative(new int[] {1, 2, 3, 4, 12}, 12), new int[] {5, 5});
    Assert.assertArrayEquals(
        a.findSubArrayWithGivenSumNegative(new int[] {1, 4}, 2), new int[] {-1, -1});
    Assert.assertArrayEquals(
        a.findSubArrayWithGivenSumNegative(new int[] {1, 4, 20, 3, 10, 5}, 33), new int[] {3, 5});
    Assert.assertArrayEquals(
        a.findSubArrayWithGivenSumNegative(new int[] {10, 2, -2, -20, 10}, -10), new int[] {1, 4});
    Assert.assertArrayEquals(
        a.findSubArrayWithGivenSumNegative(new int[] {-10, 0, 2, -2, -20, 10}, 20),
        new int[] {-1, -1});
  }
}
