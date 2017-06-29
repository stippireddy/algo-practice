package geeksForGeeks.arrays;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Arrays109Test {

  @Test
  public void convert() {
    Arrays109 a = new Arrays109();
    int[] input = new int[] {};
    a.convertBySorting(input);
    Assert.assertArrayEquals(input, new int[] {});
    input = new int[] {1, 2, 3, 4};
    a.convertBySorting(input);
    Assert.assertArrayEquals(input, new int[] {2, 1, 4, 3});
    input = new int[] {1, 1, 1, 1, 2, 2, 2, 2};
    a.convertBySorting(input);
    Assert.assertArrayEquals(input, new int[] {1, 1, 1, 1, 2, 2, 2, 2});
    input = new int[] {1, 1, 2, 3, 4, 2, 3, 4};
    a.convertBySorting(input);
    Assert.assertArrayEquals(input, new int[] {1, 1, 2, 2, 3, 3, 4, 4});
  }
}
