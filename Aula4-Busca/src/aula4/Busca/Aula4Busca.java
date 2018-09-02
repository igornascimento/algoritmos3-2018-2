/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4.Busca;

/**
 *
 * @author Igor Nascimento <igornascimento@gmail.com>
 */
public class Aula4Busca {
    
    public static void main(String[] args) {
        
        Lista lista = new Lista();
        
        lista.addFirst("Igor");
        lista.append("Maria");
        lista.append("João");
        lista.append("Pedro");
        
        Node resultado = lista.search("José");
        
        System.out.println("Encontrado: " + (resultado != null ? resultado.getValue() : "nenhum"));
    }
    
}
