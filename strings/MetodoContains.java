package strings;

import java.util.Scanner;

public class MetodoContains {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();
        boolean saida = entrada.contains("Iftm");
        System.out.println(saida);
        s.close();
    }
}
