package leetCode;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class LeetCode1041Test {
    public void isRobotBounded() {
        LeetCode1041 l = new LeetCode1041();
        Assert.assertTrue(l.isRobotBounded("GGLLGG"));
        Assert.assertFalse(l.isRobotBounded("GG"));
        Assert.assertTrue(l.isRobotBounded("GL"));
    }
}
