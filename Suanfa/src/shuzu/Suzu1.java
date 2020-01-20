package shuzu;

public class Suzu1 {

	/**
	 * 数组右移
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int moveK = 1;
		int[] nums = new int[] { 1, 2, 3, 4, 5 };
		youyi(nums, moveK);
		// youyitwo(nums, moveK);
	}

	private static void youyi(int[] nums, int moveK) {
		int count = nums.length;
		int[] newNums = new int[count];
		for (int i = 0; i < count; i++) {
			int newI = (i + moveK) % count;
			int oldV = nums[i];
			newNums[newI] = oldV;
		}
		for (int i = 0; i < count; i++) {
			System.out.print(newNums[i]);
		}
	}

	private static void youyitwo(int[] nums, int moveK) {
		int count = nums.length;
		int[] newNums = new int[count];
		for (int i = count - 1; i >= 0; i--) {
			int newI = (i + moveK) % count;
			int oldV = nums[i];
			newNums[newI] = oldV;
		}
		for (int i = 0; i < count; i++) {
			System.out.print(newNums[i]);
		}
	}

}
