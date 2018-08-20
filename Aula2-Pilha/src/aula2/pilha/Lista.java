package aula2.pilha;

import java.util.Iterator;

/**
 *
 * @author Igor Nascimento
 */
public class Lista<T> implements InterfaceLista {
    
    private Node head;
    private Node tail;
    private int size = 0;
    private Iterador it = new Iterador();
    
    @Override
    public void addFirst(Object valor) {
        Node node = new Node(valor);
        node.setNext(head);
        this.head = node;
        this.tail = node;
        this.size++;
    }
    
    @Override
    public void append(Object valor) {
        Node node = new Node(valor);
        this.tail.setNext(node);
        this.tail = node;
        this.size++;
    }

    @Override
    public void removeLast(Object previous) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Node removeFirst() {
        Node actual = this.head;
        this.head = this.head.getNext();
        this.size--;
        return actual;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Object get(int index) {
        int i = 0;
        for (Node node = head; node != null; node.getNext()) {
            if (i == index)
                return node;
            i++;
        }
        return null;
    }
    
    public Iterator getIterator() {
        return this.it;
    }
    
    
    private class Iterador implements Iterator {

        @Override
        public boolean hasNext() {
            return this.hasNext();
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return this.next();
            }
            return false;
        }
        
    }
    
}
