package geeksForGeeks.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Sarveswara Tippireddy
 *     <p>This GeeksforGeeks problem can be found @
 *     http://www.geeksforgeeks.org/count-pairs-difference-equal-k/
 *     <p>The solution however is implemented for a slightly modified version of the above problem
 *     which can be found @ http://practice.geeksforgeeks.org/problems/pairs-with-difference-k/0
 */
public class Arrays104 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int size = sc.nextInt();
      int x = sc.nextInt();
      int[] input = new int[size];
      for (int i = 0; i < size; i++) {
        input[i] = sc.nextInt();
      }
      System.out.println(new Arrays104().findPairsUsingHashing(input, x));
    }
    sc.close();
  }

  public int findPairsUsingHashing(int[] input, int x) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i : input) {
      map.put(i, map.getOrDefault(i, 0) + 1);
    }
    int count = 0;
    for (int i : input) {
      count = count + (map.getOrDefault(i, 0) * map.getOrDefault(i + x, 0));
      count = count + (map.getOrDefault(i, 0) * map.getOrDefault(i - x, 0));
      map.remove(i);
    }
    return count;
  }

  public int findPairsUsingSorting(int[] input, int x) {
    Arrays.sort(input);
    int i = 0, j = 0;
    int count = 0;
    while (i < input.length && j < input.length) {
      if (input[i] + x < input[j]) {
        i++;
      } else if (input[i] + x > input[j]) {
        j++;
      } else {
        int nextI = i + 1;
        int iCount = 1;
        int nextJ = j + 1;
        int jCount = 1;
        while (nextI < input.length) {
          if (input[i] == input[nextI]) {
            iCount++;
            nextI++;
          } else {
            break;
          }
        }
        while (nextJ < input.length) {
          if (input[j] == input[nextJ]) {
            jCount++;
            nextJ++;
          } else {
            break;
          }
        }
        count += iCount * jCount;
        i = nextI;
        j = nextJ;
      }
    }
    return count;
  }
}
