package shuzu;

/**
 * 删除数组元素
 * @author whIDE
 *
 */
public class Shuzu6 {

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5 };
		delete(num, 2);
	}

	public static void delete(int[] num, int targer) {
		for (int i = targer; i < num.length - 1; i++) {
			num[i] = num[i + 1];
		}
		int[] num1 = new int[num.length - 1];
		for (int i = 0; i < num.length - 1; i++) {
			num1[i] = num[i];
		}
//		for (int i = 0; i < num.length; i++) {
//			System.out.print(num[i]+"  ");
//		}
//		System.out.println();
		for (int i = 0; i < num1.length; i++) {
			System.out.print(num1[i]+"  ");
		}

	}

}
