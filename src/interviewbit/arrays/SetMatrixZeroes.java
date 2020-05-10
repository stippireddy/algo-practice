/**
 * Created by Sarveswara Tippireddy on Jul 5, 2017
 *
 * <p>This InterviewBit problem can be found @
 * https://www.interviewbit.com/problems/set-matrix-zeros/
 */
package interviewbit.arrays;

import java.util.ArrayList;

public class SetMatrixZeroes {

  public void setZeroes(ArrayList<ArrayList<Integer>> a) {
    int rowMax = a.size();
    int colMax = a.get(0).size();
    boolean firstRowContainsZero = false;
    boolean firstColContainsZero = false;
    for (int i = 0; i < rowMax; i++) {
      if (a.get(i).get(0) == 0) {
        firstColContainsZero = true;
        break;
      }
    }
    for (int j = 0; j < colMax; j++) {
      if (a.get(0).get(j) == 0) {
        firstRowContainsZero = true;
        break;
      }
    }
    for (int i = 1; i < rowMax; i++) {
      for (int j = 1; j < colMax; j++) {
        if (a.get(i).get(j) == 0) {
          a.get(i).set(0, 0);
          a.get(0).set(j, 0);
        }
      }
    }
    for (int i = 1; i < rowMax; i++) {
      for (int j = 1; j < colMax; j++) {
        if (a.get(i).get(0) == 0 || a.get(0).get(j) == 0) {
          a.get(i).set(j, 0);
        }
      }
    }
    if (firstRowContainsZero) {
      for (int j = 0; j < colMax; j++) {
        a.get(0).set(j, 0);
      }
    }
    if (firstColContainsZero) {
      for (int i = 0; i < rowMax; i++) {
        a.get(i).set(0, 0);
      }
    }
  }
}
