package strings;

import java.util.Scanner;

public class MetodoIndexOfTwo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();
        String parte = s.nextLine();
        System.out.println(contarOcorrencias(entrada, parte));
        s.close();
    }
    public static int contarOcorrencias(String original, String parte){
        int contador = 0;
        int pos = original.indexOf(parte);
        int tamanho = parte.length();
        while (pos!=-1) {
            contador++;            
            original = original.substring(pos + tamanho);
            pos = original.indexOf(parte);
        } 
        return contador;      

    }
}
