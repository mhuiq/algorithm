package com.mhuiq.demo.algorithm;

public class ReplaceSapce {
	public String replaceSpace(StringBuffer str) {
		if (str == null) {
			return null;
		}
		int strLength = str.length();
		if (strLength == 0) {
			return "";
		}
		StringBuilder sb = new StringBuilder(strLength);
		for (int i=0; i<strLength; ++i) {
			if (str.charAt(i) == ' ') {
				sb.append('%').append('2').append('0');
				continue;
			}
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
}
