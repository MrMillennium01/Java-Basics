package AdvancedConcepts.NetworkCommunication;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * one server(socket), multiple sockets, connecting it to the stream of clients
 */
public class SimpleServer {

    public static void main(String[] args) {
        try (
                ServerSocket serverSocket = new ServerSocket(9090);
        ) {
            while (true) {
                Socket s = serverSocket.accept();
                new RequestHandler(s).start();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class RequestHandler extends Thread {
    Socket s;
    public RequestHandler (Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try (
                InputStream inputStream = s.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                if ("end".equals(line)) break;
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try { s.close(); } catch (Exception ignored) {}
        }
    }
}
