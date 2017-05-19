package geeksForGeeks.linkedLists;

public class PolynomialAddition {

	public PolynomialNode<Integer> addPolynomials(PolynomialNode<Integer> p1, PolynomialNode<Integer> p2) {
		if (p1 == null) {
			return p2;
		}
		if (p2 == null) {
			return p1;
		}
		PolynomialNode<Integer> result = null;
		PolynomialNode<Integer> returnableResult = result;

		while (p1 != null && p2 != null) {
			int degree1 = p1.getDegree();
			int degree2 = p2.getDegree();
			if (degree1 > degree2) {
				PolynomialNode<Integer> current = new PolynomialNode<Integer>(p1.getData(), p1.getDegree());
				if (result == null) {
					result = current;
					returnableResult = result;
				} else {
					result.setNextNode(current);
					result = (PolynomialNode<Integer>) result.getNextNode();
				}
				p1 = (PolynomialNode<Integer>) p1.getNextNode();
			} else if (degree2 > degree1) {
				PolynomialNode<Integer> current = new PolynomialNode<Integer>(p2.getData(), p2.getDegree());
				if (result == null) {
					result = current;
					returnableResult = result;
				} else {
					result.setNextNode(current);
					result = (PolynomialNode<Integer>) result.getNextNode();
				}
				p2 = (PolynomialNode<Integer>) p2.getNextNode();
			} else {
				PolynomialNode<Integer> current = new PolynomialNode<Integer>(p1.getData() + p2.getData(),
						p1.getDegree());
				if (result == null) {
					result = current;
					returnableResult = result;
				} else {
					result.setNextNode(current);
					result = (PolynomialNode<Integer>) result.getNextNode();
				}
				p1 = (PolynomialNode<Integer>) p1.getNextNode();
				p2 = (PolynomialNode<Integer>) p2.getNextNode();
			}
		}
		if (p1 != null) {
			result.setNextNode(p1);
		} else if (p2 != null) {
			result.setNextNode(p2);
		}
		return returnableResult;
	}

	public static void main(String[] args) {
		PolynomialNode<Integer> node1 = new PolynomialNode<Integer>(5, 2);
		PolynomialNode<Integer> node2 = new PolynomialNode<Integer>(4, 1);
		PolynomialNode<Integer> node3 = new PolynomialNode<Integer>(2, 0);
		node1.setNextNode(node2);
		node2.setNextNode(node3);

		PolynomialNode<Integer> node4 = new PolynomialNode<Integer>(5, 1);
		PolynomialNode<Integer> node5 = new PolynomialNode<Integer>(5, 0);
		node4.setNextNode(node5);

		PolynomialAddition pa = new PolynomialAddition();
		PolynomialNode<Integer> result = pa.addPolynomials(node1, node4);

		while (result != null) {
			System.out.print("(" + result.getData() + " , " + result.getDegree() + ")" + " , ");
			result = (PolynomialNode<Integer>) result.getNextNode();
		}
	}
}
