package leetCode;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;

import org.testng.annotations.Test;

public class LeetCode442Test {

  @Test
  public void findDuplicates() {
    LeetCode442 l = new LeetCode442();
    assertEquals(l.findDuplicates(new int[] {1, 2, 3, 1, 2}), Arrays.asList(1, 2));
    assertEquals(l.findDuplicates(new int[] {4, 3, 2, 7, 8, 2, 3, 1}), Arrays.asList(2, 3));
    assertEquals(l.findDuplicates(new int[] {1, 1}), Arrays.asList(1));
  }
}
