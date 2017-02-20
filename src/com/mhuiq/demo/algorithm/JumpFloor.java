package com.mhuiq.demo.algorithm;

/**
 * Created by 80374361 on 2017/2/20.
 */
public class JumpFloor {

    public int jumpFloor(int target) {
        if (target < 1) {
            return 0;
        }
        int count = 0;
        int tmp = 1;
        while (2 * tmp <= target) {
            count += (target - 2 * tmp + 1) * tmp;
            ++tmp;
        }
        return count + 1;
    }

    public static void main(String[] args) {
        JumpFloor jf = new JumpFloor();
        System.out.println(jf.jumpFloor(2));
    }
}
