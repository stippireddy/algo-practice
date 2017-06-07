package leetCode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LeetCode150Test {
  
  @Test
  public void evalRPN() {
    LeetCode150 l = new LeetCode150();
    Assert.assertEquals(l.evalRPN(new String[] {"18"}), 18);
    Assert.assertEquals(l.evalRPN(new String[] {"18", "19", "*"}), 342);
    Assert.assertEquals(l.evalRPN(new String[] {"2", "1", "+", "3", "*"}), 9);
    Assert.assertEquals(l.evalRPN(new String[] {"4", "13", "5", "/", "+"}), 6);
  }
  @Test
  public void evalRPNUsingStack() {
    LeetCode150 l = new LeetCode150();
    Assert.assertEquals(l.evalRPNUsingStack(new String[] {"18"}), 18);
    Assert.assertEquals(l.evalRPNUsingStack(new String[] {"18", "19", "*"}), 342);
    Assert.assertEquals(l.evalRPNUsingStack(new String[] {"2", "1", "+", "3", "*"}), 9);
    Assert.assertEquals(l.evalRPNUsingStack(new String[] {"4", "13", "5", "/", "+"}), 6);
  }
}
