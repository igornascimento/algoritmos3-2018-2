/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raizquadrada;

/**
 *
 * @author 180503743
 */
public class RaizQuadrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Calculo da raiz quadrada de um INTEIRO utilizacao da Equacao de Pell
        
        // Calculo da parte inteira do numero:
        int numIteracoes = 0;
        int valor = 27;
        int valorInicial = valor;
        int incremento = 1;
        while (valor >= incremento) {
            valor = valor - incremento;
            incremento = incremento + 2;
            numIteracoes++;
        }
        System.out.println("Parte inteira da raiz quadrada de num INTEIRO: " + numIteracoes + ". (Resto: " + (valorInicial - numIteracoes*numIteracoes) + ")");
        
        // Calculo do parte decimal
        
        // primeiro digito
        int resto = valor - numIteracoes;
        int novoResto = resto * 100;
        int novoIteracoes = numIteracoes * 20 + 1;
        int primeiroDigito = novoResto - novoIteracoes;
        valor = primeiroDigito;
        incremento = 1;
        numIteracoes = 0;
        while (primeiroDigito >= incremento) {
            valor = valor - incremento;
            incremento = incremento + 2;
            numIteracoes++;
        }
        System.out.println("Primeiro digito: " + primeiroDigito );
        
        // segundo digito
        
    }
    
}
