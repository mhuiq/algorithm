package com.mhuiq.demo.algorithm;

/**
 * Created by 80374361 on 2017/2/22.
 */
public class NumberOf1 {

    public int numberOf1(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & 1) == 1) {
                ++count;
            }
            n = n >>> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        NumberOf1 number = new NumberOf1();
        System.out.println(number.numberOf1(-1));
    }


}
