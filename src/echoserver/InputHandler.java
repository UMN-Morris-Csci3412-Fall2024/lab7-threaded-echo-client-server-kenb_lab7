package echoserver;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class InputHandler implements Runnable {
  private final OutputStream output;
  private final Socket socket;

  // Constructor
  public InputHandler(OutputStream output, Socket socket) {
    this.output = output;
    this.socket = socket;
  }

  @Override
  public void run() {

    // Try to read from the input stream and write to the output stream
    try {
      int data;
      while ((data = System.in.read()) != -1) {
        output.write(data);
        output.flush();
      }
      socket.shutdownOutput();
    } catch (IOException e) {
      System.out.println("We caught an unexpected exception");
      System.err.println(e);
    }
  }
}
