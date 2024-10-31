package echoserver;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class EchoClient {
	public static final int PORT_NUMBER = 6013;

	public static void main(String[] args) throws IOException {
		EchoClient client = new EchoClient();
		client.start();
	}

	private void start() throws IOException {
		Socket socket = new Socket("localhost", PORT_NUMBER);
		InputStream socketInputStream = socket.getInputStream();
		OutputStream socketOutputStream = socket.getOutputStream();

		try {

			int byteRead;

			while ((byteRead = System.in.read()) != -1) {
				socketOutputStream.write(byteRead);
				socketOutputStream.flush();
				System.out.write(socketInputStream.read());
				System.out.flush();
			}

			socket.shutdownOutput();

		} catch (IOException ioe) {
			System.out.println("We caught an unexpected exception");
			System.err.println(ioe);
		} finally {
			socket.close();
		}
	}
}