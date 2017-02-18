package com.mhuiq.demo.algorithm;

public class Fibonacci {
	
	public int fibonacci(int n) {
		if (n < 1) {
            return 0;
        }
		if (n < 3) {
			return 1;
		}
		int cur =1, pre = 1;
		for (int i=3; i<=n; ++i) {
			int tmp = cur;
			cur += pre;
			pre = tmp;
		}
		return cur;
    }
	
}
