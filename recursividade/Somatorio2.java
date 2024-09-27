package recursividade;

import java.util.Scanner;
/*
public int somatorio(int N) {
	int i, resp = 0; 
	for( i = 1; i <= N; i++ )		
		resp += i; 
	return resp;
}
 */
public class Somatorio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o número N: ");
        int n = s.nextInt();
        int r = somatorio(1,n);  
        System.out.println("Resultado = " + r);  
        System.out.println();
        s.close();    
    }

    public static int somatorio(int i, int n){
       //caso da parada
       if (i==n){
          return n;
       }else{
       //caso recursivo
          return i + somatorio(i +1, n);
       }
    }
}
