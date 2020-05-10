package leetCode;

/**
 * Created by Sarveswara Tippireddy on 5/19/2017.
 */
public class LeetCode258 {

  public int addDigits1(int num) {
    if (num <= 9) {
      return num;
    }
    int rem = num % 9;
    if (rem == 0) {
      return 9;
    } else {
      return rem;
    }
  }

  public int addDigits(int num) {
    int sum = 0;
    do {
      while (num > 0) {
        sum = sum + num % 10;
        num = num / 10;
      }
      num = sum;
      sum = 0;
    } while (num > 9);
    return num;
  }
}
