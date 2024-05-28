package leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class LeetCode937Test {
    public void reorderLogFiles() {
        LeetCode937 leetCode937 = new LeetCode937();
        String[] input = {"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"};
        String[] expectedOutput = {"let1 art can", "let3 art zero", "let2 own kit dig", "dig1 8 1 5 1", "dig2 3 6"};
        Assert.assertEquals(leetCode937.reorderLogFiles(input), expectedOutput);
    }
}
