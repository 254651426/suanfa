package shuzu;
import java.util.HashMap;
import java.util.Map;

public class Sumsuzu {

	public static void main(String[] arg) {
		int[] num = new int[] { 4, 5, 4 };
		// twosum(num, 7);
		int[] nums = twoSum(num, 9);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

	}

	private static void twosum(int[] num, int sum) {
		for (int i = 0; i < num.length; i++) {
			for (int j = 1; j < num.length; j++) {
				if (num[i] + num[j] == sum) {
					System.out.println(num[i] + ":" + num[j]);
				}
			}
		}

	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement) && map.get(complement) != i) {
				return new int[] { i, map.get(complement) };
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}

}
