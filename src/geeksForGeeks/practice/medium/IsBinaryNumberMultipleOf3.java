/**
 * Created by Sarveswara Tippireddy on Jul 22, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/is-binary-number-multiple-of-3/0
 *
 * <p>The solution editorial can be found @
 * http://www.geeksforgeeks.org/write-an-efficient-method-to-check-if-a-number-is-multiple-of-3/
 */
package geeksForGeeks.practice.medium;

import java.util.Scanner;

public class IsBinaryNumberMultipleOf3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numberOfTestCases = sc.nextInt();
    while (numberOfTestCases-- > 0) {
      String input = sc.next();
      System.out.println(isMultipleOf3(input));
    }
    sc.close();
  }

  private static int isMultipleOf3(String input) {
    int oddCount = 0;
    int evenCount = 0;
    for (int i = 0; i < input.length(); i++) {
      if ((i & 1) == 0 && input.charAt(i) == '1') {
        evenCount++;
      }
      if ((i & 1) != 0 && input.charAt(i) == '1') {
        oddCount++;
      }
    }
    if ((oddCount - evenCount) % 3 == 0) {
      return 1;
    }
    return 0;
  }
}
