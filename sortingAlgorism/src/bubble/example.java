package bubble;

import common.ArrayToString;

public class example {

	/**
	 * bubble 소팅
	 * @author 정명성
	 * @create date : 2016. 5. 23.
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = { 5, 1, 8, 3, 4, 0, 6, 7, 2, 9 };
		int size = array.length;
		int temp;
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - 1; j++) {
				if(array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
			ArrayToString.toString(array);
		}
		System.out.println("::::::::: result ::::::::::");
		ArrayToString.toString(array);
	}

}
