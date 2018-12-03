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
public class FilaCircularEstatica {
    static final int TAMANHO_INICIAL = 5; //-- tamanho inicial
     private int quantidade=0;
     private Integer[]vetor = new Integer[TAMANHO_INICIAL];     
     
     public  boolean isFilaVazia (){
         return quantidade==0;
     }
     
     public boolean isFilaCheia(){
         for (Integer elementFila : vetor) {
                 if(elementFila==null){
                     return false;
                 }
         }
         return true;
     }
     public void incluirFilaC (int valor){
      if (isFilaCheia()){
          //Copia os valores para o vetor auxiliar acrecendo de mais um espaço
          // e retorna para vetor.
          Integer filaNova [] = new Integer [vetor.length+1];
          for (int i = 0; i < vetor.length; i++) {
              filaNova[i]= vetor[i];  
          }
          vetor=filaNova;
          quantidade++;
          return;
          
      }
      int pos=0;
       for (Integer elementFila : vetor){
          if(elementFila==null){
              vetor[pos]=valor;
              quantidade++;
              break;
          }
          pos++;
       }    
      
     }
     public void removerFilaC (){
         if(isFilaVazia()){
             System.out.println("Erro ao Remover da fila pois a mesma está vazia");
             return;
         }
         Integer filaNova [] = new Integer [vetor.length-1];
          for (int i = 1; i < vetor.length; i++) {
              filaNova[i-1]= vetor[i];  
          }
          vetor=filaNova;
          quantidade--;
     }
     
     public void print() {
      System.out.println("***********************************************");
      System.out.println("Fila=[inicio=0, fim=" + quantidade + "]");
      for (int i = 0; i < quantidade; i++) {
       System.out.println("Elemento na pos " + i + ", valor:" + vetor[i]);
      }
      System.out.println(" ");

     }
}
