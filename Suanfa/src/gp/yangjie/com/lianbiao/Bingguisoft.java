package gp.yangjie.com.lianbiao;

public class Bingguisoft {
	public static void main(String[] args) {
		MylinkNode l1 = init();
		MylinkNode l2 = sortList(l1);
		while (l2 != null) {
			System.out.println(l2.value);
			l2 = l2.next;
		}

	}

	public static MylinkNode init() {
		MylinkNode node1 = new MylinkNode(1);
		MylinkNode node2 = new MylinkNode(8);
		MylinkNode node3 = new MylinkNode(3);
		MylinkNode node4 = new MylinkNode(6);
		MylinkNode node5 = new MylinkNode(5);
		MylinkNode node6 = new MylinkNode(4);
		MylinkNode node7 = new MylinkNode(7);
		MylinkNode node8 = new MylinkNode(2);
		MylinkNode node9 = new MylinkNode(9);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		node8.next = node9;

		return node1;
	}

	public static MylinkNode sortList(MylinkNode head) {
		if (head == null || head.next == null)
			return head;
		MylinkNode fast = head.next, slow = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		MylinkNode tmp = slow.next;
		slow.next = null;
		MylinkNode left = sortList(head);
		MylinkNode right = sortList(tmp);
		MylinkNode h = new MylinkNode(0);
		MylinkNode res = h;
		while (left != null && right != null) {
			if (left.value < right.value) {
				h.next = left;
				left = left.next;
			} else {
				h.next = right;
				right = right.next;
			}
			h = h.next;
		}
		h.next = left != null ? left : right;
		return res.next;
	}

}
