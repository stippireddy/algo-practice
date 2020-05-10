package leetCode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode628Test {

  @Test
  public void maximumProduct() {
    LeetCode628 l = new LeetCode628();
    assertEquals(l.maximumProduct(new int[]{1, 2, 3}), 6);
    assertEquals(l.maximumProduct(new int[]{1, 2, 3, 4, 5, 6}), 120);
    assertEquals(l.maximumProduct(new int[]{1, 2, 3, -4, -5, 6}), 120);
    assertEquals(l.maximumProduct(new int[]{1, 2, -3, 4, -5, 6}), 90);
    assertEquals(l.maximumProduct(new int[]{-1, 2, 3, 4, 5, -6}), 60);
    assertEquals(l.maximumProduct(new int[]{-1, -2, -3, -4, -5, -6}), -6);
    assertEquals(l.maximumProduct(new int[]{-1, -2, -3, 0, 5, 6}), 36);
  }
}
