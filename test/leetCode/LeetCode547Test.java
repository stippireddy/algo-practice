package leetCode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode547Test {

  @Test
  public void findCircleNumUsingDFS() {
    LeetCode547 l = new LeetCode547();
    assertEquals(l.findCircleNumUsingDFS(new int[][] {{1}}), 1);
    assertEquals(l.findCircleNumUsingDFS(new int[][] {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}), 2);
    assertEquals(
        l.findCircleNumUsingDFS(
            new int[][] {
              {1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
              {1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
              {1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
              {0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0},
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0},
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0},
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}
            }),
        5);
  }

  @Test
  public void findCircleNumUsingBFS() {
    LeetCode547 l = new LeetCode547();
    assertEquals(l.findCircleNumUsingBFS(new int[][] {{1}}), 1);
    assertEquals(l.findCircleNumUsingBFS(new int[][] {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}), 2);
    assertEquals(
        l.findCircleNumUsingBFS(
            new int[][] {
              {1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
              {1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
              {1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
              {0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0},
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0},
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0},
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}
            }),
        5);
  }
}
