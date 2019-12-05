package gp.yangjie.com.lianbiao;

public class Mylist {

	int size = 0;

	/**
	 * 新增头结点
	 * 
	 * @param head
	 */
	public static void addList(MylinkNode head, MylinkNode newhead) {
		if (head == null && head.next == null) {
			head = newhead;
		} else {
			MylinkNode old = head; // 先将原来的头节点指向old
			head = newhead; // 头节点指向新的节点
			head.next = old; // 新的头节点指向老的头节点
		}
	}

	/**
	 * 中间插入
	 * 
	 * @param head
	 * @param newhead
	 */
	public static void insert(MylinkNode s, MylinkNode p) {
		MylinkNode q = s.next; // 先找到s的下一个节点q
		s.next = p; // s的下一个节点指向p
		p.next = q; // p的下一个节点指向q

	}

	public static void delete(MylinkNode head, MylinkNode delnode) {
		if (delnode != null && delnode.next != null) { // 想将要删除的下一个节点找到。
														// 把下一个节点的值赋值给要删除的节点。在把下一个节点删掉
														// ()
			MylinkNode old = delnode.next;
			delnode.value = old.value;
			delnode.next = old.next;
			old = null;
		}
		// 删除最后一个元素的情况
		else if (delnode.next == null) { // 从头节点开始遍历。头节点的下一个如果是如果是要删除的节点就next==null
			while (head != null) {
				if (head.next != null && head.next == delnode) {
					head.next = null;
					break;
				}
				head = head.next;
			}
		}

	}

	public static void show(MylinkNode head) {
		while (head != null) {
			System.out.print(head.value);
			head = head.next;
		}
	}

	public static int find(MylinkNode head, int index) {
		int count = 0;
		while (head != null) {
			if (index == count) {
				return head.value;
			}
			count++;
			head = head.next;
		}
		return -1;
	}

	public static void main(String[] args) {
		//
		MylinkNode m1 = new MylinkNode(1);
		MylinkNode m2 = new MylinkNode(2);
		MylinkNode m3 = new MylinkNode(3);
		MylinkNode m4 = new MylinkNode(4);
		m1.next = m2;
		m2.next = m3;
		m3.next = m4;
		m4.next = null;
		// insert(m2, new MylinkNode(5));
		// show(m1);
		// System.out.println();
		// delete(m1, m4);
		// show(m1);
		// addList(null, m1);
		System.out.println(find(m1, 1));
	}

}
