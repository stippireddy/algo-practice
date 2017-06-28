package interviewbit.arrays;

import java.util.ArrayList;

public class MinStepsInfiniteArray {
  // X and Y co-ordinates of the points in order.
  // Each point is represented by (X.get(i), Y.get(i))
  public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
    int steps = 0;
    if (X.size() < 2) {
      return 0;
    }
    for (int i = 0; i < X.size() - 1; i++) {
      int a = X.get(i);
      int b = Y.get(i);
      int c = X.get(i + 1);
      int d = Y.get(i + 1);
      steps += Math.max(Math.abs(a - c), Math.abs(b - d));
    }
    return steps;
  }
}
