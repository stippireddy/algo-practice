package interviewbit.binarySearch;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.Test;

public class CountElementOccurenceTest {

  @Test
  public void findCount() {
    CountElementOccurence c = new CountElementOccurence();
    assertEquals(2, c.findCount(new ArrayList<Integer>(Arrays.asList(5, 7, 7, 8, 8, 10)), 7));
    assertEquals(0, c.findCount(new ArrayList<Integer>(Arrays.asList(5, 7, 7, 8, 8, 10)), 9));
    assertEquals(1, c.findCount(new ArrayList<Integer>(Arrays.asList(9)), 9));
    assertEquals(0, c.findCount(new ArrayList<Integer>(Arrays.asList(9)), 10));
  }
}
