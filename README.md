# Java-Basics

## What is this project?

This is a comprehensive Java learning resource designed to help developers understand core Java concepts through practical, executable examples. The project covers everything from imperative programming fundamentals to advanced concepts like concurrency and network communication. Each topic includes well-documented code examples with inline comments explaining key concepts.

## Project Structure

The project is organized into four main categories within the `src` folder:

**ImperativeProgramming** - Foundational programming concepts including arrays, loops, methods, recursion, and basic object-oriented programming introduction.

**ObjectOrientedProgramming** - Core OOP principles covering classes, objects, inheritance, interfaces, abstract classes, enums, inner classes, anonymous classes, wrapper classes, and the String class. Includes both basic concepts (constructors, getters/setters, JVM behavior) and advanced topics (coding to interfaces, access modifiers).

**AlgorithmsAndDatastructures** - Common data structures and algorithms including arrays, linked lists, generics, abstract data types (lists, maps, sets, queues, stacks, trees, graphs), sorting algorithms, and search algorithms.

**AdvancedConcepts** - Advanced Java topics including:
- Concurrency (threads, runnables, callables, locking, deadlocks, interruption, wait/notify)
- Exception handling and failure management
- I/O streams and autocloseable resources
- Network communication (sockets, client-server architecture)
- Introduction to Kotlin

## How to Use This Project

### Reading the Code

1. **Browse the categories** - Navigate to the `src` folder and explore the different packages based on what you want to learn.

2. **Read the JavaDocs** - Each file contains detailed JavaDoc comments explaining what the code does, including method descriptions, parameters, and important concepts. These comments provide context and learning notes.

3. **Study the inline comments** - The code includes extensive inline comments that explain the "why" behind certain approaches, common pitfalls, and best practices.

### Running the Code

1. **Find files with main methods** - Most example files contain a `main` method that you can run directly. Look for files named `Main.java` or classes with a `public static void main(String[] args)` method.

2. **Run individual examples** - You can run any file with a main method using:
   ```bash
   javac path/to/File.java
   java path.to.File
   ```
   Or use your IDE's run functionality.

3. **Observe the output** - Pay attention to what gets printed to the console. The output demonstrates the concepts in action.

### Experimenting and Learning

1. **Modify parameters** - Change values in the main methods to see how different inputs affect the output. For example:
   - Modify array sizes and values
   - Change thread sleep times in concurrency examples
   - Adjust parameters passed to methods

2. **Add your own examples** - Extend the existing code with your own test cases to deepen understanding.

3. **Break things intentionally** - Try removing certain pieces of code or using incorrect values to see what errors occur. This helps you understand error messages and debugging.

4. **Compare implementations** - Many topics show different ways to accomplish the same task. Compare and contrast these approaches.

### Getting Started

If you're new to Java, start with:
1. `ImperativeProgramming/ArraysAndLoops.java` - Learn basic syntax
2. `ImperativeProgramming/ClassMethods.java` - Understand methods
3. `ObjectOrientedProgramming/BasicConcepts/ConstructorExample.java` - Grasp OOP fundamentals
4. Then progress to more advanced topics as you build confidence

Feel free to clone this repository and experiment with the code yourself!
