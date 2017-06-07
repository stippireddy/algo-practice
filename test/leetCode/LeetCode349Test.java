package leetCode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode349Test {

  @Test
  public void intersectionUsingTwoHashSets() {
    LeetCode349 l = new LeetCode349();
    assertEquals(
        new int[] {1, 2, 3},
        l.intersectionUsingTwoHashSets(new int[] {1, 2, 3, 1, 2, 3}, new int[] {3, 2, 1}));
    assertEquals(new int[] {}, l.intersectionUsingTwoHashSets(new int[] {}, new int[] {}));
    assertEquals(new int[] {}, l.intersectionUsingTwoHashSets(new int[] {1}, new int[] {}));
  }

  @Test
  public void intersectionSortingInputs() {
    LeetCode349 l = new LeetCode349();
    assertEquals(
        new int[] {1, 2, 3},
        l.intersectionSortingInputs(new int[] {1, 2, 3, 1, 2, 3}, new int[] {3, 2, 1}));
    assertEquals(new int[] {}, l.intersectionSortingInputs(new int[] {}, new int[] {}));
    assertEquals(new int[] {}, l.intersectionSortingInputs(new int[] {1}, new int[] {}));
  }
}
