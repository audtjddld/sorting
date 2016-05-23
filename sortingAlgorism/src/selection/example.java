package selection;

import common.ArrayToString;

public class example {

	/**
	 * 선택 정렬
	 * 1. 배열의 첫번째 index 부터 천제를 돌며 최소값을 구한다.
	 * 2. 최소값이 있는 배열과 첫번째 비교한 배열을 교환한다.
	 * 3. 배열의 두번째 부터 다시 반복해서 구한다. 
	 * @author 정명성
	 * @create date : 2016. 5. 23.
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = { 5, 1, 8, 3, 4, 0, 6, 7, 2, 9 };

		int min, changeIndex = 0;
		int length = array.length;

		for (int i = 0; i < length; i++) {
			min = array[i];
			changeIndex = i;
			
			for (int j = i + 1; j < length; j++) {
				if (min > array[j]) {
					min = array[j];
					changeIndex = j;
				}
			} // 최소값 선택 끝
			
			array[changeIndex] = array[i];
			array[i] = min;
			ArrayToString.toString(array);
		}
		System.out.println("::::::::: result :::::::::");
		ArrayToString.toString(array);
	}
}
