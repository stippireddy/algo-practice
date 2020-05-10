/**
 * Created by Sarveswara Tippireddy on Jul 3, 2017
 *
 * <p>This GeeksForGeeks problem can be found @ link
 */
package interviewbit.math;

import java.util.ArrayList;
import java.util.Collections;

public class AllFactors {

  public ArrayList<Integer> allFactors(int a) {
    ArrayList<Integer> result = new ArrayList<>();
    if (a == 1) {
      result.add(1);
      return result;
    }
    double k = Math.sqrt(a);
    int i = 1;
    for (; i < k; i++) {
      if (a % i == 0) {
        result.add(i);
        result.add(a / i);
      }
    }
    if (i * i == a) {
      result.add((int) k);
    }
    Collections.sort(result);
    return result;
  }
}
