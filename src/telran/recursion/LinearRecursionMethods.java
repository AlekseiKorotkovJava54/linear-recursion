package telran.recursion;

public class LinearRecursionMethods {
	
	public static int factorial(int n) {
		if(n<0) throw new IllegalArgumentException("n cannot be a negative");
//		int res =0;
//		if(n == 0) res = 1;
//		else res = n * factorial(n-1);
//		return res;
		int res = 1;
		if(n != 0) res = n * factorial(n-1);
		return res;
	}
	public static int xPowerY1(int a, int b) {
		if(b < 0) throw new IllegalArgumentException("n cannot be a negative");
		int res = 1;
		if(b != 0) res = a * xPowerY1(a, b-1);
		return res;
	}
	public static int xPowerY2(int a, int b) {
		//TODO
		return -1;
	}
	public static void displayArray(int [] array) {
		displayArray(0,array, false);
	}
	
	public static void displayArrayReversed(int [] array) {
		displayArray(0,array, true);
	}
	private static void displayArray(int index, int[] array, boolean isReversed) {
		if(index < array.length) {
			if(isReversed) {
				displayArray(index+1, array, isReversed);
				System.out.print(array[index] + " ");
			} else {
				System.out.print(array[index] + " ");
				displayArray(index+1, array, isReversed);
			}
		}
	}
	
	public static int sum(int [] array) {
		// TODO
		return sum(0, array);
	}
	
	private static int sum(int index, int[] array) {
		int res = 0;
		if(index < array.length) res = array[index] + sum(index + 1, array);
		return res;
	}
	
	public static void reverse(int [] array) {
		reverse(0, array.length-1, array);
	}
	
	private static void reverse(int left, int right, int[] array) {
		if(left<right) {
			int tmp = array[left];
			array[left] = array[right];
			array[right] = tmp;
			reverse(left + 1, right -1, array);
		}
	}
	
	public static int square(int x) {
		//TODO
		return x;
	}
	
	public static boolean isSubstring(String str, String substr) {
		//TODO
		return false;
	}
	
}