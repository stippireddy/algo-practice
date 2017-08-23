package interviewbit.arrays;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.Test;

public class NobleIntegerTest {

  @Test
  public void solve() {
    NobleInteger n = new NobleInteger();
    assertEquals(1, n.solve(new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4))));
    assertEquals(1, n.solve(new ArrayList<Integer>(Arrays.asList(0, 2, 2, 3, 4))));
    assertEquals(1, n.solve(new ArrayList<Integer>(Arrays.asList(0, 2, 2, 3, 3))));
    assertEquals(1, n.solve(new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 3))));
    assertEquals(-1, n.solve(new ArrayList<Integer>(Arrays.asList(0, 1, 2, 2, 4))));
    assertEquals(1, n.solve(new ArrayList<Integer>(Arrays.asList(0))));
    assertEquals(1, n.solve(new ArrayList<Integer>(Arrays.asList(0, 0, 0))));
  }
}
