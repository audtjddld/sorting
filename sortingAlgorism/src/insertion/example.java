package insertion;

import common.ArrayToString;

public class example {
	/**
	 * 삽업 정렬
	 * 
	 * 2번째 값 부터 배열 맨 앞까지 반복하며 정렬을 시작한다.
	 * 
	 * 약간의 개념은 개인적으로 쉽게 이해가 되지 않았다.
	 * -_-;; 따로 책을 보는 것이 아닌 글을보면서 해서 그런지는 모르겠다.
	 * 
	 * @author 정명성
	 * @create date : 2016. 5. 23.
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = { 5, 1, 8, 3, 4, 0, 6, 7, 2, 9 };
		int temp;
		int length = array.length;
		int i, j;
		for (i = 1; i < length; i++) {

			temp = array[i];
			j = i - 1;
			while ((j >= 0) && (array[j] > temp)) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = temp;
		}

		ArrayToString.toString(array);
	}
}
