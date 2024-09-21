package revisão_funcoes;

import java.util.Scanner;

public class FuncaoMediaNotas{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double v[] = {10.0, 10.0, 0.0, 10.0, 10.0};        
        calcularMediaNotas(v);
        s.close();
    }

    public static void calcularMediaNotas(double notas[]){
        double somaNotas = 0;
        for (int i = 0; i < notas.length; i++) {
            somaNotas+= notas[i];
        }
        System.out.println("Média das notas = " + (somaNotas/notas.length));
    }

}