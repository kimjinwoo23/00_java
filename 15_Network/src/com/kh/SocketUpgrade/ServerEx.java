package com.kh.SocketUpgrade;

import java.net.*;
import java.nio.charset.StandardCharsets;
import java.io.*;

public class ServerEx {

	private static final int SERVER_PORT = 12145;
	private static final int SERVER_SPACE = 50;
	private static final Socket[] clientSockets = new Socket[SERVER_SPACE];
	private static ServerSocket serverSocket;

	public static void main(String[] args) throws Exception {

		serverSocket = new ServerSocket(SERVER_PORT);
		System.out.println("TCP Server started.");

		Thread serverAcceptThread = new Thread(() -> {
			int i = 0;
			while (true) {
				try {
					System.out.println("Waiting for clients...");
					clientSockets[i] = serverSocket.accept();
					System.out.println("Client connected: " + clientSockets[i].getInetAddress().getHostAddress());

					if (clientSockets[i] != null && clientSockets[i].isConnected()) {
						ClientToServerThread clientHandler = new ClientToServerThread(i);
						clientHandler.start();
					}

					i = (i + 1) % clientSockets.length;
				} catch (IOException e) {
					serverSocket = null;
					break;
				}
			}

		});
		serverAcceptThread.start();

		ServerToClientThread serverToClientThread = new ServerToClientThread();
		serverToClientThread.start();
	}

	static class ServerToClientThread extends Thread {
		@Override
		public void run() {
			super.run();
			try {
				while (true) {
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
					String input = br.readLine();
					if (input.equals("finish")) {
						System.out.println("Server off... Goodbye!");
						for (Socket socket : clientSockets) {
							if (socket != null) {
								socket.close();
							}
						}
						serverSocket.close();
						break;
					}
					for (Socket clientSocket : clientSockets) {
						if (clientSocket != null && clientSocket.isConnected()) {
							OutputStream out = clientSocket.getOutputStream();
							PrintWriter writer = new PrintWriter(new OutputStreamWriter(out, StandardCharsets.UTF_8),
									true);
							writer.println(input);
						}
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	static class ClientToServerThread extends Thread {
		private final int index;
		private final InputStream in;
		private final BufferedReader reader;

		ClientToServerThread(int index) throws IOException {
			this.index = index;
			this.in = clientSockets[index].getInputStream();
			this.reader = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
		}

		@Override
		public void run() {
			super.run();
			while (true) {
				try {
					String message = reader.readLine();
					System.out.println("Message from client: " + message);
				} catch (IOException e) {
					System.out.printf("Client[%d] disconnected.\n", index);
					clientSockets[index] = null;
					break;
				}
			}
		}
	}
}