package karumanchi;

import java.util.ArrayDeque;
import java.util.Queue;

public class InsertElement {

	public TreeNode insertByIterativeRoutine(TreeNode head, TreeNode nodeToBeInserted) {
		TreeNode headToReturn = head;
		if (head != null) {
			Queue<TreeNode> q = new ArrayDeque<>();
			q.add(head);
			while (!q.isEmpty()) {
				head = q.poll();
				if (head.getLeft() != null) {
					q.add(head.getLeft());
				} else {
					head.setLeft(nodeToBeInserted);
					break;
				}
				if (head.getRight() != null) {
					q.add(head.getRight());
				} else {
					head.setRight(nodeToBeInserted);
					break;
				}
			}
		}
		return headToReturn;
	}

	public static void main(String[] args) {
		TreeNode t7 = new TreeNode(7, null, null);
		TreeNode t6 = new TreeNode(6, null, null);
		TreeNode t5 = new TreeNode(5, null, null);
		TreeNode t4 = new TreeNode(4, null, null);
		TreeNode t3 = new TreeNode(3, t6, t7);
		TreeNode t2 = new TreeNode(2, t4, t5);
		TreeNode t1 = new TreeNode(1, t2, t3);
		InsertElement i = new InsertElement();
		TreeNode t8 = new TreeNode(8, null, null);
		i.insertByIterativeRoutine(t1, t8);
		System.out.println(t4.getLeft().getData());
	}
}
