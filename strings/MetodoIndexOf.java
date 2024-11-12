package strings;

import java.util.Scanner;

public class MetodoIndexOf {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();
        int saida = entrada.indexOf("Iftm");        
        System.out.println(saida);
        s.close();
    }
}
