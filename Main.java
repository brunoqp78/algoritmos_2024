
import java.util.Scanner;                   //o código não importou ambas classes necessárias, classes adicionadas.
import java.io.IOException;
public class Main{
public static void main(String[] args) throws IOException {
 Scanner s = new Scanner(System.in);
 int n = s.nextInt();
 System.out.println("ff(" + n + ") = " + funcaoFF(n));
 s.close();
}


private static int funcaoFF(int n) {

        if (n == 1){                    
            return 1;           //essa linha tinha um caso base que chama a função novamente - return funcaoFF(n-1);  
        }else if (n % 2 == 0){
            return funcaoFF(n/2);
        }else {
            return funcaoFF((n-1)/2) + funcaoFF((n+1)/2);
        }      
    }
}