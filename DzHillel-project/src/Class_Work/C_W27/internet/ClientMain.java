package Class_Work.C_W27.internet;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket("localhost", 8080)) {
            DataInputStream dis = new DataInputStream(socket.getInputStream()); // read from server
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream()); // write to server
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String text = scanner.nextLine();
                if ("-exit".equals(text)) {
                    break;
                }
                dos.writeUTF(text);
                dos.flush();

                String serverResponse = dis.readUTF();
                System.out.println("Server: " + serverResponse);
            }

        }
    }
}
