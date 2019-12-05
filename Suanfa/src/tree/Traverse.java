package tree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Traverse {

	/**
	 * 前序遍历
	 * 
	 * @param args
	 */
	public static void preOrder(Mytree myMytree) {
		if (myMytree != null) {
			Stack<Mytree> stack = new Stack<Mytree>();
			stack.push(myMytree);
			while (!stack.empty()) {
				Mytree Mytree = stack.pop();
				System.out.print(Mytree.value + " ");
				if (Mytree.right != null) {
					stack.push(Mytree.right);
				}
				if (Mytree.left != null) {
					stack.push(Mytree.left);
				}
			}
		}

	}

	/**
	 * 中序遍历
	 * 
	 * @param args
	 */

	public static void inOrder(Mytree mytreeNode) {
		Stack<Mytree> stack = new Stack<Mytree>();
		while (!stack.empty() || mytreeNode != null) {
			if (mytreeNode != null) {
				stack.push(mytreeNode);
				mytreeNode = mytreeNode.left;
			} else {
				mytreeNode = stack.pop();
				System.out.print(mytreeNode.value + " ");
				mytreeNode = mytreeNode.right;
			}
		}

	}

	/**
	 * 后续遍历
	 * 
	 * @param args
	 */
	public static void afterOrder(Mytree mytreeNode) {
		Stack<Mytree> stack1 = new Stack<Mytree>();
		Stack<Mytree> stack2 = new Stack<Mytree>();
		stack1.push(mytreeNode);
		while (!stack1.empty()) {
			Mytree m1 = stack1.pop();
			stack2.push(m1);
			if (m1.left != null) {
				stack1.push(m1.left);
			}
			if (m1.right != null) {
				stack1.push(m1.right);
			}
		}
		while (!stack2.empty()) {
			Mytree m2 = stack2.pop();
			System.out.print(m2.value + " ");
		}

	}

	/**
	 * 层次遍历
	 * 
	 * @param args
	 */
	public static void levelOrder(Mytree mytreeNode) {
		Queue<Mytree> q1 = new ArrayDeque<Mytree>();
		q1.offer(mytreeNode);
		while (!q1.isEmpty()) {
			Mytree m1 = q1.poll();
			System.out.print(m1.value + " ");
			if (m1.left != null) {
				q1.offer(m1.left);
			}
			if (m1.right != null) {
				q1.offer(m1.right);
			}
		}
	}

	/**
	 * 左右跟（其他方法）
	 * 
	 * @param args
	 */
	public static void afterOrdertwo(Mytree mytreeNode) {
		Stack<Mytree> q1 = new Stack<Mytree>();
		q1.push(mytreeNode);
		while (!q1.isEmpty()) {
			Mytree m1 = q1.pop();
			if (m1.left != null) {
				q1.push(m1.left);
			} else if (m1.right != null) {
				q1.push(m1.right);
			}
			System.out.print(m1.value + " ");
		}
	}

	public static void main(String args[]) {
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
		preOrder(A);
		System.out.println();
		inOrder(A);
		System.out.println();
		afterOrder(A);
		System.out.println();
		levelOrder(A);
		System.out.println();
		afterOrdertwo(A);
	}

}
