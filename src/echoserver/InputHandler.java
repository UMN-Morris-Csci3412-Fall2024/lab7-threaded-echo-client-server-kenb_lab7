package echoserver;

import java.io.IOException;
import java.io.OutputStream;

public class InputHandler implements Runnable {
  private final OutputStream output;

  public InputHandler(OutputStream output) {
    this.output = output;
  }

  @Override
  public void run() {
    try {
      int byteRead;
      while ((byteRead = System.in.read()) != -1) {
        output.write(byteRead);
        output.flush();
      }
      output.close();
    } catch (IOException ioe) {
      System.out.println("We caught an unexpected exception");
      System.err.println(ioe);
    }
  }
    
}
