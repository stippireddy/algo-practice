package leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LeetCode461Test {

  @Test
  public void hammingDistance() {
    LeetCode461 l = new LeetCode461();
    Assert.assertEquals(l.hammingDistance(1, 4), 2);
    Assert.assertEquals(l.hammingDistance(100, 99), 3);
  }
}
