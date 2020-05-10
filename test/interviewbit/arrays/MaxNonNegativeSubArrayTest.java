package interviewbit.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import org.testng.annotations.Test;

public class MaxNonNegativeSubArrayTest {

  @Test
  public void maxset() {
    MaxNonNegativeSubArray m = new MaxNonNegativeSubArray();
    m.maxset(
        new ArrayList<Integer>(
            Arrays.asList(
                336465782,
                -278722862,
                -2145174067,
                1101513929,
                1315634022,
                -1369133069,
                1059961393,
                628175011,
                -1131176229,
                -859484421)));
  }
}
