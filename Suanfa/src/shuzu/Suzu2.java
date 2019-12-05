package shuzu;

public class Suzu2 {

	/**
	 * 数组调换位置
	 * @param args
	 */
	public static void main(String[] args) {

		int[] num1 = new int[] { 1, 2, 3, 4, 5 };

		int[] num2 = new int[5];

		for (int i = 0; i < num2.length; i++) {
			num2[i] = num1[(num1.length - 1) - i];
		}
		for (int i = 0; i < num2.length; i++) {
			System.out.println(num2[i]);
		}

	}

}
