package soft;

/**
 * 冒泡排序
 */
public class Maopao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 60, 90, 23, 3, 17, 99, 44 };
//		System.out.println(num.length);
		selectionSort(num);
	}

	public static void selectionSort(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j] + ",");
			}
			System.out.println();
		}
	}
}
