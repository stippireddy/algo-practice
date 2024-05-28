package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode445Test {

  @Test
  public void addTwoNumbersByReversingInputs() {
    LeetCode445 l = new LeetCode445();
    testHelperForAddTwoNumbersByReversingInputs(l, new int[]{5, 4, 5}, new int[]{5, 4, 5},
        new int[]{1, 0, 9, 0});
    testHelperForAddTwoNumbersByReversingInputs(l, new int[]{5, 4, 5}, new int[]{},
        new int[]{5, 4, 5});
    testHelperForAddTwoNumbersByReversingInputs(l, new int[]{}, new int[]{5, 4, 5},
        new int[]{5, 4, 5});
    testHelperForAddTwoNumbersByReversingInputs(l, new int[]{}, new int[]{}, new int[]{});
    testHelperForAddTwoNumbersByReversingInputs(l, new int[]{8, 7, 2, 4, 3}, new int[]{5, 6, 4},
        new int[]{8, 7, 8, 0, 7});
  }

  private void testHelperForAddTwoNumbersByReversingInputs(LeetCode445 l, int[] list1, int[] list2,
      int[] expectedResult) {
    ListNode l1 = ListUtils.createList(list1);
    ListNode l2 = ListUtils.createList(list2);
    assertEquals(ListUtils.listToArray(l.addTwoNumbersByReversingInputs(l1, l2)), expectedResult);
  }

  @Test
  public void addTwoNumbersUsingStacks() {
    LeetCode445 l = new LeetCode445();
    testHelperForAddTwoNumbersUsingStacks(l, new int[]{5, 4, 5}, new int[]{5, 4, 5},
        new int[]{1, 0, 9, 0});
    testHelperForAddTwoNumbersUsingStacks(l, new int[]{5, 4, 5}, new int[]{},
        new int[]{5, 4, 5});
    testHelperForAddTwoNumbersUsingStacks(l, new int[]{}, new int[]{5, 4, 5},
        new int[]{5, 4, 5});
    testHelperForAddTwoNumbersUsingStacks(l, new int[]{}, new int[]{}, new int[]{});
    testHelperForAddTwoNumbersUsingStacks(l, new int[]{8, 7, 2, 4, 3}, new int[]{5, 6, 4},
        new int[]{8, 7, 8, 0, 7});
  }

  private void testHelperForAddTwoNumbersUsingStacks(LeetCode445 l, int[] list1, int[] list2,
      int[] expectedResult) {
    ListNode l1 = ListUtils.createList(list1);
    ListNode l2 = ListUtils.createList(list2);
    assertEquals(ListUtils.listToArray(l.addTwoNumbersUsingStacks(l1, l2)), expectedResult);
  }

  @Test
  public void addTwoNumbersReversingSolution() {
    LeetCode445 l = new LeetCode445();
    testHelperForAddTwoNumbersReversingSolution(l, new int[]{5, 4, 5}, new int[]{5, 4, 5},
        new int[]{1, 0, 9, 0});
    testHelperForAddTwoNumbersReversingSolution(l, new int[]{5, 4, 5}, new int[]{},
        new int[]{5, 4, 5});
    testHelperForAddTwoNumbersReversingSolution(l, new int[]{}, new int[]{5, 4, 5},
        new int[]{5, 4, 5});
    testHelperForAddTwoNumbersReversingSolution(l, new int[]{}, new int[]{}, new int[]{});
    testHelperForAddTwoNumbersReversingSolution(l, new int[]{8, 7, 2, 4, 3}, new int[]{5, 6, 4},
        new int[]{8, 7, 8, 0, 7});
  }

  private void testHelperForAddTwoNumbersReversingSolution(LeetCode445 l, int[] list1, int[] list2,
      int[] expectedResult) {
    ListNode l1 = ListUtils.createList(list1);
    ListNode l2 = ListUtils.createList(list2);
    assertEquals(ListUtils.listToArray(l.addTwoNumbersReversingSolution(l1, l2)), expectedResult);
  }
}
