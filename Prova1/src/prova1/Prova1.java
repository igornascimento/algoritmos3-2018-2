package prova1;

/**
 *
 * @author Igor Nascimento <igornascmiento@gmail.com>
 */
public class Prova1 {

    /**
     * Exercicio 5:
     * Método para verificar se a arvore binaria e valida
     */
    public boolean isValidTree(Node root) {
        if (root != null) {
            return this.isValidTree(root, root.key(), null);
        } else {
            System.out.println("A árvore informada está vazia.");
            return false;
        }
    }
    
    /**
     * Definicao: 
     * Para uma arvore valida, a key do filho a esquerda do no deve ser menor do que o no atual, 
     * enqto o filho a direita do no deve ser maior do que o no atual.
     */
    public boolean isValidTree(Node node, T previousKey, String direction) {
        if (node.right()) {
            // se nao e uma folha, continua a direita
            return this.isValidTree(node.right(), node.key(), "right");
        } else if (node.left()) {
            // se nao e uma folha, continua a esquerda
            return this.isValidTree(node.left(), node.key(), "left");
        
        } else {
            if (direction == null) {
                // a arvore possui apenas a raiz, portanto eh uma arvore valida
                return true;
            }
            // se eh uma folha verifica a direcao tomada pelo algoritmo e valida o valor
            if ( (node.key() < previousKey && direction == "right") || (node.key() > previousKey && direction == "left") )
                return true;
            else
                return false;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
