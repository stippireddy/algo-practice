package geeksForGeeks.linkedLists;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class ReverseTest {

  @Test
  public void testIterativeReverseForNullList() {
    assertNull(Reverse.iterativeReverse(null));
  }

  @Test
  public void testIterativeReverseForSingleElementList() {
    Node<Integer> input = new Node<Integer>(1);
    Node<Integer> output = (Node<Integer>) Reverse.iterativeReverse(input);
    assertNotNull(output);
    assertEquals(input.getData(), output.getData());
  }

  @Test
  public void testIterativeReverseList() {
    Node<Integer> node1 = new Node<Integer>(1);
    Node<Integer> node2 = new Node<Integer>(2, node1);
    Node<Integer> node3 = new Node<Integer>(3, node2);
    Node<Integer> node4 = new Node<Integer>(4, node3);
    Node<Integer> node5 = new Node<Integer>(5, node4);
    Node<Integer> output = (Node<Integer>) Reverse.iterativeReverse(node5);
    assertNotNull(output);
    assertEquals(output.getData(), node1.getData());
    assertEquals(output.getNextNode().getData(), node2.getData());
  }

  @Test
  public void testRecursiveReverseForNullList() {
    assertNull(Reverse.recursiveReverse(null));
  }

  @Test
  public void testRecursiveReverseForSingleElementList() {
    Node<Integer> input = new Node<Integer>(1);
    Node<Integer> output = (Node<Integer>) Reverse.recursiveReverse(input);
    assertNotNull(output);
    assertEquals(input.getData(), output.getData());
  }

  @Test
  public void testRecursiveReverseList() {
    Node<Integer> node1 = new Node<Integer>(1);
    Node<Integer> node2 = new Node<Integer>(2, node1);
    Node<Integer> node3 = new Node<Integer>(3, node2);
    Node<Integer> node4 = new Node<Integer>(4, node3);
    Node<Integer> node5 = new Node<Integer>(5, node4);
    Node<Integer> output = (Node<Integer>) Reverse.recursiveReverse(node5);
    assertNotNull(output);
    assertEquals(output.getData(), node1.getData());
    assertEquals(output.getNextNode().getData(), node2.getData());
  }

}
