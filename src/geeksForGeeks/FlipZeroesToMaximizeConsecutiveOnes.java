package geeksForGeeks;

/*
* This geeksforgeeks problem can be found @ http://www.geeksforgeeks.org/find-zeroes-to-be-flipped-so-that-number-of-consecutive-1s-is-maximized/
*
* Given an integer array and an integer m, find the maximum number of consecutive 1�s in array that can be formed by flipping at most m zeroes.
*
   Input:   array[] = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1}
   m = 2
   Output:  5 7
   We are allowed to flip maximum 2 zeroes. If we flip array[5] and array[7], we get 8 consecutive 1's which is maximum possible under given constraints

   Input:   array[] = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1}
   m = 1
   Output:  7
   We are allowed to flip maximum 1 zero. If we flip array[7], we get 5 consecutive 1's which is maximum possible under given constraints.

   Input:   array[] = {0, 0, 0, 1}
   m = 4
   Output:  0 1 2
   Since m is more than number of zeroes, we can flip all zeroes.
*/

public class FlipZeroesToMaximizeConsecutiveOnes {

  public int findMaxConsecutiveOnes(int[] array, int m) {
    int low = 0;
    int high = 0;
    int flipCount = m;
    int maxCount = -1;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == 0) {
        if (flipCount > 0) {
          flipCount--;
        } else {
          int count = high - low + 1;
          maxCount = Integer.max(count, maxCount);
          while (array[low] != 0) {
            low++;
          }
          low++;
        }
      }
      high = i;
    }
    int count = high - low + 1;
    maxCount = Integer.max(count, maxCount);
    return maxCount;
  }
}
