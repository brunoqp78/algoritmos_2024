package strings;

import java.util.Scanner;

public class ManipularCaracter01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char car;
        for (int i = 0; i < 10000; i++) {
            car = (char) i;
            System.out.println("O caractere " + car + " é igual ao número inteiro " + (int)car);
        }
        
        
        s.close();
    }
}
