/**
 * Created by Sarveswara Tippireddy on Jul 5, 2017
 *
 * <p>This InterviewBit problem can be found @
 * https://www.interviewbit.com/problems/hotel-bookings-possible/
 */
package interviewbit.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class HotelBookingsPossible {
  public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int k) {
    ArrayList<Interval> guestList = new ArrayList<>();
    for (int i = 0; i < arrive.size(); i++) {
      if (arrive.get(i) != depart.get(i)) {
        guestList.add(new Interval(arrive.get(i), 1));
        guestList.add(new Interval(depart.get(i), 0));
      }
    }
    Collections.sort(guestList);
    if (arrive.size() < 2 && k > 0) {
      return true;
    }
    int roomsOccupied = 0;
    for (int i = 0; i < guestList.size(); i++) {
      if (guestList.get(i).isStart() == 1) {
        roomsOccupied++;
        if (roomsOccupied > k) {
          return false;
        }
      } else {
        roomsOccupied--;
      }
    }
    return true;
  }

  private class Interval implements Comparable<Interval> {
    private int day;

    private int isStart;

    public int isStart() {
      return isStart;
    }

    public Interval(int day, int isStart) {
      this.day = day;
      this.isStart = isStart;
    }

    @Override
    public int compareTo(Interval o) {
      return (day - o.day) == 0 ? isStart - o.isStart() : day - o.day;
    }
  }
}
