package AdvancedConcepts.NetworkCommunication;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * this example is the client-side of a TCP/IP connection, so here, it sends stuff
 * to a local Server (see: ServerSide)
 */
public class ClientSide implements Runnable {
    public void run() {
        try (Socket client = new Socket("localhost", 8080);)
        {
            OutputStream clientRequest = client.getOutputStream();
            BufferedWriter clientRequestWriter = new BufferedWriter(new OutputStreamWriter(clientRequest));

            InputStream serverResponse = client.getInputStream();
            BufferedReader serverResponseReader = new BufferedReader(new InputStreamReader(serverResponse));

            Scanner terminalScanner = new Scanner(System.in);
            System.out.println("[CLIENT] Please write your request. To stop, just enter: ");
            String request = terminalScanner.nextLine();

            while (request != null) {
                System.out.println("[CLIENT] Please write your request. To stop, just enter: ");
                request = terminalScanner.nextLine();

                clientRequestWriter.write(request);
                clientRequestWriter.newLine();
                clientRequestWriter.flush();
                System.out.println("[CLIENT] Request <" + request + "> sent");

                String response = serverResponseReader.readLine();
                System.out.println("[CLIENT] Server response is: " + response);
            }
            terminalScanner.close();

        } catch (IOException e){}
    }
}
