package shuzu;

/**
 * 查找重复元素
 * 
 * @author whIDE
 *
 */
public class Suzu4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[] { 4, 3, 2, 7, 8, 2, 3, 1, 8 };
		quchongfu(num);
	}

	private static void quchongfu(int[] num) {

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					System.out.println(num[i]);
					continue;
				}
			}
		}

	}

}
