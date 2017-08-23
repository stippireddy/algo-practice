package interviewbit.arrays;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.Test;

public class AddOneToNumberTest {

  @Test
  public void plusOne() {
    AddOneToNumber a = new AddOneToNumber();
    assertEquals(
        new ArrayList<Integer>(Arrays.asList(1, 2, 4)),
        a.plusOne(new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3))));
    assertEquals(
        new ArrayList<Integer>(Arrays.asList(1, 0, 0, 0)),
        a.plusOne(new ArrayList<Integer>(Arrays.asList(9, 9, 9))));
  }
}
