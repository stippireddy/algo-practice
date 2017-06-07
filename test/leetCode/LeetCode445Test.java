package leetCode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode445Test {

  @Test
  public void addTwoNumbers() {
    LeetCode445 l = new LeetCode445();
    testHelper(l, new int[] {5, 4, 5}, new int[] {5, 4, 5}, new int[] {1, 0, 9, 0});
    testHelper(l, new int[] {5, 4, 5}, new int[] {}, new int[] {5, 4, 5});
    testHelper(l, new int[] {}, new int[] {5, 4, 5}, new int[] {5, 4, 5});
    testHelper(l, new int[] {}, new int[] {}, new int[] {});
    testHelper(l, new int[] {8, 7, 2, 4, 3}, new int[] {5, 6, 4}, new int[] {8, 7, 8, 0, 7});
  }

  private void testHelper(LeetCode445 l, int[] list1, int[] list2, int[] expectedResult) {
    ListNode l1 = ListUtils.createList(list1);
    ListNode l2 = ListUtils.createList(list2);
    assertEquals(ListUtils.listToArray(l.addTwoNumbersByReversingInputs(l1, l2)), expectedResult);
  }
}
