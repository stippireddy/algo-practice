package karumanchi.trees;

import java.util.ArrayDeque;
import java.util.Queue;

public class FindElement {

	public boolean findElementRecursively(TreeNode head, int data) {
		boolean isFound = false;
		if (head != null) {
			if (head.getVal() == data) {
				isFound = true;
			} else {
				isFound = findElementRecursively(head.getLeft(), data) || findElementRecursively(head.getRight(), data);
			}
		}
		return isFound;
	}

	public boolean findElementIteratively(TreeNode head, int data) {
		boolean isFound = false;
		if (head != null) {
			Queue<TreeNode> q = new ArrayDeque<>();
			q.add(head);
			while (!q.isEmpty()) {
				head = q.poll();
				if (head.getVal() == data) {
					isFound = true;
					break;
				}
				if (head.getLeft() != null) {
					q.add(head.getLeft());
				}
				if (head.getRight() != null) {
					q.add(head.getRight());
				}

			}
		}
		return isFound;
	}

	public static void main(String[] args) {
		TreeNode t7 = new TreeNode(7, null, null);
		TreeNode t6 = new TreeNode(6, null, null);
		TreeNode t5 = new TreeNode(5, null, null);
		TreeNode t4 = new TreeNode(4, null, null);
		TreeNode t3 = new TreeNode(3, t6, t7);
		TreeNode t2 = new TreeNode(2, t4, t5);
		TreeNode t1 = new TreeNode(1, t2, t3);
		FindElement f = new FindElement();
		System.out.println(f.findElementIteratively(t1, 7));
		System.out.println(f.findElementRecursively(t1, 8));
	}
}
