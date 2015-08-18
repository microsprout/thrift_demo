package demo2;

import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

/**
 * Created by bigbean on 15/8/18.
 */
public class Server {

    static final int PORT = 9000;

    public static void main(String[] args) throws TTransportException {
        TServerSocket socket = new TServerSocket(PORT);
        TServerTransport transport = socket;
        RobotService service = new RobotService();
        Robot.Processor processor = new Robot.Processor<>(service);
        TServer server = new TSimpleServer(
                new TServer.Args(transport).processor(processor));
        System.out.println("server is starting...");
        server.serve();
    }
}
