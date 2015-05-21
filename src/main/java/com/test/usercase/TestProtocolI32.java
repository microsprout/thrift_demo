package com.test.usercase;

public class TestProtocolI32 {
	public static void main(String[] args) {
		byte[] bs = new byte[4];
		int a = 510;
		bs[0] = (byte)(0xFF & (a >> 24));
		bs[1] = (byte)(0xFF & (a >> 16));
		bs[2] = (byte)(0xFF & (a >> 8));
		bs[3] = (byte)(0xFF & a);
		for (byte b : bs) {
			System.out.print(Byte.toUnsignedInt(b));
			System.out.print(" ");
			System.out.printf("0x%02X", b);
			System.out.println();
		}
	}
}
