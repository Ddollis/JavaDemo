package tcpip;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器启动成功！");
        ServerSocket socket = new ServerSocket(2222);
        Socket accpet = socket.accept();
//        InputStream inputStream = accpet.getInputStream();
        String hostAddress = accpet.getInetAddress().getHostAddress();
        System.out.println(hostAddress);
    }
}
