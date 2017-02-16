package geeksForGeeks.linkedLists;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindingPalindromeTest {

	@Test
	public void testIsPalindromeUsingStack() {
		Node<Character> node5 = new Node<Character>('r');
		Node<Character> node4 = new Node<Character>('a', node5);
		Node<Character> node3 = new Node<Character>('d', node4);
		Node<Character> node2 = new Node<Character>('a', node3);
		Node<Character> node1 = new Node<Character>('m', node2);

		assertFalse(FindingPalindrome.isPalindromeReversingMiddle(node1));
	}

}
