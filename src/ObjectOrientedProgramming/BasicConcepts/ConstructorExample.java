package BasicConcepts;

import java.util.Arrays;

public class ConstructorExample {
    public static void main(String[] args){
        ShoppingList wocheneinkauf = new ShoppingList(6, 1);
        System.out.println(Arrays.toString(wocheneinkauf.getShoppingList()));
        System.out.println("Buy at " + wocheneinkauf.getSupermarket());

        ShoppingList tageseinkauf = new ShoppingList(10, 4, 7);
        System.out.println(Arrays.toString(tageseinkauf.getShoppingList()));

        ShoppingList monatseinkauf = new ShoppingList(1, 2, 3, 4);
        System.out.println(Arrays.toString(monatseinkauf.getShoppingList()));
    }
}

class ShoppingList{
    // instance variables
    private int numberOfMilk;
    private int numberOfBreadRolls;
    private int numberOfCheese;
    private int numberOfHam;

    // class variables
    private static int usualNumberOfMilk = 6;
    private static final String SUPERMARKET = "Lidl"; // also private final stuffs are possible

    // constructor
    public ShoppingList(int numberOfMilk, int numberOfBreadRolls, int numberOfCheese){
        this.numberOfMilk = numberOfMilk;
        this.numberOfBreadRolls = numberOfBreadRolls;
        this.numberOfCheese = numberOfCheese;
    }

    // constructor - method overloading
    public ShoppingList(int numberOfBreadRolls, int numberOfCheese){
        this.numberOfMilk = usualNumberOfMilk; // assigned to class variable
        this.numberOfBreadRolls = numberOfBreadRolls;
        this.numberOfCheese = numberOfCheese;
    }

    public ShoppingList(int numberOfMilk, int numberOfBreadRolls, int numberOfCheese, int numberOfHam){
        this(numberOfMilk, numberOfBreadRolls, numberOfCheese); // calls the first sonstructor
        this.numberOfHam = numberOfHam;
    }

    // instance getter
    public int[] getShoppingList(){
        return new int[]{this.numberOfMilk, this.numberOfBreadRolls, this.numberOfCheese, this.numberOfHam};
    }

    // supermarket getter
    public String getSupermarket(){
        // either like this (without static), but then only referenceable from Object
        return SUPERMARKET;
    }

    public void increaseUsualNumberOfMilk(int increase){
        usualNumberOfMilk += increase;
    }

    /* OR: supermarket getter: static, so referenceable from Class
    public final String getSupermarket(){
        return SUPERMARKET;
    }
     */
}
