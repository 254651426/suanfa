package tree;

public class Mytree {
	public String value;
	public Mytree left;
	public Mytree right;

	public Mytree(Mytree left, Mytree right, String value) {
		this.left = left;
		this.value = value;
		this.right = right;
	}

	public Mytree(String value) {
		this.value = value;
	}

	public static void main(String[] args) {

		Mytree A = new Mytree("A");
		Mytree B = new Mytree("B");
		Mytree C = new Mytree("C");
		Mytree D = new Mytree("D");
		Mytree E = new Mytree("E");
		Mytree F = new Mytree("F");
		Mytree G = new Mytree("G");
		Mytree H = new Mytree("H");
		Mytree I = new Mytree("I");
		Mytree J = new Mytree("J");
		Mytree K = new Mytree("K");

		A.left = B;
		A.right = C;
		B.left = D;
		B.right = E;
		D.left = H;
		D.right = I;
		E.right = J;
		C.left = F;
		C.right = G;
		F.right = K;

	}

}
