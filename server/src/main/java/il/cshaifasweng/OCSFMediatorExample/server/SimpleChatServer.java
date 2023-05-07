package il.cshaifasweng.OCSFMediatorExample.server;

import java.io.IOException;
import java.net.InetAddress;


public class SimpleChatServer
{
	
	private static SimpleServer server;
    public static void main( String[] args ) throws IOException
    {
        server = new SimpleServer(3000);
        System.out.println("server is listening");
        InetAddress localhost = InetAddress.getLocalHost();
        String hostname = localhost.getHostName();
        System.out.println("Hostname of the local machine is: " + hostname);
        server.listen();

    }
}
