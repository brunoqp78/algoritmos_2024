import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Bee1070 {
 
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int cont=0;
        acheNumerosImpares(n, cont);
        s.close();
 
    }

    public static void acheNumerosImpares(int n, int cont){        
        if (cont < 6){
            if (n%2!=0){
                System.out.println(n);
                cont++;
            }           
            acheNumerosImpares(++n, cont);
        }
    }
 
}
