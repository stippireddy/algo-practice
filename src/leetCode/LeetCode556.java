package leetCode;

public class LeetCode556 {

  public int nextGreaterElement(int n) {
    if (n < 10) {
      return -1;
    }
    int index = -1;
    StringBuffer sb = new StringBuffer("" + n);
    for (int i = sb.length() - 1; i > 0; i--) {
      if (sb.charAt(i - 1) < sb.charAt(i)) {
        for (int j = sb.length() - 1; j >= i; j--) {
          if (sb.charAt(j) > sb.charAt(i - 1)) {
            char temp = sb.charAt(i - 1);
            sb.setCharAt(i - 1, sb.charAt(j));
            sb.setCharAt(j, temp);
            index = i;
            break;
          }
        }
        break;
      }
    }
    if (index == -1) {
      return -1;
    }
    int i = index;
    int j = sb.length() - 1;
    while (i < j) {
      char temp = sb.charAt(i);
      sb.setCharAt(i, sb.charAt(j));
      sb.setCharAt(j, temp);
      i++;
      j--;
    }
    try {
      return Integer.parseInt(sb.toString());
    } catch (NumberFormatException e) {
      return -1;
    }
  }
}
