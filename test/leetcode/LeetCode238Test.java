package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode238Test {

  @Test
  public void productExceptSelf1() {
    LeetCode238 l = new LeetCode238();
    assertEquals(l.productExceptSelf1(new int[]{0, 0}), new int[]{0, 0});
    assertEquals(l.productExceptSelf1(new int[]{0, 1, 2, 3, 4}), new int[]{24, 0, 0, 0, 0});
    assertEquals(l.productExceptSelf1(new int[]{1, 2, 3, 4}), new int[]{24, 12, 8, 6});
    assertEquals(l.productExceptSelf1(new int[]{-21, 35, 1, 56, 76, 91}),
        new int[]{13555360, -8133216, -284662560, -5083260, -3745560, -3128160});
  }

  @Test
  public void productExceptSelf2() {
    LeetCode238 l = new LeetCode238();
    assertEquals(l.productExceptSelf2(new int[]{0, 0}), new int[]{0, 0});
    assertEquals(l.productExceptSelf2(new int[]{0, 1, 2, 3, 4}), new int[]{24, 0, 0, 0, 0});
    assertEquals(l.productExceptSelf2(new int[]{1, 2, 3, 4}), new int[]{24, 12, 8, 6});
    assertEquals(l.productExceptSelf2(new int[]{-21, 35, 1, 56, 76, 91}),
        new int[]{13555360, -8133216, -284662560, -5083260, -3745560, -3128160});
  }

  @Test
  public void productExceptSelf3() {
    LeetCode238 l = new LeetCode238();
    assertEquals(l.productExceptSelf3(new int[]{0, 0}), new int[]{0, 0});
    assertEquals(l.productExceptSelf3(new int[]{0, 1, 2, 3, 4}), new int[]{24, 0, 0, 0, 0});
    assertEquals(l.productExceptSelf3(new int[]{1, 2, 3, 4}), new int[]{24, 12, 8, 6});
    assertEquals(l.productExceptSelf3(new int[]{-21, 35, 1, 56, 76, 91}),
        new int[]{13555360, -8133216, -284662560, -5083260, -3745560, -3128160});
  }
}
