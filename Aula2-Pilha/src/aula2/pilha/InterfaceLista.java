package aula2.pilha;

/**
 *
 * @author Igor Nascimento
 */
interface InterfaceLista<T> {
    void append(T valor); // adiciona um elemento no final da lista.
    void addFirst(T valor); // adiciona um elemento no inicio da lista.
    void removeLast(T previous); // remove o último elemento da lista.
    Node removeFirst(); // remove o primeiro elemento da lista.
    int size(); // retorna o número de elementos na lista.
    T get(int index); // retorna o elemento com o indice indicado.
}
