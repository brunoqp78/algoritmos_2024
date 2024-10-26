package strings;

import java.util.Scanner;

public class LerCaracteres {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        char c = s1.charAt(0);

        System.out.println("Texto original = " + s1);
        System.out.println("Primeiro caracter = " + c);

        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));
        }
        
        char vet[] = s1.toCharArray();

        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
                
        s.close();
    }
}
