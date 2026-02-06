package AdvancedConcepts.FailureHandling;

/**
 * you can customize your exception by writing a class, which extends Exception
 * at the end, it will look like an error message by your terminal
 * Java in general has multiple "terminal logs": relevant to us is:
 *    - System.out
 *    - System.err
 * Both print terminal stuff, but both are separate, meaning there will be no specific
 * order in how the messages on sout and serr will be displayed in terminal
 */
public class ExceptionExample extends Exception{
    public ExceptionExample(String msg){
        System.out.println("[ExceptionExample] Do some fun stuff");
        System.err.println("[ExceptionExample] Some other stuff");
        super(msg); // this also uses System.err, wo it will appear red
    }
}
