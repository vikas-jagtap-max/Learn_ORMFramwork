package sample;

import java.util.Arrays;

//input : -23 -12 -43 44 66 23 -40 -60 7 6 2
//output : -23 -12 -43 -40 -60 44 66 23 7 6 2

//input : 23 -45 -23 56 -10 44 -20 8 6 2
//output : -45 -23 -10 -20 23 56 44 8 6 2
public class Pattern {
	public static void main(String[] args) {

		int arr[] = { 23, -45, -23, 56, -10, 44, -20, 8, 6, 2 };

		Arrays.sort(arr);
		
		for (int i : arr) {
			System.out.println(arr[i]);

		}
		System.out.println(arr);

		/*
		 * for( int i = 0;i<arr.length;i++) { if (arr[i] < arr[i + 1]) { arr[i] = arr[i
		 * + 1]; System.out.println();
		 * 
		 * }
		 * 
		 * }
		 */
	}
}
