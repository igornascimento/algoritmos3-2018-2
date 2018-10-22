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
public class BST<K extends Comparable<K>, T> {
    
    /**
     * Node implementation
     */
    public class Node<K> {
        private K key;
        private Node<K> left;
        private Node<K> right;
        
        public Node() {
            //
        }
        
        public Node(K key) {
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }
    
    
    private Node root;
    
    public BST() {
        this. root = null;
    }
    
    public Node search(Node root, K key) {
        Node<K> actualNode = null;
        if (root == null)
            actualNode = null;
        if (key == root.key) 
            actualNode = root;
        if (root.key.compareTo(key))
            actualNode = search(root.left, key);
        if (key > root.key)
            actualNode = search(root.right, key);
        return actualNode;
    }
    
    public Node insert(Node root, K key) {
        Node newRoot = new Node();
        if (root == null)
            newRoot = new Node(key);
        if (key < root.key)
            newRoot = insert(root.left, key);
        if (key > root.key)
            newRoot = insert(root.right, key);
        
        return newRoot;
    }
    
    public Node getRoot() {
        return this.root;
    }
}
