/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4.buscabinaria;

import java.lang.reflect.Array;

/**
 *
 * @author Igor Nascimento <igornascimento@gmail.com>
 */
public class Aula4BuscaBinaria {

    public static int busca(int[] array, int valor) {
        int inicio = 0;
        int fim = array.length -1;
        return buscaRecursiva(array, inicio, fim, valor);
    }
    
    public static int buscaRecursiva(int[] array, int inicio, int fim, int valor) {
        int meio = (inicio + fim) / 2;
        int valorMeio = array[meio];
        if (inicio > fim) {
            return -1;
        } else if (valorMeio == valor) {
            return valor;
        } else if (valorMeio < valor) {
            return buscaRecursiva(array, meio+1, fim, valor);
        } else {
            return buscaRecursiva(array, inicio, meio-1, valor);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {2, 12 ,15, 21 ,35, 47, 89};
        int resultado = busca(array, 35);
        System.out.println("Elemento encontrado: " + resultado);
    }
    
}
