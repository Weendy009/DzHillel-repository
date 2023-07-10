package Class_Work.C_W27.internet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            Socket socket = serverSocket.accept();

            DataInputStream dis = new DataInputStream(socket.getInputStream()); // read from client
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream()); // write to client

            while (true) {
                String clientMassage = dis.readUTF();

                System.out.println("From client: " + clientMassage);

                dos.writeUTF("Server: " + clientMassage);
                dos.flush();
            }

        }
    }
}
