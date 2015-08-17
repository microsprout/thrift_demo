package com.test.demo_1;

import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TServer.Args;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TTransportException;

import demo_1.Negative;

public class Server {
	public static void main(String[] args) throws TTransportException {

		NegativeService service = new NegativeService();
		Negative.Processor<NegativeService> processor = 
				new Negative.Processor<NegativeService>(service);

		TServerTransport serverTransport = new TServerSocket(9090);
		TServer server = new TSimpleServer(
				new Args(serverTransport).processor(processor));

		System.out.println("Starting the simple server...");
		server.serve();
	}
}
