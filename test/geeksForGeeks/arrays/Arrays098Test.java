package geeksForGeeks.arrays;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Arrays098Test {

  @Test
  public void findMinimumInRotatedArray() {
    Arrays098 a = new Arrays098();
    int[] input = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
    assertEquals(1, input[a.findMinimumInRotatedArray(input)]);
    input = new int[] {2, 3, 4, 5, 6, 7, 8, 1};
    assertEquals(1, input[a.findMinimumInRotatedArray(input)]);
    input = new int[] {3, 4, 5, 6, 7, 8, 1, 2};
    assertEquals(1, input[a.findMinimumInRotatedArray(input)]);
    input = new int[] {4, 5, 6, 7, 8, 1, 2, 3};
    assertEquals(1, input[a.findMinimumInRotatedArray(input)]);
    input = new int[] {5, 6, 7, 8, 1, 2, 3, 4};
    assertEquals(1, input[a.findMinimumInRotatedArray(input)]);
    input = new int[] {6, 7, 8, 1, 2, 3, 4, 5};
    assertEquals(1, input[a.findMinimumInRotatedArray(input)]);
    input = new int[] {7, 8, 1, 2, 3, 4, 5, 6};
    assertEquals(1, input[a.findMinimumInRotatedArray(input)]);
    input = new int[] {8, 1, 2, 3, 4, 5, 6, 7};
    assertEquals(1, input[a.findMinimumInRotatedArray(input)]);
    input = new int[] {1, 2, 3, 4, 5, 6, 7};
    assertEquals(1, input[a.findMinimumInRotatedArray(input)]);
    input = new int[] {2, 3, 4, 5, 6, 7, 1};
    assertEquals(1, input[a.findMinimumInRotatedArray(input)]);
    input = new int[] {3, 4, 5, 6, 7, 1, 2};
    assertEquals(1, input[a.findMinimumInRotatedArray(input)]);
    input = new int[] {4, 5, 6, 7, 1, 2, 3};
    assertEquals(1, input[a.findMinimumInRotatedArray(input)]);
    input = new int[] {5, 6, 7, 1, 2, 3, 4};
    assertEquals(1, input[a.findMinimumInRotatedArray(input)]);
    input = new int[] {6, 7, 1, 2, 3, 4, 5};
    assertEquals(1, input[a.findMinimumInRotatedArray(input)]);
    input = new int[] {7, 1, 2, 3, 4, 5, 6};
    assertEquals(1, input[a.findMinimumInRotatedArray(input)]);
  }

  @Test
  public void findMaximumInRotatedArray() {
    Arrays098 a = new Arrays098();
    int[] input = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
    assertEquals(8, input[a.findMaximumInRotatedArray(input)]);
    input = new int[] {2, 3, 4, 5, 6, 7, 8, 1};
    assertEquals(8, input[a.findMaximumInRotatedArray(input)]);
    input = new int[] {3, 4, 5, 6, 7, 8, 1, 2};
    assertEquals(8, input[a.findMaximumInRotatedArray(input)]);
    input = new int[] {4, 5, 6, 7, 8, 1, 2, 3};
    assertEquals(8, input[a.findMaximumInRotatedArray(input)]);
    input = new int[] {5, 6, 7, 8, 1, 2, 3, 4};
    assertEquals(8, input[a.findMaximumInRotatedArray(input)]);
    input = new int[] {6, 7, 8, 1, 2, 3, 4, 5};
    assertEquals(8, input[a.findMaximumInRotatedArray(input)]);
    input = new int[] {7, 8, 1, 2, 3, 4, 5, 6};
    assertEquals(8, input[a.findMaximumInRotatedArray(input)]);
    input = new int[] {8, 1, 2, 3, 4, 5, 6, 7};
    assertEquals(8, input[a.findMaximumInRotatedArray(input)]);
    input = new int[] {1, 2, 3, 4, 5, 6, 7};
    assertEquals(7, input[a.findMaximumInRotatedArray(input)]);
    input = new int[] {2, 3, 4, 5, 6, 7, 1};
    assertEquals(7, input[a.findMaximumInRotatedArray(input)]);
    input = new int[] {3, 4, 5, 6, 7, 1, 2};
    assertEquals(7, input[a.findMaximumInRotatedArray(input)]);
    input = new int[] {4, 5, 6, 7, 1, 2, 3};
    assertEquals(7, input[a.findMaximumInRotatedArray(input)]);
    input = new int[] {5, 6, 7, 1, 2, 3, 4};
    assertEquals(7, input[a.findMaximumInRotatedArray(input)]);
    input = new int[] {6, 7, 1, 2, 3, 4, 5};
    assertEquals(7, input[a.findMaximumInRotatedArray(input)]);
    input = new int[] {7, 1, 2, 3, 4, 5, 6};
    assertEquals(7, input[a.findMaximumInRotatedArray(input)]);
  }
}
