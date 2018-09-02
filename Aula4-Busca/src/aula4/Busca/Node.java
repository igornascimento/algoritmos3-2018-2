package aula4.Busca;

/**
 *
 * @author Igor Nascimento
 */
public class Node<T> implements NodeInterface {
    
    private T value;
    private Node<T> next;
    
    public Node(T value) {
        this.value = value;
        this.next = null;
    }
    
    public T getValue() {
        return this.value;
    }
    
    public void setNext(Node node) {
        this.next = node;
    }
    
    public Node next() {
        return next;
    }
    
    public boolean hasNext() {
        if (this.next != null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(int key) {
        
        
        
        return true;
    }
}
