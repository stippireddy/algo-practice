package karumanchi;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class TreeTraversals {

	public static void preOrderRecursive(TreeNode node) {
		if (node != null) {
			System.out.print(node.getData());
			preOrderRecursive(node.getLeft());
			preOrderRecursive(node.getRight());
		}
	}

	public static void preOrderIterative(TreeNode head) {
		if (head == null) {
			return;
		}
		Deque<TreeNode> stack = new ArrayDeque<>();
		stack.push(head);
		StringBuffer s = new StringBuffer();
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			if (node.getRight() != null) {
				stack.push(node.getRight());
			}
			if (node.getLeft() != null) {
				stack.push(node.getLeft());
			}
			s.append(node.getData() + ", ");
		}
		System.out.print(s.substring(0, s.length() - 2));
	}

	public static void postOrderRecursive(TreeNode node) {
		if (node != null) {
			postOrderRecursive(node.getLeft());
			postOrderRecursive(node.getRight());
			System.out.print(node.getData());
		}
	}

	public static void inOrderRecursive(TreeNode node) {
		if (node != null) {
			inOrderRecursive(node.getLeft());
			System.out.print(node.getData());
			inOrderRecursive(node.getRight());
		}
	}

	public static void inOrderIterative(TreeNode head) {
		Deque<TreeNode> stack = new ArrayDeque<>();
		StringBuffer s = new StringBuffer();
		do {
			if (head != null) {
				stack.push(head);
				head = head.getLeft();
			} else {
				if (!stack.isEmpty()) {
					head = stack.pop();
					s.append(head.getData() + ", ");
					head = head.getRight();
				}
			}

		} while (!stack.isEmpty() || head != null);
		System.out.print(s.length() > 2 ? s.substring(0, s.length() - 2) : "");
	}


	public static void levelOrder(TreeNode head) {
		if (head == null)
			return;
		StringBuffer s = new StringBuffer();
		Queue<TreeNode> q = new ArrayDeque<TreeNode>();
		q.add(head);
		while (!q.isEmpty()) {
			TreeNode node = q.poll();
			if (node.getLeft() != null) {
				q.add(node.getLeft());
			}
			if (node.getRight() != null) {
				q.add(node.getRight());
			}
			s.append(node.getData() + ", ");
		}
		System.out.println(s.substring(0, s.length() - 2));
	}

	public static void main(String[] args) {
		TreeNode t7 = new TreeNode(7, null, null);
		TreeNode t6 = new TreeNode(6, null, null);
		TreeNode t5 = new TreeNode(5, null, null);
		TreeNode t4 = new TreeNode(4, null, null);
		TreeNode t3 = new TreeNode(3, t6, t7);
		TreeNode t2 = new TreeNode(2, t4, t5);
		TreeNode t1 = new TreeNode(1, t2, t3);
		printTreeTraversals(t1);

		t1.setRight(null);
		t2.setRight(null);
		t2.setLeft(t3);
		t3.setRight(null);
		t3.setLeft(t4);
		printTreeTraversals(t1);

		t2.setRight(t3);
		t2.setLeft(null);
		printTreeTraversals(t1);

		t1 = null;
		printTreeTraversals(t1);

		/*
		 * Expected Output: PreOrder : 1245367 InOrder : 4251637 PostOrder : 4526731
		 ***************************
		 * PreOrder : 1234 InOrder : 4321 PostOrder : 4321
		 ***************************
		 * PreOrder : 1234 InOrder : 2431 PostOrder : 4321
		 ***************************
		 * PreOrder : InOrder : PostOrder :
		 ***************************
		 * 
		 */
	}

	private static void printTreeTraversals(TreeNode t1) {
		System.out.print("PreOrder Recursive: ");
		preOrderRecursive(t1);
		System.out.println();

		System.out.print("PreOrder Iterative: ");
		preOrderIterative(t1);
		System.out.println();

		System.out.print("InOrder : ");
		inOrderRecursive(t1);
		System.out.println();

		System.out.print("InOrder Iterative : ");
		inOrderIterative(t1);
		System.out.println();

		System.out.print("PostOrder Recursive : ");
		postOrderRecursive(t1);
		System.out.println();

		System.out.print("LevelOrder : ");
		levelOrder(t1);
		System.out.println();
		System.out.println("***************************");
	}
}
