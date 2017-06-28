package leetCode;

public class LeetCode504 {
  public String convertToBase7(int num) {
    boolean isNegative = false;
    if (num < 0) {
      isNegative = true;
      num *= -1;
    }
    int result = 0;
    int power = 1;
    while (num > 0) {
      result += power * (num % 7);
      power *= 10;
      num /= 7;
    }
    if (isNegative) {
      result *= -1;
    }
    return String.valueOf(result);
  }
}
