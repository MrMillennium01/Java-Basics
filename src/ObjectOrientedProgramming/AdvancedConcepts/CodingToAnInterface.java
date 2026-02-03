package ObjectOrientedProgramming.AdvancedConcepts;

/**
 * For interfaces and abstract classes:
 * Implementing an interface:
 *      an interface describes the "what" of a class
 *      by implementing, we answer the "how"
 * Coding to an interface:
 *      we call the interface: we only care about "what can it do?"
 *      we don't care about "how does it work?"
 *      example: API
 *  -> the coding to an interface is the cornerstone of good coding
 *
 * So what is the conclusion here?
 *      We have to write code, where we can change interfaces and services, classes, etc
 *      very quickly, without changing so much of the code:
 *      The code, which is executed (so typically the main() stuff), is NOT SPECIFIC to
 *      the modules, classes, objects, etc => changing the classes, methods, etc requires
 *      only changing the calling, not the whole code: new Alpha() => new Beta()
 */
public class CodingToAnInterface {

}
