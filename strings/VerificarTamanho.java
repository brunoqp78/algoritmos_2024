package strings;

import java.util.Scanner;

public class VerificarTamanho {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        System.out.println("Quantidade de letras da primeira palavra = " +s1.length());
        System.out.println("Quantidade de letras da segunda palavra = " +s2.length());
        s.close();
    }
}
