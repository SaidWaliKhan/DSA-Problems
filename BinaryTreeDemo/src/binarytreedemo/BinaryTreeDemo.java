///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
// */
package binarytreedemo;
public class BinaryTreeDemo {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insertRoot(6);
        bt.insertLeft(6, 4);
        bt.insertRight(6, 8);

        // Perform pre-order traversal and print the result
        System.out.println("Preorder Traversal:");
        bt.inOrder(bt.root);  // Pass the root node to the preOrder method
    }
}

