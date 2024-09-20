import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Bee1029 {
    static int contador=0;
 
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            contador=0;
            int x = s.nextInt();
            long valor = fibonacci(x);
            System.out.println("fib("+x+") = "+ contador +" calls = " + valor);
        }
 
        s.close();
 
    }

    public static long fibonacci(int numero){
        
        if (numero <= 1) return numero;
        else{
            contador+=2;
            return fibonacci(numero-1)+ fibonacci(numero-2);
        }
    }
 
}