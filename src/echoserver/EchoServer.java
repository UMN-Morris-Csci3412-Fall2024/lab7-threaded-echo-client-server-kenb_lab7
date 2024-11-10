package echoserver;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static final int PORT_NUMBER = 6013;

    public static void main(String[] args) throws IOException, InterruptedException {
        EchoServer server = new EchoServer();
        server.start();
    }

    private void start() throws IOException, InterruptedException {

		// Try to create a server socket
        try (ServerSocket serverSocket = new ServerSocket(PORT_NUMBER)) {
			// when a client connects, create a new socket
            while (true) {
                Socket socket = serverSocket.accept();
                InputStream socketInputStream = socket.getInputStream();
                OutputStream socketOutputStream = socket.getOutputStream();

                // Create the threads
                Thread inputThread = new Thread(new InputHandler(socketOutputStream, socket));
                Thread outputThread = new Thread(new OutputHandler(socketInputStream));

                // Start the threads
                inputThread.start();
                outputThread.start();
            }
        } catch (IOException e) {
            System.err.println("Server exception: " + e.getMessage());
        }
    }
}