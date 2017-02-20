package com.mhuiq.demo.algorithm;

/**
 * Created by 80374361 on 2017/2/20.
 */
public class RotateArray {

    public int minNumberInRotateArray(int [] array) {
        int length = array.length;
        if (length == 0) {
            return 0;
        }
        for (int i = 0; i < length - 1 ; i++) {
            if (array[i] > array[i+1]  || i+1 == length) {
                return array[i+1];
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] array = {3,4,5,1,1};
        RotateArray ra = new RotateArray();
        System.out.println(ra.minNumberInRotateArray(array));
    }
}
