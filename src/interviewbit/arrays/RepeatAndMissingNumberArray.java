/**
 * Created by Sarveswara Tippireddy on Jul 3, 2017
 *
 * <p>This InterviewBit problem can be found @
 * https://www.interviewbit.com/problems/repeat-and-missing-number-array/
 */
package interviewbit.arrays;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class RepeatAndMissingNumberArray {

  public ArrayList<Integer> repeatedNumberUsingXOR(final List<Integer> a) {
    int xorRes = 0;
    for (int i = 1; i <= a.size(); i++) {
      xorRes ^= i;
    }
    for (int i : a) {
      xorRes ^= i;
    }
    int setBitNumber = xorRes & ~(xorRes - 1);
    int x = 0;
    int y = 0;
    for (int i : a) {
      if ((i & setBitNumber) != 0) {
        x ^= i;
      } else {
        y ^= i;
      }
    }
    for (int i = 1; i <= a.size(); i++) {
      if ((i & setBitNumber) != 0) {
        x ^= i;
      } else {
        y ^= i;
      }
    }
    ArrayList<Integer> res = new ArrayList<>();
    for (int i : a) {
      if (i == x) {
        res.add(i);
        res.add(y);
        break;
      }
      if (i == y) {
        res.add(i);
        res.add(x);
        break;
      }
    }

    return res;
  }

  public ArrayList<Integer> repeatedNumberUsingMath(final List<Integer> a) {
    BigInteger totalSum = BigInteger.ZERO;
    BigInteger totalSquareSum = BigInteger.ZERO;
    for (int i = 1; i <= a.size(); i++) {
      totalSum = totalSum.add(BigInteger.valueOf(i));
      totalSquareSum = totalSquareSum.add(BigInteger.valueOf(i).pow(2));
    }
    BigInteger actualSum = BigInteger.ZERO;
    BigInteger actualSquareSum = BigInteger.ZERO;
    for (int i : a) {
      actualSum = actualSum.add(BigInteger.valueOf(i));
      actualSquareSum = actualSquareSum.add(BigInteger.valueOf(i).pow(2));
    }
    BigInteger diff = totalSum.subtract(actualSum);
    int xMinusy = diff.intValue();
    int xPlusy = totalSquareSum.subtract(actualSquareSum).divide(diff).intValue();
    int x = (xMinusy + xPlusy) / 2;
    int y = Math.abs((xMinusy - xPlusy) / 2);
    ArrayList<Integer> res = new ArrayList<>();
    for (int i : a) {
      if (i == x) {
        res.add(i);
        res.add(y);
        break;
      }
      if (i == y) {
        res.add(i);
        res.add(x);
        break;
      }
    }
    return res;
  }
}
