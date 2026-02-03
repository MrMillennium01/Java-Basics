package AdvancedConcepts.NetworkCommunication;

/**
 * this is crazy, since it implements all advanced concepts:
 *    - concurrency
 *    - try-catch
 *    - iostreams
 *    - networks
 * It runs the two Classes ClientSide and ServerSide in parallel via Threads
 * See these two classes for more info
 */
public class MainExample {
    public static void main(String[] args) {
        Thread server = new Thread(new ServerSide());
        server.start();

        Thread client = new Thread(new ClientSide());
        client.start();
    }
}
