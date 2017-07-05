package interviewbit.arrays;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.Test;

public class SetMatrixZeroesTest {

  @Test
  public void setZeroes() {
    SetMatrixZeroes s = new SetMatrixZeroes();
    ArrayList<ArrayList<Integer>> input =
        new ArrayList<ArrayList<Integer>>(
            Arrays.asList(
                new ArrayList<Integer>(Arrays.asList(0, 1)),
                new ArrayList<Integer>(Arrays.asList(1, 1))));
    s.setZeroes(input);
    assertEquals(
        new ArrayList<ArrayList<Integer>>(
            Arrays.asList(
                new ArrayList<Integer>(Arrays.asList(0, 0)),
                new ArrayList<Integer>(Arrays.asList(0, 1)))),
        input);
    input =
        new ArrayList<ArrayList<Integer>>(
            Arrays.asList(
                new ArrayList<Integer>(Arrays.asList(1, 0, 1)),
                new ArrayList<Integer>(Arrays.asList(1, 1, 1)),
                new ArrayList<Integer>(Arrays.asList(1, 1, 1))));
    s.setZeroes(input);
    assertEquals(
        new ArrayList<ArrayList<Integer>>(
            Arrays.asList(
                new ArrayList<Integer>(Arrays.asList(0, 0, 0)),
                new ArrayList<Integer>(Arrays.asList(1, 0, 1)),
                new ArrayList<Integer>(Arrays.asList(1, 0, 1)))),
        input);
    input =
        new ArrayList<ArrayList<Integer>>(
            Arrays.asList(
                new ArrayList<Integer>(Arrays.asList(1, 0, 1)),
                new ArrayList<Integer>(Arrays.asList(1, 0, 0)),
                new ArrayList<Integer>(Arrays.asList(1, 1, 1))));
    s.setZeroes(input);
    assertEquals(
        new ArrayList<ArrayList<Integer>>(
            Arrays.asList(
                new ArrayList<Integer>(Arrays.asList(0, 0, 0)),
                new ArrayList<Integer>(Arrays.asList(0, 0, 0)),
                new ArrayList<Integer>(Arrays.asList(1, 0, 0)))),
        input);
    input =
        new ArrayList<ArrayList<Integer>>(
            Arrays.asList(
                new ArrayList<Integer>(Arrays.asList(1, 0, 1)),
                new ArrayList<Integer>(Arrays.asList(1, 0, 1)),
                new ArrayList<Integer>(Arrays.asList(1, 1, 1))));
    s.setZeroes(input);
    assertEquals(
        new ArrayList<ArrayList<Integer>>(
            Arrays.asList(
                new ArrayList<Integer>(Arrays.asList(0, 0, 0)),
                new ArrayList<Integer>(Arrays.asList(0, 0, 0)),
                new ArrayList<Integer>(Arrays.asList(1, 0, 1)))),
        input);
  }
}
