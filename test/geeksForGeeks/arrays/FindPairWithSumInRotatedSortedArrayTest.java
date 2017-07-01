package geeksForGeeks.arrays;

import org.junit.Assert;
import org.testng.annotations.Test;

public class FindPairWithSumInRotatedSortedArrayTest {

  @Test
  public void findPair() {
    FindPairWithSumInRotatedSortedArray f = new FindPairWithSumInRotatedSortedArray();
    int[] input = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
    dumdTester(f, input);
    input = new int[] {2, 3, 4, 5, 6, 7, 8, 1};
    dumdTester(f, input);
    input = new int[] {3, 4, 5, 6, 7, 8, 1, 2};
    dumdTester(f, input);
    input = new int[] {4, 5, 6, 7, 8, 1, 2, 3};
    dumdTester(f, input);
    input = new int[] {5, 6, 7, 8, 1, 2, 3, 4};
    dumdTester(f, input);
    input = new int[] {6, 7, 8, 1, 2, 3, 4, 5};
    dumdTester(f, input);
    input = new int[] {7, 8, 1, 2, 3, 4, 5, 6};
    dumdTester(f, input);
    input = new int[] {8, 1, 2, 3, 4, 5, 6, 7};
    dumdTester(f, input);
  }

  private void dumdTester(FindPairWithSumInRotatedSortedArray f, int[] input) {
    Assert.assertArrayEquals(f.findPair(input, 9), new int[] {1, 8});
    Assert.assertArrayEquals(f.findPair(input, 10), new int[] {2, 8});
    Assert.assertArrayEquals(f.findPair(input, 11), new int[] {3, 8});
    Assert.assertArrayEquals(f.findPair(input, 12), new int[] {4, 8});
    Assert.assertArrayEquals(f.findPair(input, 13), new int[] {5, 8});
    Assert.assertArrayEquals(f.findPair(input, 14), new int[] {6, 8});
    Assert.assertArrayEquals(f.findPair(input, 15), new int[] {7, 8});
  }
}
