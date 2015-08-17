package com.test.demo_1;

import org.apache.thrift.TException;

import demo_1.Negative;

public class NegativeService implements Negative.Iface{

	@Override
	public int neg(int num) throws TException {
		int neg = - num;
		return neg;
	}

}
