/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcaohash;

/**
 *
 * @author Igor Nascimento <igornascimento@gmail.com>
 */
public class FuncaoHash {

    static final int INDICE_ALEATORIO = 27;
    
    private static int hash(String palavra){
        int codigo = 1;
        for (int i = 0; i < palavra.length(); i++) {
            codigo = INDICE_ALEATORIO * codigo + palavra.charAt(i);
        }
        return codigo;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // funcao para geracao do codigo hash, recebendo como parametro uma string
        System.out.println("Índice gerado: " + hash("Teste"));
        System.out.println("Índice gerado: " + hash("Emancipado"));
        System.out.println("Índice gerado: " + hash("emancipado"));
        
    }
    
}
