/**
 * Created by Sarveswara Tippireddy on Aug 24, 2017
 *
 * <p>This LeetCode problem can be found @
 * https://leetcode.com/problems/integer-to-roman/description/
 */
package leetCode;

public class LeetCode012 {

  // This is my initial intuition for solving this problem.
  public String intToRoman1(int num) {
    StringBuffer sb = new StringBuffer();
    int divisor = 1000;
    int currentMultiple = num / divisor;
    while (currentMultiple-- > 0) {
      sb.append('M');
    }
    num = num % divisor;

    divisor = 100;
    currentMultiple = num / divisor;
    if (currentMultiple == 9) {
      sb.append('C').append('M');
      currentMultiple = 0;
    } else if (currentMultiple >= 5) {
      sb.append('D');
      currentMultiple -= 5;
    } else if (currentMultiple == 4) {
      sb.append('C').append('D');
      currentMultiple = 0;
    }
    while (currentMultiple-- > 0) {
      sb.append('C');
    }
    num = num % divisor;

    divisor = 10;
    currentMultiple = num / divisor;
    if (currentMultiple == 9) {
      sb.append('X').append('C');
      currentMultiple = 0;
    } else if (currentMultiple >= 5) {
      sb.append('L');
      currentMultiple -= 5;
    } else if (currentMultiple == 4) {
      sb.append('X').append('L');
      currentMultiple = 0;
    }
    while (currentMultiple-- > 0) {
      sb.append('X');
    }
    num = num % divisor;

    divisor = 1;
    currentMultiple = num / divisor;
    if (currentMultiple == 9) {
      sb.append('I').append('X');
      currentMultiple = 0;
    } else if (currentMultiple >= 5) {
      sb.append('V');
      currentMultiple -= 5;
    } else if (currentMultiple == 4) {
      sb.append('I').append('V');
      currentMultiple = 0;
    }
    while (currentMultiple-- > 0) {
      sb.append('I');
    }
    return sb.toString();
  }

  // A much cleaner solution follows. It is a slight modification of the solution
  // @ http://blog.csdn.net/beiyeqingteng/article/details/8547565
  public String intToRoman2(int num) {
    String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    StringBuffer result = new StringBuffer();
    int i = 0;
    while (num > 0) {
      while (num >= values[i]) {
        result.append(roman[i]);
        num -= values[i];
      }
      i++;
    }
    return result.toString();
  }
}
