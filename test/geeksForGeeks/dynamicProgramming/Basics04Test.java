package geeksForGeeks.dynamicProgramming;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Basics04Test {

  @Test
  public void findMaxContiguousSumKadane() {
    Basics04 b = new Basics04();
    assertEquals(b.findMaxContiguousSumKadane(new int[]{-8, -9, -3, -10, -7, -1}), -1);
    assertEquals(b.findMaxContiguousSumKadane(new int[]{-8}), -8);
  }
}
