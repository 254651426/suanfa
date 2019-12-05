package gp.yangjie.com.lianbiao;

public class Zifuchuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("abcabcabcd"));

		System.out.println(repeatedSubstringPattern("abcc"));
	}

	public static int lengthOfLongestSubstring(String s) {
		int n = s.length(), ans = 0;
		int[] index = new int[128]; // current index of character
		// try to extend the range [i, j]
		for (int j = 0, i = 0; j < n; j++) {
			i = Math.max(index[s.charAt(j)], i);
			ans = Math.max(ans, j - i + 1);
			index[s.charAt(j)] = j + 1;
		}
		return ans;
	}

	public static boolean repeatedSubstringPattern(String s) {

		String str = s + s;
		return str.substring(1, str.length() - 1).contains(s);
	}

}
