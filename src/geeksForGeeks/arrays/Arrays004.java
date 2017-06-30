/**
 * Created by Sarveswara Tippireddy on Jun 30, 2017
 *
 * <p>This GeeksForGeeks problem can be found @ http://www.geeksforgeeks.org/majority-element/
 */
package geeksForGeeks.arrays;

public class Arrays004 {

  public int getMajorityElementBoyerMooreAlgo(int[] input) {
    int counter = 0;
    int key = -1;
    for (int i : input) {
      if (counter == 0) {
        key = i;
        counter++;
      } else if (key == i) {
        counter++;
      } else {
        counter--;
      }
    }
    if (key >= 0) {
      counter = 0;
      for (int i : input) {
        if (key == i) {
          counter++;
        }
      }
      if (counter > input.length / 2) {
        return key;
      }
    }
    return -1;
  }
}
