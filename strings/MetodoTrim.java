package strings;

import java.util.Arrays;
import java.util.Scanner;

public class MetodoTrim {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();
        System.out.println(entrada.trim());
        s.close();
    }
}
