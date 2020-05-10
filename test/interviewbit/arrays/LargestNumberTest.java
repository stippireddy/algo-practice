package interviewbit.arrays;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import org.testng.annotations.Test;

public class LargestNumberTest {

  @Test
  public void largestNumber() {
    LargestNumber l = new LargestNumber();
    assertEquals(
        "9534330", l.largestNumber(new ArrayList<Integer>(Arrays.asList(3, 30, 34, 5, 9))));
    assertEquals(
        "302010100", l.largestNumber(new ArrayList<Integer>(Arrays.asList(10, 20, 30, 100))));
    assertEquals("0", l.largestNumber(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0))));
    assertEquals("1000", l.largestNumber(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1))));
    assertEquals(
        "9648527226766636354854724412368319",
        l.largestNumber(
            new ArrayList<Integer>(
                Arrays.asList(472, 663, 964, 722, 485, 852, 635, 4, 368, 676, 319, 412))));
  }
}
