package geeksForGeeks.linkedLists;

import java.util.ArrayDeque;
import java.util.Deque;

public class FindingPalindrome {

	public static boolean isPalindromeUsingStack(Node<Character> head) {

		Deque<Character> stack = new ArrayDeque<Character>();
		Node<Character> temp = head;
		while (temp != null) {
			stack.push(temp.getData());
			temp = temp.getNextNode();
		}
		boolean isPalin = true;
		while (!stack.isEmpty()) {
			if (!stack.pop().equals(head.getData())) {
				isPalin = false;
			}
			head = head.getNextNode();
		}
		return isPalin;
	}

	public static boolean isPalindromeReversingMiddle(Node<Character> head) {

		Node<Character> middle = FindingMiddle.getMiddleUsingFastPointer(head);
		Node<Character> reverseHead = Reverse.iterativeReverse(middle);
		boolean isPalin = true;
		while (head != null && reverseHead != null) {
			if (!head.getData().equals(reverseHead.getData())) {
				isPalin = false;
			}
		}
		return isPalin;
	}
}
