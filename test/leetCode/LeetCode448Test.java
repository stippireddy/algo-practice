package leetCode;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import org.testng.annotations.Test;

public class LeetCode448Test {

  @Test
  public void findDisappearedNumbersBySwapping() {
    LeetCode448 l = new LeetCode448();
    assertEquals(
        Arrays.asList(5, 6),
        l.findDisappearedNumbersBySwapping(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    assertEquals(new ArrayList<>(), l.findDisappearedNumbersBySwapping(new int[]{1, 2, 3}));
  }

  @Test
  public void findDisappearedNumbers() {
    LeetCode448 l = new LeetCode448();
    assertEquals(Arrays.asList(5, 6), l.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    assertEquals(new ArrayList<>(), l.findDisappearedNumbers(new int[]{1, 2, 3}));
  }

  @Test
  public void findDisappearedNumbersUsingCountArray() {
    LeetCode448 l = new LeetCode448();
    assertEquals(
        Arrays.asList(5, 6),
        l.findDisappearedNumbersUsingCountArray(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    assertEquals(new ArrayList<>(), l.findDisappearedNumbersUsingCountArray(new int[]{1, 2, 3}));
  }
}
