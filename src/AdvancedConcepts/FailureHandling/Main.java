package AdvancedConcepts.FailureHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * try-catch
 */
public class Main {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will trigger an ArithmeticException
            System.out.println("This will not be printed");
        } catch (ArithmeticException e) {
            System.err.println("Error: Cannot divide by zero! " + e.getMessage());
        }

        System.out.println("The program continues to run...");

        /*
         you can add conditions to try-catch: its called try-with-resources
         it closes the resources (sockets, streams, files etc.) after the block, even though
         when an exception occurs
         */
        try (BufferedReader in = new BufferedReader(new FileReader("non-existent-file.txt"))){
            String line = "";
            while ((line = in.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("File not found");
        }

        // above is the same as here (in this example, this does not close the file afterwards):
        try {
            BufferedReader in = new BufferedReader(new FileReader("non-existent-file.txt"));
            String line = "";
            while ((line = in.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("FIle not found");
        }
    }
}

