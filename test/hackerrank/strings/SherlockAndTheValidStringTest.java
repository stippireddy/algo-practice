package hackerrank.strings;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class SherlockAndTheValidStringTest {

  @Test
  public void isValid() {
    assertEquals("YES", SherlockAndTheValidString.isValid("aabbcc"));
    assertEquals("NO", SherlockAndTheValidString.isValid("aabbcd"));
    assertEquals("YES", SherlockAndTheValidString.isValid("aabbccc"));
    assertEquals("YES", SherlockAndTheValidString.isValid("aabbc"));
    assertEquals("YES", SherlockAndTheValidString.isValid("aabcd"));
    assertEquals("NO", SherlockAndTheValidString.isValid("aaabbbcc"));
    assertEquals("YES", SherlockAndTheValidString.isValid("aaabbcc"));
    assertEquals("NO", SherlockAndTheValidString.isValid("aabbbccd"));
  }
}
