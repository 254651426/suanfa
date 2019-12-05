package gp.yangjie.com.lianbiao;

public class MylinkNodeTest1 {

	/**
	 * 链表反转
	 * 
	 * @param head
	 * @return
	 */
	public static MylinkNode fanzhuanlinkNode(MylinkNode head) {
		MylinkNode next = null;
		MylinkNode pre = null;

		while (head != null) {
			next = head.next;
			head.next = pre;
			pre = head;

			head = next;
		}

		return pre;
	}

	/**
	 * 取中间值
	 * 
	 * @param head
	 * @return
	 */
	public static MylinkNode getzjNode(MylinkNode head) {
		if (head == null) {
			return head;
		}
		MylinkNode low = head;
		MylinkNode fast = head;

		while (fast.next != null && fast.next.next != null) {
			low = low.next;
			fast = fast.next.next;
		}
		return low;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mylist m1 = new Mylist();
		MylinkNode l1 = new MylinkNode(1);
		MylinkNode l2 = new MylinkNode(2);
		MylinkNode l3 = new MylinkNode(3);
		MylinkNode l4 = new MylinkNode(4);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = null;
		MylinkNode l5 = fanzhuanlinkNode(l1);
		m1.show(l5);
		MylinkNode l6 = fanzhuanlinkNode(l5);
		System.out.println();
		m1.show(l6);
		System.out.println("======"+getzjNode(l6).value);

	}

}
