package stack;

/**
 * 自定义一个栈。得到最大 最小值
 * 
 * @author whIDE
 *
 */
public class Stackms {

	private int[] data;

	private int[] min;

	private int[] max;

	public Integer getMax() {
		if (max == null || max.length == 0) {
			return null;
		}
		return max[max.length - 1];
	}

	public Integer getMin() {
		if (min == null || min.length == 0) {
			return null;
		}
		return min[min.length - 1];
	}

	public void push(int i) {
		if (data == null) {
			data = new int[1];
			min = new int[1];
			max = new int[1];
			data[0] = i;
			min[0] = i;
			max[0] = i;
			return;
		}
		int[] oldData = data;
		int[] oldMin = min;
		int[] oldMax = max;
		data = new int[oldData.length + 1];
		min = new int[oldMin.length + 1];
		max = new int[oldMax.length + 1];
		System.arraycopy(oldData, 0, data, 0, oldData.length);
		System.arraycopy(oldMin, 0, min, 0, oldMin.length);
		System.arraycopy(oldMax, 0, max, 0, oldMax.length);
		data[oldData.length] = i;
		int mi = oldMin[oldMin.length - 1];
		if (i < mi) {
			min[oldMin.length] = i;
		} else {
			min[oldMin.length] = mi;
		}
		int ma = oldMax[oldMax.length - 1];
		if (i > ma) {
			max[oldMax.length] = i;
		} else {
			max[oldMax.length] = ma;
		}
	}

	public Integer pop() {
		if (data == null || data.length == 0) {
			return null;
		}
		if (data.length == 1) {
			int i = data[0];
			data = null;
			min = null;
			max = null;
			return i;
		}
		int result = data[data.length - 1];
		int[] newData = new int[data.length - 1];
		int[] newMin = new int[min.length - 1];
		int[] newMax = new int[max.length - 1];
		System.arraycopy(data, 0, newData, 0, newData.length);
		System.arraycopy(min, 0, newMin, 0, newMin.length);
		System.arraycopy(max, 0, newMax, 0, newMax.length);
		data = newData;
		min = newMin;
		max = newMax;
		return result;
	}

	public void bianlimin() {
		for (int i = 0; i < min.length; i++) {
			System.out.println(min[i]);
		}

	}

	public static void main(String[] args) {
		Stackms s = new Stackms();
		s.push(1);
		s.push(4);
		s.push(5);
		s.push(7);
		s.push(6);
		s.push(2);
		s.bianlimin();
		System.out.println(s.pop());
		System.out.println(s.getMin());
	}
}
