package AdvancedConcepts.NetworkCommunication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * there are multiple layers in network communication:
 *      the 2 highest layers can be accessed by Java: HTTP (higher) and UDP/TCP (lower)
 * addressing based on URL: host:port/path
 *    - host: IP-address or part if URL-address (e.g. google.com / perplexity.ai)
 *      to IP-address via DNS-server -> DNS server knows everything
 *    - port: some integer which can be omitted if it's the default number of a
 *      particular protocol (e.g. 80 for HTTP, 443 for HTTPS)
 *    - path: additional information: (/path-to-a-website/index/some-website)
 * servers can be 2 things:
 *    - software
 *    - hardware
 * Sockets: a class which accesses a server for us (we are clients)
 * Serversockets: a class that hosts a server for outside clients (we are hosts)
 *    => servers are always multithreaded (concurrent)
 * But mostly, we don't use the low-level stuff, but more high-level stuff
 *   for example APIs etc.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // starting a server on local
        ServerSocket server = new ServerSocket(8080);
        // connecting to local stuff: localhost = 127.0.0.1
        Socket s1 = new Socket("localhost", 8080);

        try {
            // connecting to network, here for getting time
            Socket s2 = new Socket("time.nist.gov", 13);

            // get input from socket
            InputStream in = s2.getInputStream();

            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String line = "";

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            s2.close();
        } catch (IOException a){}
    }
}
