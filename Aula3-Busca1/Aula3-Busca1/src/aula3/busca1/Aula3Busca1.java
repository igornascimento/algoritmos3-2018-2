package aula3.busca1;

/**
 *
 * @author 180503743
 */
public class Aula3Busca1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Fibonacci:");
        System.out.println( fibo(6) );
        System.out.println( fibo(10) );
        System.out.println( fibo(47) );
        
    }
    
    public static int fibo(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fibo(n - 1) + fibo(n - 2);
    }
}
