package leetCode;

import org.junit.Assert;
import org.testng.annotations.Test;

public class LeetCode283Test {

  @Test
  public void moveZeroes() {
    LeetCode283 l = new LeetCode283();
    int[] input1 = {0, 1, 0, 3, 12};
    int[] output1 = {1, 3, 12, 0, 0};
    l.moveZeroes(input1);
    Assert.assertArrayEquals(output1, input1);
    int[] input2 = {0};
    int[] output2 = {0};
    l.moveZeroes(input2);
    Assert.assertArrayEquals(input2, output2);
    int[] input3 = {1, 3, 12};
    int[] output3 = {1, 3, 12};
    l.moveZeroes(input3);
    Assert.assertArrayEquals(input3, output3);
    int[] input4 = {1, 2, 3, 0, 0, 0};
    int[] output4 = {1, 2, 3, 0, 0, 0};
    l.moveZeroes(input4);
    Assert.assertArrayEquals(input4, output4);
  }
}
