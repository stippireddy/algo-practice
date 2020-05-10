package geeksForGeeks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FlipZeroesToMaximizeConsecutiveOnesTest {

  @Test
  public void findMaxConsecutiveOnes() {
    FlipZeroesToMaximizeConsecutiveOnes f = new FlipZeroesToMaximizeConsecutiveOnes();
    Assert.assertEquals(f.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1, 0, 1, 1, 1}, 2), 8);
    Assert.assertEquals(f.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1, 0, 1, 1, 1}, 1), 5);
    Assert.assertEquals(f.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1, 0, 1, 1, 1}, 3), 10);
    Assert.assertEquals(f.findMaxConsecutiveOnes(new int[]{1}, 1), 1);
    Assert.assertEquals(f.findMaxConsecutiveOnes(new int[]{0}, 1), 1);
    Assert.assertEquals(f.findMaxConsecutiveOnes(new int[]{1}, 0), 1);
  }
}
