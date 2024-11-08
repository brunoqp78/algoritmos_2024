package strings;

import java.util.Arrays;
import java.util.Scanner;

public class UtilizandoStringValueOf {
public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero = s.nextInt();
        String numeroTexto = String.valueOf(numero);
        char caracteres[] = numeroTexto.toCharArray();
        System.out.println(Arrays.toString(caracteres));
        int soma = 0;
        for (int i = 0; i < caracteres.length; i++) {
            soma += (caracteres[i] - 48);
        }
        System.out.println(numero + " = " + soma);
        s.close();
    }
}
