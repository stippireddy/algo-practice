package interviewbit.arrays;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.Test;

public class FirstMissingNumberTest {

  @Test
  public void firstMissingPositive() {
    FirstMissingNumber f = new FirstMissingNumber();
    assertEquals(1, f.firstMissingPositive(new ArrayList<Integer>(Arrays.asList(2, 3, 4, 5))));
    assertEquals(1, f.firstMissingPositive(new ArrayList<Integer>(Arrays.asList(-8, -7, -6))));
    assertEquals(2, f.firstMissingPositive(new ArrayList<Integer>(Arrays.asList(3, 4, -1, 1))));
    assertEquals(2, f.firstMissingPositive(new ArrayList<Integer>(Arrays.asList(10, -8, 1, 4))));
    assertEquals(2, f.firstMissingPositive(new ArrayList<Integer>(Arrays.asList(1))));
  }
}
