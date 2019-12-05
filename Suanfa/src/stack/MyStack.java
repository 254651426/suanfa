package stack;

import gp.yangjie.com.lianbiao.MylinkNode;

public class MyStack {

	MylinkNode stacktop; // 栈顶
	MylinkNode stackbottom; // 栈底

	public MyStack(MylinkNode stacktop, MylinkNode stackbottom) {
		this.stackbottom = stackbottom;
		this.stacktop = stacktop;
	}

	/**
	 * 进栈
	 * 
	 * @param mystack
	 * @param value
	 */
	public static void pushStack(MyStack mystack, int value) {
		MylinkNode m1 = new MylinkNode(value);

		m1.next = mystack.stacktop;

		mystack.stacktop = m1;
	}

	/**
	 * 遍历
	 * 
	 * @param args
	 */
	public static void bianliStack(MyStack mystack) {
		MylinkNode statcktop = mystack.stacktop;
		while (statcktop != mystack.stackbottom) {
			System.out.print(statcktop.value);
			statcktop = statcktop.next;
		}
	}

	/**
	 * 判断为空
	 * 
	 * @param args
	 */
	public static boolean isnull(MyStack mystack) {
		if (mystack.stacktop == mystack.stackbottom) {
			return true;
		}
		return false;
	}

	/**
	 * 清空栈
	 * 
	 * @param args
	 */
	public static void clear(MyStack mystack) {
		mystack.stacktop = null;
		mystack.stacktop = mystack.stackbottom;

	}

	/**
	 * 出栈
	 * 
	 * @param args
	 */
	public static void popstack(MyStack mystack) {
		if (!isnull(mystack)) {
			MylinkNode stacktop = mystack.stacktop;
			mystack.stacktop = stacktop.next;
			System.out.println(stacktop.value);
		}

	}

	public static void main(String[] args) {
		MyStack m = new MyStack(new MylinkNode(0), new MylinkNode(0));
		m.stackbottom = m.stacktop;
		pushStack(m, 1);
		pushStack(m, 2);
		pushStack(m, 3);
		bianliStack(m);
		System.out.println();
		popstack(m);
		bianliStack(m);

	}

}
