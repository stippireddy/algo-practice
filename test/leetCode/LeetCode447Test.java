package leetCode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode447Test {

  @Test
  public void numberOfBoomerangs() {
    LeetCode447 l = new LeetCode447();
    assertEquals(l.numberOfBoomerangs(new int[][]{{1, 0}, {0, 0}, {2, 0}}), 2);
    assertEquals(l.numberOfBoomerangs(new int[][]{{1, 1}, {2, 2}, {3, 3}}), 2);
    assertEquals(l.numberOfBoomerangs(new int[][]{{0, 0}, {1, 0}, {-1, 0}, {0, 1}, {0, -1}}), 20);
    assertEquals(l.numberOfBoomerangs(new int[][]{{1, 1}}), 0);
  }
}
