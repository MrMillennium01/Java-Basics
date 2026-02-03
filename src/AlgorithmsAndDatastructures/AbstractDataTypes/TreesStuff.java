package AlgorithmsAndDatastructures.AbstractDataTypes;

import java.util.ArrayList;

/**
 * hierarchical structure with parent-child-relation
 * (e.g. binary tree)
 * iterating over trees:
 *    - pre-order: parent node, left child node, right child node
 *    - in-order: left child node, parent node, right child node
 *    - post-order: left child node, right child node, parent node
 */
public class TreesStuff { // binary tree
    private binaryTreeNode masterParentNode;

    TreesStuff(binaryTreeNode firstEverNode){
        masterParentNode = firstEverNode;
    }


    binaryTreeNode findNode(int valueOfNode){
        return findNode(valueOfNode, masterParentNode);
    }

    private binaryTreeNode findNode(int valOfNode, binaryTreeNode currentNode){
        if (valOfNode == currentNode.identifier)
            return currentNode;

        if (valOfNode < currentNode.identifier){
            return findNode(valOfNode, currentNode.leftChild);
        } else {
            return findNode(valOfNode, currentNode.rightChild);
        }
    }

    void addNode(binaryTreeNode newNode, int valOfParentNode){
        binaryTreeNode parentNode = findNode(valOfParentNode);

        if (parentNode.leftChild == null) parentNode.leftChild = newNode;
        else if (parentNode.rightChild == null) parentNode.rightChild = newNode;
        else {
            System.err.println("The Parent Node already has 2 child nodes, the new node was not added to the tree");
            return;
        }
    }

    public ArrayList<Object> outputTreeInPreeOrder(){
        ArrayList<Object> output = outputInPreOrder(this.masterParentNode);
        return output;
    }

    /**
     * OUTPUTS THE PAYLOADS
     * a recursive method to go through a sub-tree, it will be called using another method
     * @param parentNode the root-node of a subtree
     * @return an ArrayList of the payloads
     */
    private static ArrayList<Object> outputInPreOrder(binaryTreeNode parentNode){
        ArrayList<Object> output = new ArrayList<>();
        output.add(parentNode.payload);
        if (parentNode.leftChild != null) output.addAll(outputInPreOrder(parentNode.leftChild));
        if (parentNode.leftChild != null) output.addAll(outputInPreOrder(parentNode.rightChild));
        return output;
    }
}

class binaryTreeNode {
    binaryTreeNode leftChild;
    binaryTreeNode rightChild;
    int identifier;
    Object payload;

    binaryTreeNode(int identifier, Object payload){
        this.identifier = identifier;
        this.payload = payload;
        this.leftChild = null;
        this.rightChild = null;
    }
}


class Main {
    public static void main(String[] args){
        TreesStuff genericTree = new TreesStuff(new binaryTreeNode(10, "Root"));
        genericTree.addNode(new binaryTreeNode(9, "Left Child"), 10);
        genericTree.addNode(new binaryTreeNode(8, true), 10);
        genericTree.addNode(new binaryTreeNode(7, "Additional Child"), 10);
        genericTree.addNode(new binaryTreeNode(6, "Left Child->left child"), 9);
        genericTree.addNode(new binaryTreeNode(5, 0.5663), 9);
        /*
        as you can see, I can dump in elements from different types and the tree doesn't care
        => better: use Generics and define a type (see Generics.java)
        */

        System.out.println(genericTree.outputTreeInPreeOrder());
    }
}
