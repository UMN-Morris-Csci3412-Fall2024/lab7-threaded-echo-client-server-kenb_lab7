package echoserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EchoServer {
    public static final int PORT_NUMBER = 6013;
    private volatile boolean running = true;
    private final ExecutorService threadPool = Executors.newCachedThreadPool();

    public static void main(String[] args) throws IOException, InterruptedException {
        EchoServer server = new EchoServer();
        server.start();
    }

    private void start() throws IOException, InterruptedException {

		// Try to create a server socket
        try (ServerSocket serverSocket = new ServerSocket(PORT_NUMBER)) {
			// when a client connects, create a new socket
            while (running) {
                Socket socket = serverSocket.accept();
                threadPool.execute(new ClientHandler(socket));
            }

        } catch (IOException e) {
            System.err.println("Caught exception: " + e.getMessage());
        } finally {
            threadPool.shutdown();
        }
    }

    public void stop() {
        running = false;
    }
}
       