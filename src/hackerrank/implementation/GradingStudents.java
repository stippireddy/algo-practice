/**
 * Created by Sarveswara Tippireddy on Jul 14, 2017
 *
 * <p>This HackerRank problem can be found @ https://www.hackerrank.com/challenges/grading
 */
package hackerrank.implementation;

import java.util.Scanner;

public class GradingStudents {
  static int[] solve(int[] grades) {
    int[] result = new int[grades.length];
    int i = 0;
    for (int g : grades) {
      int remainder = g % 5;
      if (g < 38 || remainder < 3) {
        result[i] = g;
      } else {
        result[i] = g + 5 - remainder;
      }
      i++;
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] grades = new int[n];
    for (int grades_i = 0; grades_i < n; grades_i++) {
      grades[grades_i] = in.nextInt();
    }
    int[] result = solve(grades);
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
    }
    System.out.println("");
    in.close();
  }
}
