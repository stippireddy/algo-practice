package leetCode;

import org.junit.Assert;
import org.testng.annotations.Test;

public class LeetCode026Test {

  @Test
  public void removeDuplicates() {
    LeetCode026 l = new LeetCode026();
    int[] input = new int[] {1, 1, 1, 1, 1};
    //int[] output = new int[] {1, 1, 1, 1, 1};
    Assert.assertEquals(1, l.removeDuplicates(input));
    //Assert.assertArrayEquals(output, input);

    input = new int[] {1, 1, 1, 1, 1, 2, 2};
    //output = new int[] {1, 2, 1, 1, 1, 1, 2};
    Assert.assertEquals(2, l.removeDuplicates(input));
    //Assert.assertArrayEquals(output, input);

    input = new int[] {1, 2, 3, 4, 5, 6};
    //output = new int[] {1, 2, 3, 4, 5, 6};
    Assert.assertEquals(6, l.removeDuplicates(input));
    //Assert.assertArrayEquals(output, input);
  }
}
