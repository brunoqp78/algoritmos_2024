package colecoes;

import colecoes.classes.Aluno;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExemploHashMap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Map<String,String> dddMunicipio = new HashMap<>();
        dddMunicipio.put("Uberlândia", "34");
        dddMunicipio.put("São Paulo", "11");
        dddMunicipio.put("Rio de Janeiro", "21");

        Map<String, Aluno> alunos = new HashMap<>();
        alunos.put("1", new Aluno("Bruno", 9));
        alunos.put("2", new Aluno("Clarimundo", 10));

        System.out.println(dddMunicipio);

        System.out.println(alunos);

        for (Map.Entry<String, Aluno> aluno: alunos.entrySet()) {
            System.out.println(aluno.getValue());
        }
        alunos.replace("1", new Aluno("Pedro", 1));
        String numero = s.nextLine();
        Aluno atual = alunos.getOrDefault(numero, new Aluno());
        System.out.println(atual);

        System.out.println(alunos.containsKey("2"));

    
    }
}
