package gp.yangjie.com.lianbiao;

public class YjTwoWayLinkedList {

	public static void main(String[] args) {
		YjTwoWayLinkedList singleList = new YjTwoWayLinkedList();
		singleList.addnext("A");
		singleList.addnext("B");
		singleList.addnext("C");
		singleList.addnext("D");
		// 打印当前链表信息
		singleList.show();
	}

	private int size; // 节点数量
	private Node head; // 头节点
	private Node tail;// 表示链表尾

	private class Node {
		private Node next; // 下一个节点
		private Node prev; // 上一个节点
		private Object data;// 数据

		public Node(Object data) {
			this.data = data;
		}
	}

	//给尾部添加节点
	public void addnext(Object data) {
		Node newNode = new Node(data);
		if (size != 0) {
			newNode.prev = tail;
			tail.next = newNode;
			tail = newNode;
//			newNode.prev = tail;
//			tail.next = newNode;
//			tail = newNode;
		} else {
			head = newNode;
			tail = newNode;
		}
		size++;
	}

	//从前往后读取
	public void show() {
		if (size > 0) {
			Node note = head;
			int cursize = size;
			while (cursize > 0) {
				System.out.println(note.data);
				note = note.next;
				cursize--;
			}
		}

	}

}
