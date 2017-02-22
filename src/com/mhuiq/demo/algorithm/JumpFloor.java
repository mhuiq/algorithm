package com.mhuiq.demo.algorithm;

/**
 * Created by 80374361 on 2017/2/20.
 */
public class JumpFloor {

    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
     * 思路：类裴波纳契数列，f(n) = f(n-1) + f(n-2)
     */
    public int jumpFloor(int target) {
        if (target < 1) {
            return 0;
        }
        if (target < 3) {
            return target;
        }
        int pre_pre = 1;
        int pre = 2;
        int cur = 0;
        for (int i = 3; i <= target; i++) {
            cur = pre_pre + pre;
            pre_pre = pre;
            pre = cur;
        }
        return cur;
    }

    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
     * 思路：f(n) = 2 * f(n-1)  n > 1
     */
    public int jumpFloorII(int target) {
        if (target < 1) {
            return 0;
        }
        if (target == 1) {
            return target;
        }
        int pre = 1;
        while (target-- > 1) {
            pre = 2 * pre;
        }
        return pre;
    }

    public static void main(String[] args) {
        JumpFloor jf = new JumpFloor();
        System.out.println(jf.jumpFloorII(4));
    }
}
