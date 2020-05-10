/*

 Created by Sarveswara Tippireddy on Jun 30, 2017

 <p>This GeeksForGeeks problem can be found @ http://www.geeksforgeeks.org/leaders-in-an-array/

*/
package geeksForGeeks.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays016 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Arrays016 a = new Arrays016();
    while (n-- > 0) {
      int[] input = new int[sc.nextInt()];
      for (int i = 0; i < input.length; i++) {
        input[i] = sc.nextInt();
      }
      ArrayList<Integer> result = a.getLeaders(input);
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < result.size() - 1; i++) {
        sb.append(result.get(i)).append(" ");
      }
      sb.append(result.get(result.size() - 1));
      System.out.println(sb.toString());
    }
    sc.close();
  }

  public ArrayList<Integer> getLeaders(int[] a) {
    ArrayList<Integer> result = new ArrayList<>();
    int prevMax = Integer.MIN_VALUE;
    for (int i = a.length - 1; i >= 0; i--) {
      if (a[i] > prevMax) {
        prevMax = a[i];
        result.add(prevMax);
      }
    }
    int i = 0, j = result.size() - 1;
    while (i < j) {
      int temp = result.get(i);
      result.set(i, result.get(j));
      result.set(j, temp);
      i++;
      j--;
    }
    return result;
  }
}
