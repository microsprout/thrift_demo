package com.test.usercase;

public class TestIntegerToHex {
	public static void main(String[] args) {
//		int i = -2147418111;
		int i = -2147418112;
		String hex = Integer.toHexString(i);
		System.out.println(hex);
	}
}
