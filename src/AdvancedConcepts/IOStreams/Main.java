package AdvancedConcepts.IOStreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * now, we can have inputs and outputs, not just on keyboard, but on other stuff
 * Streams are 2 types:
 *    - 8-bit blocks (Byte streams)
 *    - 16-bit blocks (Character streams)
 * streams: there are two streams-stuff, one for functional programming (not our focus)
 *          and streams for interaction with outside world
 * There are just 4 abstract base classes for streams:
 *    Input: InputStream (Byte stream), Reader (Character stream)
 *    Output: OutputStream (Byte stream), Writer (Character stream)
 * You open a stream by calling its constructor (of the stream-subclass) - you need to close
 *    if again with close()
 * There are also Buffer-streams, which are better in some ways: BufferedReader is
 *    more efficient and also gives whole lines, instead of characters etc.
 */
public class Main {
    /**
     * this ist just a small example, how to read from a txt-file (using buffer streams)
     */
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new FileReader("src/AdvancedConcepts/IOStreams/example.txt"));
        // the file direction hast to be absolute or at least relative to the Project root
        String line;
        while((line = b.readLine()) != null) System.out.println(line);
        b.close();
    }
}
