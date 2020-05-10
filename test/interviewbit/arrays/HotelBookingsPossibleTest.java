package interviewbit.arrays;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import org.testng.annotations.Test;

public class HotelBookingsPossibleTest {

  @Test
  public void hotel() {
    HotelBookingsPossible h = new HotelBookingsPossible();
    assertFalse(
        h.hotel(
            new ArrayList<Integer>(Arrays.asList(1, 3, 5)),
            new ArrayList<Integer>(Arrays.asList(2, 6, 8)),
            1));
    assertTrue(
        h.hotel(
            new ArrayList<Integer>(Arrays.asList(1, 3, 5)),
            new ArrayList<Integer>(Arrays.asList(2, 6, 8)),
            2));
    assertTrue(
        h.hotel(
            new ArrayList<Integer>(Arrays.asList(1, 3, 5)),
            new ArrayList<Integer>(Arrays.asList(2, 4, 8)),
            1));
    assertTrue(
        h.hotel(
            new ArrayList<Integer>(Arrays.asList(1, 3, 4)),
            new ArrayList<Integer>(Arrays.asList(3, 4, 8)),
            1));
    assertFalse(
        h.hotel(
            new ArrayList<Integer>(Arrays.asList(2, 1, 4)),
            new ArrayList<Integer>(Arrays.asList(4, 3, 6)),
            1));
    assertTrue(
        h.hotel(
            new ArrayList<Integer>(Arrays.asList(3, 1, 4)),
            new ArrayList<Integer>(Arrays.asList(4, 3, 6)),
            1));
    assertTrue(
        h.hotel(
            new ArrayList<Integer>(Arrays.asList(40, 18)),
            new ArrayList<Integer>(Arrays.asList(40, 43)),
            1));
    assertFalse(
        h.hotel(
            new ArrayList<Integer>(Arrays.asList(51, 42, 40, 18)),
            new ArrayList<Integer>(Arrays.asList(55, 50, 40, 43)),
            1));
    assertTrue(
        h.hotel(
            new ArrayList<Integer>(
                Arrays.asList(
                    13, 14, 36, 19, 44, 1, 45, 4, 48, 23, 32, 16, 37, 44, 47, 28, 8, 47, 4, 31, 25,
                    48, 49, 12, 7, 8)),
            new ArrayList<Integer>(
                Arrays.asList(
                    28, 27, 61, 34, 73, 18, 50, 5, 86, 28, 34, 32, 75, 45, 68, 65, 35, 91, 13, 76,
                    60, 90, 67, 22, 51, 53)),
            23));
  }
}
