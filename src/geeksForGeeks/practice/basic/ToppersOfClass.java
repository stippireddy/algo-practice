/**
 * Created by Sarveswara Tippireddy on Jul 21, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/toppers-of-class/0
 */
package geeksForGeeks.practice.basic;

import java.util.Arrays;
import java.util.Scanner;

public class ToppersOfClass {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int sizeOfInput = sc.nextInt();
      Score[] input = new Score[sizeOfInput];
      for (int i = 0; i < input.length; i++) {
        input[i] = new Score(i, sc.nextInt());
      }
      int k = sc.nextInt();
      printKHighestScorers(input, k);
    }
    sc.close();
  }

  private static void printKHighestScorers(Score[] input, int k) {
    Arrays.sort(input);
    int i = 0;
    StringBuffer sb = new StringBuffer();
    while (k > 0 && i < input.length) {
      do {
        sb.append(input[i].index).append(" ");
        i++;
      } while (i < input.length && input[i].score == input[i - 1].score);
      k--;
    }
    System.out.println(sb.substring(0, sb.length() - 1));
  }

  static class Score implements Comparable<Score> {

    int index;
    int score;

    Score(int index, int score) {
      this.index = index;
      this.score = score;
    }

    @Override
    public int compareTo(Score o) {
      if (this.score != o.score) {
        return o.score - this.score;
      }
      return this.index - o.index;
    }

  }
}

