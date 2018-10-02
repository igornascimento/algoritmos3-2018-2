/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvorebinariadepesquisa;

/**
 *
 * @author 180503743
 */
public class ArvoreBinariaDePesquisa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] insertArray = {23, 32, 12, 56, 24, 14};
        BST binarySearchTree = new BST();
        
        for (int i : insertArray) {
            binarySearchTree.insert(binarySearchTree.getRoot(), i);
        }
        
        System.out.println("DEBUG: " + binarySearchTree.toString());
    }
    
}
