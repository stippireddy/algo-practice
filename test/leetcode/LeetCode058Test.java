package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode058Test {

  @Test
  public void lengthOfLastWord() {
    LeetCode058 l = new LeetCode058();
    assertEquals(l.lengthOfLastWord(" "), 0);
    assertEquals(l.lengthOfLastWord("Hello Elixir"), 6);
    assertEquals(l.lengthOfLastWord(""), 0);
    assertEquals(l.lengthOfLastWord("  Eich bin  en   Berliner   "), 8);
    assertEquals(l.lengthOfLastWord("  Eich bin  en  ! Berliner   "), 8);
    assertEquals(l.lengthOfLastWord("Eich bin  en Berliner"), 8);
  }
}
