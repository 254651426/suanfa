package tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class Depth {

	/**
	 * 树 最大深度
	 * 
	 * @param args
	 */
	public static int Maxdep(Mytree mytreeNode) {
		if (mytreeNode == null) {
			return 0;
		}
		Queue<Mytree> q = new ArrayDeque<>();
		q.offer(mytreeNode);
		int num = 0;
		while (!q.isEmpty()) {
			num++;
			int length = q.size();
			for (int i = 0; i < length; i++) {
				mytreeNode = q.poll();
				if (mytreeNode.left != null) {
					q.offer(mytreeNode.left);
				}
				if (mytreeNode.right != null) {
					q.offer(mytreeNode.right);
				}
			}
		}
		return num;
	}

	/**
	 * 树 最小深度
	 * 
	 * @param args
	 */
	public static int Mimdep(Mytree mytreeNode) {
		if (mytreeNode == null) {
			return 0;
		}
		Queue<Mytree> q = new ArrayDeque<>();
		q.offer(mytreeNode);
		int num = 0;
		while (!q.isEmpty()) {
			num++;
			int length = q.size();
			for (int i = 0; i < length; i++) {
				mytreeNode = q.poll();
				if (mytreeNode.left == null && mytreeNode.right == null) {
					return num;
				}
				if (mytreeNode.left != null) {
					q.offer(mytreeNode.left);
				}
				if (mytreeNode.right != null) {
					q.offer(mytreeNode.right);
				}
			}
		}
		return num;
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
		System.out.println(Maxdep(A));
		System.out.println(Mimdep(A));
	}

}
