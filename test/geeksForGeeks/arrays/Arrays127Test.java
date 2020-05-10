package geeksForGeeks.arrays;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Arrays127Test {

  @Test
  public void modify() {
    Arrays127 testObj = new Arrays127();
    int[] input = new int[]{1};
    testObj.modify(input);
    assertEquals(input, new int[]{1});
    input = new int[]{1, 2, 3, 4, 5};
    testObj.modify(input);
    assertEquals(input, new int[]{2, 3, 8, 15, 20});
    input = new int[]{};
    testObj.modify(input);
    assertEquals(input, new int[]{});
  }
}
