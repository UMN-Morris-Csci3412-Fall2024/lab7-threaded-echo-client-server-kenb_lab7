package echoserver;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class EchoClient {
    public static final int PORT_NUMBER = 6013;

    public static void main(String[] args) throws IOException, InterruptedException {
        EchoClient client = new EchoClient();
        client.start();
    }

    private void start() throws IOException, InterruptedException {

		// Connect to the server
        Socket socket = new Socket("localhost", PORT_NUMBER);
		
		// Get the input and output streams
        InputStream socketInputStream = socket.getInputStream();
        OutputStream socketOutputStream = socket.getOutputStream();

		// Create the threads
        Thread inputThread = new Thread(new InputHandler(socketOutputStream, socket));
        Thread outputThread = new Thread(new OutputHandler(socketInputStream));

		// Start the threads
        inputThread.start();
        outputThread.start();

		// Try to join the threads
		// If the threads are interrupted, catch the exception and print an error message
		// Finally, close the socket
        try {
            inputThread.join();
            outputThread.join();
        } catch (InterruptedException e) {
            System.err.println("Thread interrupted: " + e.getMessage());
        } finally {
            socket.close();
        }
    }
}