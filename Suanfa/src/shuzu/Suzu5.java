package shuzu;

public class Suzu5 {

	/**
	 * 数组元素加起来等于目标数字
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[] { 1, 3, 5 };
		// System.out.println(quchongfu(num, 6));
		int s = subarraySum(num, 6);
		System.out.println(s);
	}

	/**
	 * 
	 * @param nums
	 * @param k
	 * @return
	 */
	private static int quchongfu(int[] nums, int k) {
		int tmp = 0;
		if (nums.length == 1 && nums[0] == k) {
			return 1;
		}
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] + nums[i + 1] == k) {
				tmp = tmp + 1;
			}
			if (nums[i + 1] == k) {
				tmp = tmp + 1;
			}
		}
		return tmp;
	}

	/**
	 * 官网答案
	 * 
	 * @param nums
	 * @param k
	 * @return
	 */
	public static int subarraySum(int[] nums, int k) {
		int count = 0;
		for (int start = 0; start < nums.length; start++) {
			int sum = 0;
			for (int end = start; end < nums.length; end++) {
				sum += nums[end];
				if (sum == k)
					count++;
			}
		}
		return count;
	}

}
