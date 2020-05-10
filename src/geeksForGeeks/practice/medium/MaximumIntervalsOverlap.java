/**
 * Created by Sarveswara Tippireddy on Jul 22, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/maximum-intervals-overlap/0
 *
 * <p>The solution editorial can be found @
 * http://www.geeksforgeeks.org/find-the-point-where-maximum-intervals-overlap/
 */
package geeksForGeeks.practice.medium;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumIntervalsOverlap {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      Interval[] intervals = new Interval[2 * k];
      for (int i = 0; i < k; i++) {
        intervals[i] = new Interval(sc.nextInt(), 1);
      }
      for (int i = k; i < 2 * k; i++) {
        intervals[i] = new Interval(sc.nextInt(), 0);
      }
      int[] result = calculate(intervals);
      System.out.println(result[0] + " " + result[1]);
    }
    sc.close();
  }

  private static int[] calculate(Interval[] intervals) {
    Arrays.sort(intervals);
    int maxOverLapTime = 0;
    int maxGuests = 0;
    int guests = 0;
    for (Interval i : intervals) {
      if (i.arrivalDeparture == 1) {
        guests++;
        if (guests > maxGuests) {
          maxGuests = guests;
          maxOverLapTime = i.time;
        }
      } else {
        guests--;
      }
    }
    return new int[]{maxGuests, maxOverLapTime};
  }

  static class Interval implements Comparable<Interval> {

    int time;
    int arrivalDeparture;

    public Interval(int time, int arrivalDeparture) {
      this.time = time;
      this.arrivalDeparture = arrivalDeparture;
    }

    @Override
    public int compareTo(Interval o) {
      return time - o.time == 0 ? o.arrivalDeparture - arrivalDeparture : time - o.time;
    }

    @Override
    public String toString() {
      return "[" + time + "," + arrivalDeparture + "]";
    }
  }
}
