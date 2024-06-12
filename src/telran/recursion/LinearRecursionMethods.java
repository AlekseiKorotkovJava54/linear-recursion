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
		if(b<0) throw new IllegalArgumentException("n cannot be a negative");
		int res = 1;
		if (b != 0) res = res + xPowerY2(1, a, b) - 1;
		return b % 2 != 0 && a < 0 ? -res:res;
	} 
	
	private static int xPowerY2(int res, int a, int b) {
		int sum = powerSum(res, a);
		if(b != 1) sum = xPowerY2(sum, a, b-1);
		return sum;
	}
	
	public static int powerSum(int res, int a) {
		int sum = 0;
		if(a > 0) if(a != 0) sum = res + powerSum(res, a - 1);
		if(a < 0) if(a != 0) sum = res + powerSum(res, a + 1);
		return sum;
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
		return x > 0 ? powerSum(x, x): -powerSum(x, x);
	}
	
	public static boolean isSubstring(String str, String substr) {
		boolean res = false;
		if(str.length() >= substr.length()) {
			if(substr.equals(str.substring(str.length()-substr.length()))) {
				res = true;
				}
			else {
				str = newString(0, str);
				res = isSubstring(str, substr);
				}
			}
		return res;
	}
	
	public static String newString(int index, String str) {
		String res = "";
		if(index < str.length()-1) res = str.charAt(index) + newString(index +1 , str);
		return res;
	}
	
}