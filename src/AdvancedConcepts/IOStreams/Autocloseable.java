package AdvancedConcepts.IOStreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * streams are very verbose depending, what source and target the streams should go into
 * also, streams have to be closed, but some streams can't close just as it is
 * so streams are really annoying
 * => there is an interface AutoClosable for stuff, e.g. streams
 */
public class Autocloseable {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new FileReader("src/AdvancedConcepts/IOStreams/example.txt"))){
            // do something
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
