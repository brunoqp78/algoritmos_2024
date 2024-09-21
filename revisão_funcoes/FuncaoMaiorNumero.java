package revisão_funcoes;

import java.util.Scanner;

/*
Função com parâmetro e retorno:

Criar uma função que recebe duas notas(double) e retorna a maior dentre elas.
Criar um programa que utilize essa função.
 */

public class FuncaoMaiorNumero{

    public static void main(String[] args) {        
        Scanner s = new Scanner(System.in);

        double n1 = s.nextDouble();
        double n2 = s.nextDouble();
        System.out.println(encontrarMaior(n1, n2));

        s.close();
    }
    
    public static double encontrarMaior(double n1, double n2){
        return (n1>n2)? n1 : n2;
    }
}

