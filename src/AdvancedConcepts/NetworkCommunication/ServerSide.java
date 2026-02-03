package AdvancedConcepts.NetworkCommunication;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * This example is about hosting a server, where clients can access stuff
 *
 * Serversockets: a class that hosts a server for outside clients (we are hosts)
 *    => servers are always multithreaded (concurrent)
 */
public class ServerSide implements Runnable {
    public void run() {
        try (ServerSocket server = new ServerSocket(8080)) {
            Socket client = server.accept();
            System.out.println("New client connected.");

            InputStream clientRequest = client.getInputStream();
            BufferedReader clientRequestReader = new BufferedReader(new InputStreamReader(clientRequest));

            OutputStream serverResponse = client.getOutputStream();
            BufferedWriter serverResponseWriter = new BufferedWriter(new OutputStreamWriter(serverResponse));

            Scanner terminalScanner = new Scanner(System.in);
            while (true){
                String request = clientRequestReader.readLine();
                System.out.println("[SERVER] Client sent request: " + request);

                System.out.println("[SERVER] Please write your request. To stop, just enter: ");
                String response = terminalScanner.nextLine();

                if (response.equals("stop")) break;

                serverResponseWriter.write(response);
                serverResponseWriter.newLine();
                serverResponseWriter.flush();
                System.out.println("[SERVER] Response <" + response + "> sent");

            }
            terminalScanner.close();

        } catch (IOException e) {}
    }
}
