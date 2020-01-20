package shuzu;

public class Arraycopy {
	public static void main(String[] args) throws Exception {
		int[] formArray = { 101, 102, 103, 104, 105, 106 };
		int[] toArray = { 201, 202, 203, 204, 205, 206, 207 };
		System.arraycopy(formArray, 2, toArray, 3, 2);
		for (int i = 0; i < toArray.length; i++) {
			System.out.println(i + ":" + toArray[i]);
		}
	}
}
