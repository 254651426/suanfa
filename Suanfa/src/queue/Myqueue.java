package queue;

public class Myqueue {

	int[] arrays = null;

	int front; // //指向是第一个有效元素

	int near; // 指向最后一个有效元素的下一个元素（无效元素）

	public Myqueue(int[] arrays, int front, int near) {
		super();
		this.arrays = arrays;
		this.front = front;
		this.near = near;
	}

	/**
	 * 入队
	 * 
	 * @param args
	 */
	public void pushqueue(Myqueue myqueue, int value) {
		if (isfull(myqueue)) {
			// System.out.println("列队已满不能新增");
			return;
		}
		myqueue.arrays[myqueue.near] = value;
		myqueue.near = (near + 1) % myqueue.arrays.length; // near 每次都+1
															// 所以数组不是少一位。不然影响后面的判断
	}

	/**
	 * 遍历
	 * 
	 * @param args
	 */

	public void bianliqueue(Myqueue myqueue) {
		int i = myqueue.front;
		while (i < myqueue.near) {
			System.out.print(myqueue.arrays[i] + " ");
			i = (i + 1) % myqueue.arrays.length;
		}
	}

	/**
	 * 是否为空
	 */

	public static boolean isnull(Myqueue myqueue) {
		if (myqueue.front == myqueue.near) {
			return true;
		}
		return false;
	}

	/**
	 * 是否为满
	 * 
	 * @param args
	 */
	public boolean isfull(Myqueue myqueue) {
		if ((myqueue.near + 1) % myqueue.arrays.length == myqueue.front) {
			return true;
		}
		return false;
	}

	/**
	 * 出列
	 * 
	 * @param args
	 */
	public static void popqueue(Myqueue myqueue) {
		if (!isnull(myqueue)) {
			System.out.println(myqueue.arrays[myqueue.front]);
			myqueue.front = (myqueue.front + 1) % myqueue.arrays.length;
		}
	}

	public static void main(String[] args) {
		int[] num = new int[5];
		Myqueue m = new Myqueue(num, 0, 0); // 数组为5 实际大小必须是4 少一位。。不是near值最后一位会为0
											// 影响后面的判断。
											// front 跟near 就是量个指针 用于判断
		m.pushqueue(m, 1);
		m.pushqueue(m, 2);
		m.pushqueue(m, 3);
		m.pushqueue(m, 4);
		m.pushqueue(m, 5);
		m.pushqueue(m, 6);
		m.pushqueue(m, 7);
		m.bianliqueue(m);
		System.out.println(m.isfull(m));
		System.out.println();
		popqueue(m);
		m.bianliqueue(m);

	}

}
