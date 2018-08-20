package aula2.pilha;

import java.util.Iterator;

/**
 *
 * @author Igor Nascimento <igornascimento@gmail.com>
 */
public class Pilha<T> {
    
    private Node peek;
    private Lista list;
    
    public Pilha() {
        this.list = new Lista<T>();
    }
    
    public void push(T value) {
        list.addFirst(value);
        peek = (Node) list.get(0);
    }
    
    public Node<T> pop() {
        if (list.size() > 0) {
            return list.removeFirst();
        }
        return null;
    }
    
    public Node peek() {
        return peek;
    }
    
    public boolean isEmpty() {
        return list.size() > 0 || false;
    }
    
    public int size() {
        return list.size();
    }
    
}
