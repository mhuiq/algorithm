package com.mhuiq.demo.algorithm;

/**
 * Created by 80374361 on 2017/2/22.
 */
public class MathUtil {

    /**
     * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
     */
    public double Power(double base, int exponent) {
        if (base == 0 && exponent < 0) {
            throw new RuntimeException();
        }
        if (exponent == 0) {
            return 1;
        }
        boolean isNag = false;
        if (exponent < 0) {
            isNag = true;
            exponent = 0 - exponent;
        }
        double result = 1;
        while (exponent-- > 0) {
            result = base * result;
        }
        return isNag ? 1d / result : result;
    }

    public static void main(String[] args) {
        MathUtil mu = new MathUtil();
        System.out.println(mu.Power(0.1, 2));
    }
}
