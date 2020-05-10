package geeksForGeeks.arrays;

/**
 * Created by Sarveswara Tippireddy on 5/19/2017.
 *
 * <p>This is the solution to the GeeksForGeeks problem that can be found @
 * http://www.geeksforgeeks.org/replace-every-element-with-the-greatest-on-right-side/
 *
 * <p>Brief Problem Statement: Given an array of integers, replace every element with the next
 * greatest element (greatest element on the right side) in the array. Since there is no element
 * next to the last element, replace it with -1. For example, if the array is {16, 17, 4, 3, 5, 2},
 * then it should be modified to {17, 5, 5, 5, 2, -1}.
 */
public class Arrays068 {

  public void nextGreatestElementOnTheRightSide(int[] input) {
    int prev = input[input.length - 1];
    input[input.length - 1] = -1;
    for (int i = input.length - 2; i >= 0; i--) {
      int curr = input[i];
      input[i] = Integer.max(prev, input[i + 1]);
      prev = curr;
    }
  }
}
