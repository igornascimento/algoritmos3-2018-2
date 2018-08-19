package aula2.pilha;

/**
 *
 * @author Igor Nascimento
 */
public class Lista<T> implements InterfaceLista {
    
    private Node head;
    private Node tail;
    private int size = 0;
    
    @Override
    public void addFirst(Object valor) {
        Node node = new Node(valor);
        node.setNext(head);
        this.head = node;
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
    public void removeFirst() {
        this.head = this.head.getNext();
        this.size--;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Object get(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
