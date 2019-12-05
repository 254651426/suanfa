package gp.yangjie.com.lianbiao;

public class Test1 {

	public static MylinkNode fanzhuan(MylinkNode head) {
		if (head == null) {
			return null;
		}
		MylinkNode pre = null;
		while (head != null) {
			MylinkNode next = head.next; // 得下一个节点 为遍历准备

			head.next = pre; // 把上次保存的上一个节点复制给下一个节点
			pre = head; // 把传进来的节点给pre节点

			head = next; // 得到下个节点 遍历
		}
		return pre;
	}

	public static void main(String[] args) {

		MylinkNode m1 = new MylinkNode(1);
		MylinkNode m2 = new MylinkNode(2);
		MylinkNode m3 = new MylinkNode(3);
		MylinkNode m4 = new MylinkNode(4);

		m1.next = m2;
		m2.next = m3;
		m3.next = m4;
		m4.next = null;

		MylinkNode m5 = fanzhuan(m1);
		while (m5 != null) {
			System.out.println(m5.value);
			m5 = m5.next;
		}

	}

}
