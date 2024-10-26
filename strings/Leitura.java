package strings;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero = 1;
        while (numero != 0) {
            String nome = s.nextLine();
            String instituicao = s.nextLine();            
            double salario = s.nextDouble();
            String sigla = s.next();
            numero = s.nextInt();
            s.nextLine();
            System.out.println("\nSaída");
            System.out.println("Numero = " + numero);
            System.out.println("Nome = " + nome);
            System.out.println("Instituição = " + instituicao);
        }
        s.close();
    }
}
