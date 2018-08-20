package aula2.pilha;

/**
 *
 * @author Igor Nascimento <igornascimento@gmail.com>
 */
public class Pilha<T> {
    
    private Node peek;
    private Lista list;
    
    public Pilha() {
        this.list = new Lista();
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
    
    public void print() {
        while (list.hasNext()) {
            System.out.println(list.next().toString());
        }
    }
    
}
