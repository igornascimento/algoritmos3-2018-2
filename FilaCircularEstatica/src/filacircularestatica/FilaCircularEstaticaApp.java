/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filacircularestatica;

/**
 *
 * @author Igor Nascimento <igornascimento@gmail.com>
 */
public class FilaCircularEstaticaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FilaCircularEstatica filaCircular = new FilaCircularEstatica();
        // adicionando elementos
        filaCircular.incluirFilaC(8);
        filaCircular.incluirFilaC(6);
        filaCircular.incluirFilaC(10);
        filaCircular.incluirFilaC(1);
        filaCircular.incluirFilaC(7);
        filaCircular.incluirFilaC(5);
        
        // removendo primeiro elemento da fila
        filaCircular.removerFilaC();
        
        filaCircular.print();
        
    }
    
}
