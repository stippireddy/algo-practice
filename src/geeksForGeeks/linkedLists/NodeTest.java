package geeksForGeeks.linkedLists;

import static org.junit.Assert.*;

import org.junit.Test;

public class NodeTest {

	@Test
	public void test() {

		Node<Integer> node = new Node<Integer>(1);
		assertTrue(1 == node.getData());

	}

}
