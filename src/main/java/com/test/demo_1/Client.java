package com.test.demo_1;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import demo_1.Negative;

public class Client {
	public static void main(String[] args) throws TException {

		TTransport transport = new TSocket("localhost", 9090);
		transport.open();

		TProtocol protocol = new TBinaryProtocol(transport);
		Negative.Client client = new Negative.Client(protocol);

		int neg = client.neg(88);
		System.out.println(neg);

		transport.close();
	}
}
