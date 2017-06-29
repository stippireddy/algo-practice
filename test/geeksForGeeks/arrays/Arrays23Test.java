package geeksForGeeks.arrays;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Arrays23Test {

  @Test
  public void segregateZeroesOnes() {
    Arrays23 a = new Arrays23();
    int[] input = new int[] {};
    a.segregateZeroesOnes(input);
    assertEquals(input, new int[] {});
    input = new int[] {1, 1, 1, 1};
    a.segregateZeroesOnes(input);
    assertEquals(input, new int[] {1, 1, 1, 1});
    input = new int[] {0, 0, 0, 0};
    a.segregateZeroesOnes(input);
    assertEquals(input, new int[] {0, 0, 0, 0});
    input = new int[] {1, 0, 1, 0, 1, 0};
    a.segregateZeroesOnes(input);
    assertEquals(input, new int[] {0, 0, 0, 1, 1, 1});
    input = new int[] {1, 1, 1, 1, 0, 0, 0, 0};
    a.segregateZeroesOnes(input);
    assertEquals(input, new int[] {0, 0, 0, 0, 1, 1, 1, 1});
    input = new int[] {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
    a.segregateZeroesOnes(input);
    assertEquals(input, new int[] {0, 0, 0, 0, 0, 1, 1, 1, 1, 1});
  }
}
