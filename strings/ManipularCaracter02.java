package strings;

import java.util.Scanner;

public class ManipularCaracter02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int car = s.next().charAt(0);
        System.out.println("O caractere " + (char)car + " é igual ao número inteiro " + car);
        for (int i = 0; i < 20; i++) {
            car+=4;
           System.out.println((char)car); 
        }
        
        s.close();
    }
}
