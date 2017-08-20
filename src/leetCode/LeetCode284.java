/**
 * Created by Sarveswara Tippireddy on Aug 20, 2017
 *
 * <p>This is a LeetCode problem. The problem statement can be found @
 * https://leetcode.com/problems/peeking-iterator/description/
 */
package leetCode;

import java.util.Iterator;

public class LeetCode284 implements Iterator<Integer> {

  boolean hasNext = false;
  Integer next = null;
  Iterator<Integer> iter;

  public LeetCode284(Iterator<Integer> iterator) {
    this.iter = iterator;
    if (iterator.hasNext()) {
      next = iterator.next();
      hasNext = true;
    }
  }

  // Returns the next element in the iteration without advancing the iterator.
  public Integer peek() {
    return next;
  }

  // hasNext() and next() should behave the same as in the Iterator interface.
  // Override them if needed.
  @Override
  public Integer next() {
    Integer temp = next;
    if (iter.hasNext()) {
      next = iter.next();
      hasNext = true;
    } else {
      next = null;
      hasNext = false;
    }
    return temp;
  }

  @Override
  public boolean hasNext() {
    return hasNext;
  }
}
