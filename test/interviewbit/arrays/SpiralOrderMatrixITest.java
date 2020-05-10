package interviewbit.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.testng.annotations.Test;

public class SpiralOrderMatrixITest {

  @Test
  public void spiralOrder() {
    SpiralOrderMatrixI s = new SpiralOrderMatrixI();
    List<ArrayList<Integer>> input = new ArrayList<>();
    input.add(new ArrayList<>(Arrays.asList(1)));
    input.add(new ArrayList<>(Arrays.asList(2)));
    input.add(new ArrayList<>(Arrays.asList(3)));
    System.out.println(s.spiralOrder(input));
  }
}
