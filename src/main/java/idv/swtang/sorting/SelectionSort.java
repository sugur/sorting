package idv.swtang.sorting;

import java.util.Arrays;


public class SelectionSort {
	
	  public static int[] sortAsc(int[] input) {
	        for (int i = 0; i < input.length - 1; i++) {
	            for (int j = i + 1; j < input.length; j++) {
	                if (input[i] > input[j]) {
	                    swap(input, i, j);
	                }
	            }
	        }
	        System.out.println(Arrays.toString(input));
	        return input;
	    }
	
	private static void swap(int[] input, int i, int j) {
        int tmp = input[i];
        input[i] = input[j];
        input[j] = tmp;
    }

}
