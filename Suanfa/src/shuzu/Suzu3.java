package shuzu;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Suzu3 {

	/**
	 * 去重 返回去重后的数组大小
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[] { 1, 2, 2, 3, 3, 4 };

		System.out.println(removeDuplicates(num));

		// Object[] num1 = oneClear(num);
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);

		}
	}

	public static Object[] oneClear(int[] num) {
		Set set = new HashSet();
		for (int i = 0; i < num.length; i++) {
			set.add(num[i]);
		}
		return set.toArray();
	}

	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0)
			return 0;
		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i + 1;
	}

	public static void quchong(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] != nums[j]) {
					continue;
				}
			}
		}
	}

	public static int removeDuplicatesnew(int[] nums) {
		int m = 0;
		for (int i = 0; i < nums.length;) {
			if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
				int val = nums[i];
				nums[m++] = nums[i++];
				nums[m++] = nums[i++];
				while (i < nums.length && nums[i] == val)
					i++;
			} else
				nums[m++] = nums[i++];
		}
		return m;
	}
}
