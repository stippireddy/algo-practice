package leetCode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode556Test {

  @Test
  public void nextGreaterElement() {
        LeetCode556 l = new LeetCode556();
        assertEquals(l.nextGreaterElement(12), 21);
        assertEquals(l.nextGreaterElement(1234), 1243);
        assertEquals(l.nextGreaterElement(4321), -1);
        assertEquals(l.nextGreaterElement(534976), 536479);
        assertEquals(l.nextGreaterElement(218765), 251678);
        assertEquals(l.nextGreaterElement(1999999999), -1);
        assertEquals(l.nextGreaterElement(12443322), 13222344);
  }
}
