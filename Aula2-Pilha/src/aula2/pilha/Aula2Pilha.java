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
        
        printPilha(testePilha);
        
        testePilha.pop();
        
        printPilha(testePilha);
        
    }
    
    public static void printPilha(Pilha pilha) {
        System.out.println("Printando a pilha:");
        while (pilha.size() > 0) {
            Node item = pilha.pop();
            System.out.println("Item: " + item.getValue());
        }
    }
    
}
