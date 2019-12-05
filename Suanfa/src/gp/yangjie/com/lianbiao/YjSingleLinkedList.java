package gp.yangjie.com.lianbiao;

public class YjSingleLinkedList {

	public static void main(String[] args) {
		YjSingleLinkedList singleList = new YjSingleLinkedList();
		singleList.addhead("A");
		singleList.addhead("B");
		singleList.addhead("C");
		singleList.addhead("D");
		// 打印当前链表信息
		singleList.show();
	}

	private int size; // 节点数量
	private Note head; // 头节点

	private class Note {
		private Note next; // 下一个节点
		private Object data;// 数据

		public Note(Object data) {
			this.data = data;
		}
	}

	public void addhead(Object data) {
		Note newNode = new Note(data);
		if (size != 0) {
			newNode.next = head;
			head = newNode;
		} else {
			head = newNode;
		}
		size++;
	}
 
	
	public void show() {
		if (size > 0) {
			Note note = head;
			int cursize = size;
			while (cursize > 0) {
				System.out.println(note.data);
				note = note.next;
				cursize--;
			}
		}

	}

}
