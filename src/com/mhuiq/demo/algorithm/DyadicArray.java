package com.mhuiq.demo.algorithm;

public class DyadicArray {
	public boolean find (int target, int[][] array) {
		int length = array[0].length - 1;
	    int depth = 0;
	    while (!(length < 0 || depth > array.length - 1)) {
	        if (array[depth][length] < target) {
	            ++ depth;
	        } else if (array[depth][length] > target) {
	            -- length;
	        } else {
	            return true;
	        }
	    }
	    return false;
	}
}
