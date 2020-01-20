package gp.yangjie.com.lianbiao;

public class RotateRight {

	public static void main(String[] args) {
		MylinkNode m1 = new MylinkNode(1);
		MylinkNode m2 = new MylinkNode(2);
		MylinkNode m3 = new MylinkNode(3);
		MylinkNode m4 = new MylinkNode(4);
		MylinkNode m5 = new MylinkNode(5);
		MylinkNode m6 = new MylinkNode(6);
		m1.next = m2;
		m2.next = m3;
		m3.next = m4;
		m4.next = m5;
		m5.next = m6;

		MylinkNode m7 = rotateRight(m1, 2);
		while (m7!= null) {
			System.out.println(m7.value);
			m7 = m7.next;
		}

	}

	public static MylinkNode rotateRight(MylinkNode head, int k) {

		if (head == null || k == 0) {
			return head;
		}
		MylinkNode tmp = head;
		int len = 0;
		// 求出链表的长度
		while (tmp != null) {
			tmp = tmp.next;
			len++;
		}
		k = k % len; // 以len为一个周期
		if (k == 0) {
			return head;
		}
		// 保存一下头节点
		MylinkNode node = head;
		// 快慢指针
		tmp = head;
		while (k > 0) {
			k--;
			tmp = tmp.next;
		}
		while (tmp.next != null) {
			head = head.next;
			tmp = tmp.next;
		}
		// 记录next的位置，也就是返回值的头结点
		MylinkNode res = head.next;
		// 断开连接
		head.next = null;
		// 后一段的末尾指向前一段的开头
		tmp.next = node;
		return res;

	}
}
