package geeksForGeeks.arrays;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Arrays031Test {

  @Test
  public void sort() {
    Arrays031 a = new Arrays031();
    int[] input = new int[]{};
    a.sort(input);
    Assert.assertArrayEquals(input, new int[]{});
    input = new int[]{1, 1, 1, 1};
    a.sort(input);
    Assert.assertArrayEquals(input, new int[]{1, 1, 1, 1});
    input = new int[]{0, 0, 0, 0};
    a.sort(input);
    Assert.assertArrayEquals(input, new int[]{0, 0, 0, 0});
    input = new int[]{1, 0, 1, 0, 1, 0};
    a.sort(input);
    Assert.assertArrayEquals(input, new int[]{0, 0, 0, 1, 1, 1});
    input = new int[]{1, 1, 1, 1, 0, 0, 0, 0};
    a.sort(input);
    Assert.assertArrayEquals(input, new int[]{0, 0, 0, 0, 1, 1, 1, 1});
    input = new int[]{0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
    a.sort(input);
    Assert.assertArrayEquals(input, new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 1});
    input = new int[]{2, 2, 2, 2};
    a.sort(input);
    Assert.assertArrayEquals(input, new int[]{2, 2, 2, 2});
    input = new int[]{1, 1, 1, 1};
    a.sort(input);
    Assert.assertArrayEquals(input, new int[]{1, 1, 1, 1});
    input = new int[]{2, 1, 2, 1, 2, 1};
    a.sort(input);
    Assert.assertArrayEquals(input, new int[]{1, 1, 1, 2, 2, 2});
    input = new int[]{2, 2, 2, 2, 1, 1, 1, 1};
    a.sort(input);
    Assert.assertArrayEquals(input, new int[]{1, 1, 1, 1, 2, 2, 2, 2});
    input = new int[]{1, 2, 1, 2, 1, 1, 2, 2, 2, 1};
    a.sort(input);
    Assert.assertArrayEquals(input, new int[]{1, 1, 1, 1, 1, 2, 2, 2, 2, 2});
    input = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2};
    a.sort(input);
    Assert.assertArrayEquals(input, new int[]{0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2});
    input = new int[]{1, 0, 2, 2, 0, 1, 1, 1, 2, 2, 0, 0};
    a.sort(input);
    Assert.assertArrayEquals(input, new int[]{0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2});
    input = new int[]{2, 1, 0, 2, 0, 1, 0, 2, 1};
    a.sort(input);
    Assert.assertArrayEquals(input, new int[]{0, 0, 0, 1, 1, 1, 2, 2, 2});
    input = new int[]{2, 2, 2, 2, 1, 1, 1, 1, 0, 0, 0, 0};
    a.sort(input);
    Assert.assertArrayEquals(input, new int[]{0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2});
    input = new int[]{0, 0, 0, 0, 1, 2, 1, 2, 1, 1, 2, 2, 2, 1};
    a.sort(input);
    Assert.assertArrayEquals(input, new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2});
  }
}
