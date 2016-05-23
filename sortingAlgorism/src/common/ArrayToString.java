package common;

public class ArrayToString {

	public static void toString(int[] array) {

		StringBuffer sb = new StringBuffer("[");
		for (int a : array) {
			sb.append(a + " ");
		}
		sb.append("]");

		System.out.println(sb.toString());

	}
}
