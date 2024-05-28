package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode434Test {

  @Test
  public void countSegments() {
    LeetCode434 l = new LeetCode434();
    assertEquals(l.countSegments("  Eich bin  en   Berliner   "), 4);
    assertEquals(l.countSegments("  Eich bin  en  ! Berliner   "), 5);
    assertEquals(l.countSegments("Eich bin  en Berliner"), 4);
  }
}
