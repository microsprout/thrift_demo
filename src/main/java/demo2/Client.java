package demo2;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

/**
 * Created by bigbean on 15/8/18.
 */
public class Client {

    static final String HOST = "localhost";
    static final int PORT = 9000;

    public static void main(String[] args) throws TException {

        TSocket socket = new TSocket(HOST, PORT);
        TTransport transport = socket;
        TProtocol protocol = new TBinaryProtocol(transport);
        Robot.Client client = new Robot.Client(protocol);

        transport.open();

        System.out.println(client.sayHi("hello world"));
        System.out.println(client.negative(30));
        System.out.println(client.woAreYou(new Person()));
    }
}
