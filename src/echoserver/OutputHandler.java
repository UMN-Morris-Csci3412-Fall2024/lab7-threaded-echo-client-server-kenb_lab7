package echoserver;

import java.io.IOException;
import java.io.InputStream;

public class OutputHandler implements Runnable {
  private final InputStream input;

  public OutputHandler(InputStream input) {
    this.input = input;
  }

  @Override
  public void run() {
    try {
      int byteRead;
      while ((byteRead = input.read()) != -1) {
        System.out.write(byteRead);
        System.out.flush();
      }
      input.close();
    } catch (IOException ioe) {
      System.out.println("We caught an unexpected exception");
      System.err.println(ioe);
    }
  }
    
}
