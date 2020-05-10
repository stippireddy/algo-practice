package geeksForGeeks.arrays;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Arrays115Test {

  @Test
  public void findClosestPair() {
    Arrays115 a = new Arrays115();
    Assert.assertArrayEquals(
        new int[]{22, 30}, a.findClosestPair(new int[]{10, 22, 28, 29, 30, 40}, 54));
    Assert.assertArrayEquals(new int[]{4, 10}, a.findClosestPair(new int[]{1, 3, 4, 7, 10}, 15));
    Assert.assertArrayEquals(
        new int[]{20, 40}, a.findClosestPair(new int[]{9, 10, 10, 15, 20, 30, 40, 65}, 60));
  }
}
