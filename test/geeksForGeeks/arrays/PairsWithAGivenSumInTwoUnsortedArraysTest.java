package geeksForGeeks.arrays;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class PairsWithAGivenSumInTwoUnsortedArraysTest {

  @Test
  public void usingHashing() {
    PairsWithAGivenSumInTwoUnsortedArrays p = new PairsWithAGivenSumInTwoUnsortedArrays();
    assertTrue(
        "4 4, 5 3"
            .equals(p.usingHashing(new int[] {-1, -2, 4, -6, 5, 7}, new int[] {6, 3, 4, 0}, 8)));
    assertTrue(
        "1 8, 4 5, 5 4"
            .equals(p.usingHashing(new int[] {1, 2, 4, 5, 7}, new int[] {5, 6, 3, 4, 8}, 9)));
    assertTrue(
        "1 8, 1 8, 4 5"
            .equals(p.usingHashing(new int[] {1, 2, 4, 5, 7}, new int[] {5, 6, 3, 8, 8}, 9)));
    assertTrue(
        "1 8, 1 8, 4 5"
            .equals(p.usingHashing(new int[] {1, 1, 4, 5, 7}, new int[] {5, 6, 3, 8, 8}, 9)));
    assertTrue(
        "1 8, 1 8, 4 5, 10 -1"
            .equals(p.usingHashing(new int[] {10, 1, 4, 5, 7}, new int[] {5, -1, 3, 8, 8}, 9)));
    assertTrue("0 3, 2 1".equals(p.usingHashing(new int[] {0, 2}, new int[] {1, 3}, 3)));
    assertTrue(
        "-5 89, 24 60, 29 55, 30 54, 34 50, 43 41, 45 39, 58 26, 81 3, 86 -2"
            .equals(
                p.usingHashing(
                    new int[] {
                      2, -5, -8, -11, -13, 14, 15, -19, -21, 22, -23, 24, -25, -26, 27, 29, 30, 34,
                      35, -36, 37, -40, -42, 43, 45, 46, -49, -50, -56, -57, 58, 59, 62, -63, -64,
                      -67, 68, -69, 70, -72, -73, -76, -77, 78, -80, 81, 82, -84, 86, -87, 88, -90,
                      91, 92, -93, 95, 96, 98
                    },
                    new int[] {
                      0, -1, -2, 3, -6, 8, -9, 12, -15, -17, -18, 19, -21, 23, -24, 26, -27, 28, 29,
                      -31, 32, -34, 39, 40, 41, 44, 45, -46, -49, 50, -51, 52, 53, 54, 55, -56, 60,
                      64, 65, 67, -68, -70, 71, 75, 76, -78, -79, -80, 81, -83, 86, 88, 89, -92, 93,
                      94, -95, -96, -97, 99
                    },
                    84)));
  }
}
