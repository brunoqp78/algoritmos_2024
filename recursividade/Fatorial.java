package recursividade;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o número N: ");
        int n = s.nextInt();
        int r = calcularFatorial(n);  
        System.out.println("Resultado = " + r);  
        System.out.println();
        s.close();    
    }

    public static int calcularFatorial(int n){
       //caso da parada
       if (n<=1){
          return 1;
       }else{
       //caso recursivo
          return n * calcularFatorial(n-1);
       }
    }
}
