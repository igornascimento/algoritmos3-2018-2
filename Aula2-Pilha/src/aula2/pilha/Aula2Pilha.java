package aula2.pilha;

/**
 *
 * @author Igor Nascimento
 */
public class Aula2Pilha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pilha testePilha = new Pilha();
        
        testePilha.push("abacate");
        testePilha.push("maça");
        testePilha.push("pêra");
        testePilha.push("abacaxi");
        
        testePilha.print();
        
        testePilha.pop();
        
        testePilha.print();
        
    }
    
}
