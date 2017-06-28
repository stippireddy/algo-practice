package geeksForGeeks.arrays;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Arrays104Test {

  @Test
  public void findPairsUsingHashing() {
    Arrays104 a = new Arrays104();
    assertEquals(a.findPairsUsingHashing(new int[] {6, 4, 5, 8, 7}, 2), 3);
    assertEquals(a.findPairsUsingHashing(new int[] {1, 3, 1, 8}, 2), 2);
    assertEquals(a.findPairsUsingHashing(new int[] {1, 3, 1, 3}, 2), 4);
    assertEquals(a.findPairsUsingHashing(new int[] {1, 3, 1, 1}, 2), 3);
    assertEquals(a.findPairsUsingHashing(new int[] {1, 3, 1, 1, 3}, 2), 6);
    assertEquals(
        a.findPairsUsingHashing(
            new int[] {
              777, 915, 793, 335, 386, 492, 649, 421, 362, 27, 690, 59, 763, 926, 540, 426, 172,
              736, 211, 368, 567, 429, 782, 530, 862, 123, 67, 135, 929, 802, 22, 58, 69, 167, 393,
              456, 11, 42, 229, 373, 421, 919, 784, 537, 198, 324, 315, 370, 413, 526, 91, 980, 956,
              873, 862, 170, 996, 281, 305, 925, 84, 327, 336, 505, 846, 729, 313, 857, 124, 895,
              582, 545, 814, 367, 434, 364, 43, 750, 87, 808, 276, 178, 788, 584
            },
            86),
        8);
  }

  @Test
  public void findPairsUsingSorting() {
    Arrays104 a = new Arrays104();
    assertEquals(a.findPairsUsingSorting(new int[] {6, 4, 5, 8, 7}, 2), 3);
    assertEquals(a.findPairsUsingSorting(new int[] {1, 3, 1, 8}, 2), 2);
    assertEquals(a.findPairsUsingSorting(new int[] {1, 3, 1, 3}, 2), 4);
    assertEquals(a.findPairsUsingSorting(new int[] {1, 3, 1, 1}, 2), 3);
    assertEquals(a.findPairsUsingSorting(new int[] {1, 3, 1, 1, 3}, 2), 6);
    assertEquals(
        a.findPairsUsingSorting(
            new int[] {
              777, 915, 793, 335, 386, 492, 649, 421, 362, 27, 690, 59, 763, 926, 540, 426, 172,
              736, 211, 368, 567, 429, 782, 530, 862, 123, 67, 135, 929, 802, 22, 58, 69, 167, 393,
              456, 11, 42, 229, 373, 421, 919, 784, 537, 198, 324, 315, 370, 413, 526, 91, 980, 956,
              873, 862, 170, 996, 281, 305, 925, 84, 327, 336, 505, 846, 729, 313, 857, 124, 895,
              582, 545, 814, 367, 434, 364, 43, 750, 87, 808, 276, 178, 788, 584
            },
            86),
        8);
  }
}
