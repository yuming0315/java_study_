package chapter03;

public class ArrayUtil {

	public static double[] intToDouble(int[] is) {
		double[] result = new double[is.length];
		for(int i=0;i<is.length;i++) {
			result[i]=is[i];
		}
		return result;
	}

	public static int[] doubleToInt(double[] ds) {
		int[] result = new int[ds.length];
		for(int i=0;i<ds.length;i++) {
			result[i]=(int)ds[i];
		}
		return result;
	}

	public static int[] concat(int[] is, int[] is2) {
		int[] arr = new int[is.length+is2.length];
		for(int i=0;i<arr.length;i++) {
			if(is.length>i) {
				arr[i]=is[i];
			}
			else {
				arr[i]=is2[i-is.length];
			}
		}
		return arr;
	}

}
