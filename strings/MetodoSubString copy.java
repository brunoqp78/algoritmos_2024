package strings;

import java.util.Scanner;

public class MetodoSubString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();
        String saida1 = entrada.substring(0, entrada.length()/2);
        String saida2 = entrada.substring(entrada.length()/2);
        System.out.println(entrada);
        System.out.println(saida1);
        System.out.println(saida2);
        try{
            System.out.println(entrada.substring(1, 4));
        }catch(StringIndexOutOfBoundsException e1){
            System.out.println("Tamanho do texto incorreto!!!");
        }catch(Exception e){
            System.out.println("Outro erro!!!");
        }
        s.close();
    }
}
