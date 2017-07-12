/**
 * Created by Sarveswara Tippireddy on Jul 12, 2017
 *
 * <p>This GeeksForGeeks problem can be found @
 * http://www.geeksforgeeks.org/calculate-difficulty-sentence/
 */
package geeksForGeeks.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class CalculateDifficultyOfSentence {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    while (n-- > 0) {
      System.out.println(getDifficulty(sc.nextLine()));
    }
    sc.close();
  }

  private static int getDifficulty(String s) {
    HashSet<Character> vowels =
        new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
    int hard = 0;
    int easy = 0;
    int consCount = 0;
    int vowCount = 0;
    int consecCons = 0;
    int maxConsecCons = 0;
    for (char c : s.toCharArray()) {
      if (c == ' ') {
        if (consCount > vowCount || maxConsecCons >= 4) {
          hard++;
        } else {
          easy++;
        }
        consCount = 0;
        vowCount = 0;
        consecCons = 0;
        maxConsecCons = 0;
      } else if (vowels.contains(c)) {
        vowCount++;
        consecCons = 0;
      } else {
        consCount++;
        consecCons++;
        maxConsecCons = Integer.max(maxConsecCons, consecCons);
      }
    }
    if (s.charAt(s.length() - 1) != ' ') {
      if (consCount > vowCount || maxConsecCons >= 4) {
        hard++;
      } else {
        easy++;
      }
    }
    return 5 * hard + 3 * easy;
  }
}
