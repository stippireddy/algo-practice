package geeksForGeeks.arrays;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Arrays142Test {

  @Test
  public void reOrder() {
    Arrays142 a = new Arrays142();
    int[] input = new int[]{50, 40, 70, 60, 90};
    int[] indices = new int[]{3, 0, 4, 1, 2};
    a.reOrder(input, indices);
    Assert.assertArrayEquals(new int[]{40, 60, 90, 50, 70}, input);
    Assert.assertArrayEquals(new int[]{0, 1, 2, 3, 4}, indices);
    input = new int[]{10, 11, 12};
    indices = new int[]{1, 0, 2};
    a.reOrder(input, indices);
    Assert.assertArrayEquals(new int[]{11, 10, 12}, input);
    Assert.assertArrayEquals(new int[]{0, 1, 2}, indices);
  }
}
