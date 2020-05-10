package geeksForGeeks.practice.easy;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class FindingNumberInBitonicArrayTest {

  @Test
  public void find() {
    assertEquals(1, FindingNumberInBitonicArray.find(new int[]{1, 2, 7, 4, 3}, 2));
    assertEquals(1, FindingNumberInBitonicArray.find(new int[]{1, 2, 7, 10, 20, 15, 9, 4, 3}, 2));
    assertEquals(0, FindingNumberInBitonicArray.find(new int[]{1, 2, 7, 10, 20, 15, 9, 4, 3}, 1));
    assertEquals(2, FindingNumberInBitonicArray.find(new int[]{1, 2, 7, 10, 20, 15, 9, 4, 3}, 7));
    assertEquals(3, FindingNumberInBitonicArray.find(new int[]{1, 2, 7, 10, 20, 15, 9, 4, 3}, 10));
    assertEquals(4, FindingNumberInBitonicArray.find(new int[]{1, 2, 7, 10, 20, 15, 9, 4, 3}, 20));
    assertEquals(5, FindingNumberInBitonicArray.find(new int[]{1, 2, 7, 10, 20, 15, 9, 4, 3}, 15));
    assertEquals(6, FindingNumberInBitonicArray.find(new int[]{1, 2, 7, 10, 20, 15, 9, 4, 3}, 9));
    assertEquals(7, FindingNumberInBitonicArray.find(new int[]{1, 2, 7, 10, 20, 15, 9, 4, 3}, 4));
    assertEquals(8, FindingNumberInBitonicArray.find(new int[]{1, 2, 7, 10, 20, 15, 9, 4, 3}, 3));
  }
}