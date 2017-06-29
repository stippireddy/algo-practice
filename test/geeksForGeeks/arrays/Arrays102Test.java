package geeksForGeeks.arrays;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Arrays102Test {

  @Test
  public void moveZeroes() {
    Arrays102 a = new Arrays102();
    int[] input = new int[] {0, 0, 0, 0, 0};
    a.moveZeroes(input);
    Assert.assertArrayEquals(new int[] {0, 0, 0, 0, 0}, input);
    input = new int[] {1, 2, 3, 4, 5};
    a.moveZeroes(input);
    Assert.assertArrayEquals(new int[] {1, 2, 3, 4, 5}, input);
    input = new int[] {1, 2, 3, 4, 5, 0, 0, 0, 0, 0};
    a.moveZeroes(input);
    Assert.assertArrayEquals(new int[] {1, 2, 3, 4, 5, 0, 0, 0, 0, 0}, input);
    input = new int[] {1, 0, 2, 0, 3, 0, 4, 0, 5, 0};
    a.moveZeroes(input);
    Assert.assertArrayEquals(new int[] {1, 2, 3, 4, 5, 0, 0, 0, 0, 0}, input);
  }
}
