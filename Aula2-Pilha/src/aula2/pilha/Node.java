package aula2.pilha;

/**
 *
 * @author Igor Nascimento
 */
public class Node<T> {
    
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
    
    public Node getNext() {
        return next;
    }
    
    public boolean hasNext() {
        if (this.next != null) {
            return true;
        }
        return false;
    }
}
