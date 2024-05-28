package leetcode;

import org.junit.Assert;
import org.testng.annotations.Test;

public class LeetCode027Test {

  @Test
  public void removeElement() {
    LeetCode027 l = new LeetCode027();
    int[] input1 = {0, 1, 0, 3, 12};
    Assert.assertEquals(3, l.removeElement(input1, 0));
    int[] input2 = {0};
    Assert.assertEquals(0, l.removeElement(input2, 0));
    int[] input3 = {1, 3, 12};
    Assert.assertEquals(3, l.removeElement(input3, 0));
    int[] input4 = {1, 2, 3, 0, 0, 0};
    Assert.assertEquals(3, l.removeElement(input4, 0));
  }
}
