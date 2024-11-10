package echoserver;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientHandler implements Runnable {
    private final Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream socketInputStream = socket.getInputStream();
            OutputStream socketOutputStream = socket.getOutputStream();

            Thread inputThread = new Thread(new InputHandler(socketOutputStream, socket));
            Thread outputThread = new Thread(new OutputHandler(socketInputStream));

            inputThread.start();
            outputThread.start();

            inputThread.join();
            outputThread.join();

        } catch (IOException | InterruptedException e) {
            System.err.println("Caught exception: " + e.getMessage());
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                System.err.println("Caught exception: " + e.getMessage());
            }
        }
    }
}
