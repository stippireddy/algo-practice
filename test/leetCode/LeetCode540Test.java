package leetCode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LeetCode540Test {

  @Test
  public void testSingleNonDuplicate() {
    LeetCode540 l = new LeetCode540();
    Assert.assertEquals(l.singleNonDuplicate(new int[]{1, 3, 3, 7, 7, 10, 10, 11, 11}), 1);
    Assert.assertEquals(l.singleNonDuplicate(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8}), 2);
    Assert.assertEquals(l.singleNonDuplicate(new int[]{3, 3, 7, 7, 10, 11, 11}), 10);
    Assert.assertEquals(l.singleNonDuplicate(new int[]{1, 3, 3}), 1);
    Assert.assertEquals(l.singleNonDuplicate(new int[]{1, 1, 3}), 3);
    Assert.assertEquals(l.singleNonDuplicate(new int[]{1}), 1);
  }
}
