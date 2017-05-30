package geeksForGeeks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SmallestPosIntegerNotSumOfSubsetOfArrayTest {
    @Test
    public void testFind() {
        int[] array1 = { 1, 3, 6, 10, 11, 15 };
        Assert.assertEquals(SmallestPosIntegerNotSumOfSubsetOfArray.find(array1), 2);
        int[] array2 = { 1, 1, 1, 1 };
        Assert.assertEquals(SmallestPosIntegerNotSumOfSubsetOfArray.find(array2), 5);
        int[] array3 = { 1, 1, 3, 4 };
        Assert.assertEquals(SmallestPosIntegerNotSumOfSubsetOfArray.find(array3), 10);
        int[] array4 = { 1, 2, 5, 10, 20, 40 };
        Assert.assertEquals(SmallestPosIntegerNotSumOfSubsetOfArray.find(array4), 4);
        int[] array5 = { 1, 2, 3, 4, 5, 6 };
        Assert.assertEquals(SmallestPosIntegerNotSumOfSubsetOfArray.find(array5), 22);
    }
}
