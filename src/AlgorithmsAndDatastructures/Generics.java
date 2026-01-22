import java.util.ArrayList;
import java.util.Objects;

/**
 * hierarchical structure with parent-child-relation BUT THIS TIME WITH GENERICS IT
 *      ACCEPTS ONLY ONE DEFINED TYPE (e.g Strings/Integers)
 * Note: only works with sorted trees, so when adding, ensure that it will be sorted, when finding
 * (e.g. binary tree)
 * iterating over trees:
 *    - pre-order: parent node, left child node, right child node
 *    - in-order: left child node, parent node, right child node
 *    - post-order: left child node, right child node, parent node
 * Topics:
 *    - generics
 *    - lower bounds
 *    - wildcards
 *    - upper bound wildcards (<? extends Number> => child classes of Number)
 *    - lower bound wildcards (<? super Integer> => at least Number, but also Double, Long, Object, etc.)
 */
public class Generics<T, U extends Number & Comparable<U>> { // binary tree
    private binaryTreeNode<T, U> masterParentNode;
    /*
    btw class variables from type T are not possible, since class variables are shared by all objects/instances
    of the class, so you could have different types for one class variables which is not good, e.g.:
    static T thisClassVariableIsNotAllowed;
     */

    Generics(binaryTreeNode<T, U> firstEverNode){
        masterParentNode = firstEverNode;
    }


    binaryTreeNode<T, U> findNode(U valueOfNode){
        return findNode(valueOfNode, masterParentNode);
    }

    /**
     * since java is annoying and does not allow Number "<" Number comparison, we use the compareTo function
     * from the Comparison Interface and this returns -1 for x.compareTo(y) x < y and 1 for x > y
     */
    private binaryTreeNode<T, U> findNode(U valOfNode, binaryTreeNode<T, U> currentNode){
        if (valOfNode.equals(currentNode.identifier))
            return currentNode;

        if (valOfNode.compareTo(currentNode.identifier) < 0){
            return findNode(valOfNode, currentNode.leftChild);
        } else {
            return findNode(valOfNode, currentNode.rightChild);
        }
    }

    void addNode(binaryTreeNode<T, U> newNode, U valOfParentNode){
        binaryTreeNode<T, U> parentNode = findNode(valOfParentNode);

        if (parentNode.leftChild == null) parentNode.leftChild = newNode;
        else if (parentNode.rightChild == null) parentNode.rightChild = newNode;
        else {
            System.err.println("The Parent Node already has 2 child nodes," +
                    " the new node " + newNode + " was not added to the tree");
            return;
        }
    }

    public ArrayList<T> outputTreeInPreeOrder(){
        ArrayList<T> output = outputInPreOrder(this.masterParentNode);
        return output;
    }

    /**
     * OUTPUTS THE PAYLOADS
     * a recursive method to go through a sub-tree, it will be called using another method
     * @param parentNode the root-node of a subtree
     * @return a ArrayList of the Type T
     */
    private ArrayList<T> outputInPreOrder(binaryTreeNode<T, U> parentNode){
        ArrayList<T> output = new ArrayList<>();
        output.add(parentNode.payload);
        if (parentNode.leftChild != null) output.addAll(outputInPreOrder(parentNode.leftChild));
        if (parentNode.rightChild != null) output.addAll(outputInPreOrder(parentNode.rightChild));
        return output;
    }
}

/**
 * @param <T> some generic type, e.g. Integer, String, Boolean, etc.
 * @param <U> some generic Type, but has to be child class of Number, so Integer, Double, Long, etc
 *           of course, this is just a demonstrative example with no real use, since we could have just
 *           defined U as double, which would literally make ZERO difference, but as if I care
 */
class binaryTreeNode<T, U extends Number & Comparable<U>> {
    binaryTreeNode<T, U> leftChild;
    binaryTreeNode<T, U> rightChild;
    U identifier;
    T payload;

    /**
     * @param identifier the value, by which the node can be found or sorted
     * @param payload the content of a node, could be anything, if it suits the defined type
     */
    binaryTreeNode(U identifier, T payload){
        this.identifier = identifier;
        this.payload = payload;
        this.leftChild = null;
        this.rightChild = null;
    }

    /**
     * example method for upper bound wildcards
     */
    static ArrayList<? extends Number> sum(ArrayList<? extends Number> l){
        double sum = 0;
        for (Number e : l) sum += e.doubleValue();
        return l;
    }

    /**
     * example method for lower bound wildcards
     */
    static ArrayList<? super Integer> addToUList(ArrayList<? super Integer> l){
        l.add(3564);
        return l;
    }

    @Override
    public String toString() {
        return "binaryTreeNode{" +
                ",identifier=" + identifier +
                ",payload=" + payload +
                '}';
    }
}

class Main {
    public static void main(String[] args){
        Generics<String, Integer> genericTree = new Generics<>(new binaryTreeNode<>(10, "Root"));
        genericTree.addNode(new binaryTreeNode<>(9, "Left Child"), 10);
        genericTree.addNode(new binaryTreeNode<>(8, "Right Child"), 10);
        genericTree.addNode(new binaryTreeNode<>(7, "Additional Child"), 10);
        genericTree.addNode(new binaryTreeNode<>(6, "Left Child->left child"), 9);
        genericTree.addNode(new binaryTreeNode<>(5, "Left Child->right child"), 9);

        // wildcards:
        Generics<?, ?> questionMarkTree = new Generics<>(new binaryTreeNode<>(10, "lol"));

        System.out.println(genericTree.outputTreeInPreeOrder());
    }
}
