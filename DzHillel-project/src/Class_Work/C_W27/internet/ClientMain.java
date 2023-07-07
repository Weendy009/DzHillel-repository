package Class_Work.C_W27.internet;


import java.io.IOException;
import java.net.Socket;

public class ClientMain {
    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket("localhost", 8080)) {

        }
    }
}
