package interviewbit.math;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.Test;

public class AllFactorsTest {

  @Test
  public void allFactors() {
    AllFactors a = new AllFactors();
    assertEquals(a.allFactors(78293), new ArrayList<>(Arrays.asList(1, 59, 1327, 78293)));
  }
}
