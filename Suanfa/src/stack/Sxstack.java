package stack;

import gp.yangjie.com.lianbiao.MylinkNode;

public class Sxstack {

	int value; // 值

	MylinkNode bottm;// 栈底

	MylinkNode top;// 栈顶

	public Sxstack(MylinkNode bottm, MylinkNode top) {
		super();
		this.bottm = bottm;
		this.top = top;
	}

	/**
	 * 入栈
	 * 
	 * @param args
	 */
	public static void rushstack(Sxstack stack, int value) {
		MylinkNode m = new MylinkNode(value);
		m.next = stack.top;
		stack.top = m;
	}

	/**
	 * 出栈
	 */
	public static int popstack(Sxstack s) {
		if (s.top != s.bottm) {
			MylinkNode m1 = s.top;
			s.top = m1.next;
			return m1.value;
		}
		return -1;
	}

	/**
	 * 遍历
	 * 
	 * @param args
	 */
	public static void bianli(Sxstack s) {
		MylinkNode top = s.top;
		if (s != null) {
			while (top != s.bottm) {
				System.out.print(top.value + " ");
				top = top.next;
			}

		}
	}

	public static void main(String[] args) {
		Sxstack s1 = new Sxstack(new MylinkNode(0), new MylinkNode(0));
		s1.top = s1.bottm; // 为了方便操作判断
		rushstack(s1, 1);
		rushstack(s1, 2);
		rushstack(s1, 3);

		bianli(s1);
		System.out.println();
		System.out.println(popstack(s1));
		bianli(s1);
	}

}
