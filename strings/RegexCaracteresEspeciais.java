package strings;

import java.util.Scanner;

public class RegexCaracteresEspeciais {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String leitura;
        // Comparação simples, se uma String é exatamente igual a sua expressão
        leitura = "iftm";
        System.out.println("Resposta = " + leitura.matches("iftm"));

        // Comparar se uma String tem a palavra iftm e mais 4 caracteres.
        leitura = "iftm 2024";
        System.out.println("Resposta = " + leitura.matches("iftm ...."));
        /*
         * exemplo de uso de regex
         * leitura = "";
         * while (leitura.matches("iftm ....")==false){
         * leitura = s.nextLine();
         * }
         */
        // Comparar se uma String tem a palavra iftm e mais 4 números.
        leitura = "iftm 2024";
        System.out.println("Resposta = " + leitura.matches("iftm \\d\\d\\d\\d"));
        // Comparar se uma String tem a palavra iftm e mais 4 caracteres diferentes de
        // números.
        leitura = "iftm aaaa";
        System.out.println("Resposta = " + leitura.matches("iftm \\D\\D\\D\\D"));
        // Comparar se uma String tem 5 letras ou números.
        leitura = "ab11c";
        System.out.println("Resposta = " + leitura.matches("\\w\\w\\w\\w\\w"));
        // Comparar se uma String tem um caracter especial e mais 5 letras ou números.
        leitura = "@1122a";
        System.out.println("Resposta = " + leitura.matches("\\W\\w\\w\\w\\w\\w"));
        // Comparar se uma String tem 4 letras ou números, um espaço e um número.
        leitura = "iftm 1";
        System.out.println("Resposta = " + leitura.matches("\\w\\w\\w\\w\\s\\d"));
        // Comparar se uma String com 6 caracteres não tem espaços no inicio e fim.
        leitura = "123456";
        System.out.println("Resposta = " + leitura.matches("\\S....\\S"));

        // Verificar se uma String é um CEP válido
        String mascara = "\\d\\d\\d\\d\\d-\\d\\d\\d";
        leitura = "38400-000";
        System.out.println("Resposta = " + leitura.matches(mascara));
        // Verificar se uma String é um CPF válido
        mascara = "\\d\\d\\d.\\d\\d\\d.\\d\\d\\d-\\d\\d";
        String mascara2 = "\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d";        
        leitura = "123.123.123-22";
        /*
        if (leitura.matches(mascara) || leitura.matches(mascara2)){
            System.out.println("CPF correto");
        }else{
            System.out.println("CPF incorreto");
        }
        */
        System.out.println("Resposta = " + leitura.matches(mascara));
        // Verificar se uma String contém 10 números
        mascara = "\\d{10}";
        leitura = "1234567890";
        System.out.println("Resposta = " + leitura.matches(mascara));
        // Verificar se uma String contém no mínimo 5 caracteres
        mascara = ".{5,}";
        leitura = "&fsdfdsffsd";
        System.out.println("Resposta = " + leitura.matches(mascara));

        // Verificar se uma String contém entre 2 e 10 números
        mascara = "\\d{2,10}";
        leitura = "123";
        System.out.println("Resposta = " + leitura.matches(mascara));

        // Verificar se uma String contém ou não um caractere.
        mascara = ".?";
        leitura = "";
        System.out.println("Resposta = " + leitura.matches(mascara));

        // Verificar se uma String contém de 1 a vários números
        mascara = "\\d+";
        leitura = "33434";
        System.out.println("Resposta = " + leitura.matches(mascara));

        // Verificar se uma String contém de 0 a vários números
        mascara = "\\d*";
        leitura = "432";
        System.out.println("Resposta = " + leitura.matches(mascara));

        // Verificar se uma String contém apenas letras de a - f
        mascara = "[a-f A-F 0-9]+";
        System.out.println
        leitura = s.nextLine();
        System.out.println("Resposta = " + leitura.matches(mascara));

        s.close();
    }

}
