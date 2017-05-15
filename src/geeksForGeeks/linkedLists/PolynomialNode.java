package geeksForGeeks.linkedLists;


public class PolynomialNode<Data> extends Node<Data> {

	int degree;

	public PolynomialNode(Data data1, int data2) {
		super(data1);
		this.degree = data2;
	}

	public int getDegree() {
		return degree;
	}

	public void setDegree(int degree) {
		this.degree = degree;
	}

}
