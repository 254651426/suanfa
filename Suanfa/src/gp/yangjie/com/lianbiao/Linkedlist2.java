package gp.yangjie.com.lianbiao;

public class Linkedlist2 {
	private TreeNode head;

	public static void main(String[] args) {
		Linkedlist2 t2 = new Linkedlist2();
		t2.add(1);
		t2.add(2);
		t2.add(3);
		t2.add(4);
		t2.add(5);
		// t2.tail(6);
		System.out.println(t2.find(2));
		t2.bianliNode();
		// t2.bianlitailNode();
	}

	public void add(int value) {
		TreeNode newhead = new TreeNode(value);
		if (head == null) {
			head = newhead;
		} else {
			TreeNode oldhead = head;
			head = newhead;
			head.next = oldhead;
		}
	}

	public int find(int index) {
		int count = 0;
		while (head != null) {
			if (count == index) {
				return head.value;
			}
			count++;
			head = head.next;
		}
		return -1;
	}

	/**
	 * 尾结点加入
	 * 
	 * @param treeNode
	 * @param value
	 */
	public void tail(int value) {
		TreeNode newhead = new TreeNode(value);
		while (head != null) {
			if (head.next == null) {
				head.next = newhead;
				head.next.next = null;
				break;
			}
			head = head.next;
		}

	}

	public void bianliNode() {
		while (head != null) {
			System.out.println(head.value);
			head = head.next;
		}
	}

	private static class TreeNode {

		public int value;

		TreeNode next;

		public TreeNode(int value) {
			this.value = value;
		}

	}

}
