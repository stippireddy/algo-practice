package leetCode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LeetCode191Test {

  @Test
  public void hammingWeight() {
    LeetCode191 l = new LeetCode191();
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
    System.out.println(Integer.toBinaryString(Integer.MIN_VALUE));
    Assert.assertEquals(l.hammingWeight(2147483647), 32);
  }
}
