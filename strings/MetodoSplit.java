package strings;

import java.util.Arrays;
import java.util.Scanner;

public class MetodoSplit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();
        String saida[] = entrada.split("/");
        System.out.println(Arrays.toString(saida));
        s.close();
    }
}
