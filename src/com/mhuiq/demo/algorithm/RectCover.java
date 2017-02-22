package com.mhuiq.demo.algorithm;

/**
 * Created by 80374361 on 2017/2/22.
 */
public class RectCover {

    /**
     * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
     * 思路：若最后一个矩形为竖着的，则由 f(n-1)种方法，若为横着的，则由f(n-2)种方法，公式可以抽象为：f(n) = f(n-1) + f(n-2)
     */
    public int rectCover(int target) {
        if (target < 1) {
            return 0;
        }
        if (target < 3) {
            return target;
        }
        int[] array = new int[target + 1];
        array[1] = 1;
        array[2] = 2;
        for (int i = 3; i <= target; i++) {
            array[i] = array[i-1] + array[i-2];
        }
        return array[target];
    }

    public static void main(String[] args) {
        RectCover rc = new RectCover();
        System.out.println(rc.rectCover(4));
    }
}
