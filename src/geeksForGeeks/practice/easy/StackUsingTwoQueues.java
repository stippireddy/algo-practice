/**
 * Created by Sarveswara Tippireddy on Oct 09, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/stack-using-two-queues/1
 *
 * <p>The solution editorial can be found @
 * http://www.geeksforgeeks.org/implement-stack-using-queue/
 */
package geeksForGeeks.practice.easy;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues {
	private Queue<Integer> q1 = new LinkedList<Integer>();
	private Queue<Integer> q2 = new LinkedList<Integer>();

	/* The method pop which return the element poped out of the stack */
	public int pop() {
		int l = q1.size();
		if(l == 0){
		    return -1;
		}
		for (int i = 1; i < l; i++) {
			q2.add(q1.poll());
		}
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
		return q2.poll();
	}

	/* The method push to push element into the stack */
	public void push(int a) {
		q1.add(a);
	}
}
