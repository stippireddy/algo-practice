package interviewbit.arrays;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.Test;

public class FlipTest {

  @Test
  public void flip() {
    Flip f = new Flip();
    assertEquals(new ArrayList<Integer>(Arrays.asList(2, 6)), f.flip("100100"));
    assertEquals(new ArrayList<Integer>(), f.flip("1111"));
    assertEquals(new ArrayList<Integer>(Arrays.asList(1, 1)), f.flip("0"));
    assertEquals(new ArrayList<Integer>(Arrays.asList(1, 1)), f.flip("010"));
    assertEquals(new ArrayList<Integer>(), f.flip("1"));
    assertEquals(new ArrayList<Integer>(Arrays.asList(3, 3)), f.flip("1101"));
    assertEquals(new ArrayList<Integer>(Arrays.asList(2, 3)), f.flip("100101101"));
    assertEquals(new ArrayList<Integer>(Arrays.asList(3, 9)), f.flip("1101010001"));
    assertEquals(new ArrayList<Integer>(Arrays.asList(5, 9)), f.flip("1111010001"));
    assertEquals(new ArrayList<Integer>(Arrays.asList(1, 2)), f.flip("0011101"));
  }
}
