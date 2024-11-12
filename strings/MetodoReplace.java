package strings;

import java.util.Scanner;

public class MetodoReplace {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();
        String saida = entrada.replace("Java", "Python");
        System.out.println(saida);
        s.close();
    }
}
