package gp.yangjie.com.lianbiao;

public class MylinkNodeTest2 {

	public static MylinkNode hebingNode(MylinkNode head1, MylinkNode head2) {
		if (head1 == null && head2 == null) {
			return null;
		} else if (head1 == null) {
			return head2;
		} else if (head2 == null) {
			return head1;
		}

		MylinkNode head = null;
		if (head1.value < head2.value) {
			head = head1;
			head.next = hebingNode(head1.next, head2);
		} else {
			head = head2;
			head.next = hebingNode(head1, head2.next);
		}
		return head;
	}

	public static void main(String[] args) {
		MylinkNode m1 = new MylinkNode(1);
		MylinkNode m2 = new MylinkNode(2);
		MylinkNode m3 = new MylinkNode(3);
		MylinkNode m4 = new MylinkNode(4);
		m1.next = m3;
		m2.next = m4;
		MylinkNode m5 = hebingNode(m1, m2);
		while (m5 != null) {
			System.out.println(m5.value);
			m5 = m5.next;
		}
	}

}
