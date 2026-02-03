package AdvancedConcepts.Concurrency.Locking;

/**
 * Problem: If threads run concurrently (and have locked access to a data)
 * but need multiple tokens, but every thread waits for the other threads to
 * finish, then this is bad, because there is no way out
 * Example: 2 threads need 2 tokens each, and the database only has 2 tokens
 * to give => if both threads take each 1 token exclusively, then no token
 * is left, but each threads only has 1 token, so both are still waiting for
 * the other token, which will never happen
 * => Solutions:
 *    - use order between threads
 *    - use order between taking tokens, otherwise give back token and wait
 *    - use one dedicated locked object
 */
public class Deadlocks {
}
