package leetCode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LeetCode191Test {

  @Test
  public void hammingWeightUsingUnsignedShift() {
    LeetCode191 l = new LeetCode191();
    Assert.assertEquals(l.hammingWeightUsingUnsignedShift(Integer.MAX_VALUE + 1), 1);
    Assert.assertEquals(l.hammingWeightUsingUnsignedShift(Integer.MAX_VALUE + Integer.MAX_VALUE),
        31);
    Assert.assertEquals(l.hammingWeightUsingUnsignedShift(Integer.MAX_VALUE + 2), 2);
    Assert.assertEquals(l.hammingWeightUsingUnsignedShift(4096), 1);
    Assert.assertEquals(l.hammingWeightUsingUnsignedShift(4095), 12);
  }

  @Test
  public void hammingWeightUsingShiftingMask() {
    LeetCode191 l = new LeetCode191();
    Assert.assertEquals(l.hammingWeightUsingShiftingMask(Integer.MAX_VALUE + 1), 1);
    Assert.assertEquals(l.hammingWeightUsingShiftingMask(Integer.MAX_VALUE + Integer.MAX_VALUE),
        31);
    Assert.assertEquals(l.hammingWeightUsingShiftingMask(Integer.MAX_VALUE + 2), 2);
    Assert.assertEquals(l.hammingWeightUsingShiftingMask(4096), 1);
    Assert.assertEquals(l.hammingWeightUsingShiftingMask(4095), 12);
  }

  @Test
  public void hammingWeightByCountingLSB() {
    LeetCode191 l = new LeetCode191();
    Assert.assertEquals(l.hammingWeightByCountingLSB(Integer.MAX_VALUE + 1), 1);
    Assert.assertEquals(l.hammingWeightByCountingLSB(Integer.MAX_VALUE + Integer.MAX_VALUE), 31);
    Assert.assertEquals(l.hammingWeightByCountingLSB(Integer.MAX_VALUE + 2), 2);
    Assert.assertEquals(l.hammingWeightByCountingLSB(4096), 1);
    Assert.assertEquals(l.hammingWeightByCountingLSB(4095), 12);
  }

  @Test
  public void test() {
    System.out.println(Integer.toBinaryString(10));
    System.out.println(Integer.toBinaryString(~(9)));
    System.out.println(Integer.toBinaryString(10 & 10 - 1));
    System.out.println(Integer.toBinaryString(10 & ~(10 - 1)));
  }
}
