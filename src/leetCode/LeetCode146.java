/**
 * Created by Sarveswara Tippireddy on Jul 2, 2017
 *
 * <p>
 * This LeetCode problem can be found @
 * https://leetcode.com/problems/lru-cache/description/
 */
package leetCode;

import java.util.ArrayDeque;
import java.util.HashMap;

public class LeetCode146 {
	//TODO Complete and submit
	private ArrayDeque<Integer> q;
	private HashMap<Integer, Integer> m;
	private int capacity;

	public LeetCode146(int capacity) {
		this.capacity = capacity;
		q = new ArrayDeque<Integer>();
		m = new HashMap<Integer, Integer>();
	}

	public int get(int key) {
		if (m.containsKey(key)) {
			q.removeLastOccurrence(key);
			q.add(key);
			return m.get(key);
		} else {
			return -1;
		}

	}

	public void set(int key, int value) {
		if (q.size() == capacity) {
			if (m.containsKey(key)) {
				q.removeLastOccurrence(key);
			} else {
				int removedKey = q.poll();
				m.remove(removedKey);
			}
		} else {
			if (m.containsKey(key)) {
				q.removeLastOccurrence(key);
			}
		}
		q.add(key);
		m.put(key, value);
	}

}
