package colecoes;

import colecoes.classes.Aluno;
import java.util.HashMap;
import java.util.Map;

public class Teste {
    public static void main(String[] args) {
        HashMap<String,String> mapas = new HashMap<>();
        mapas.put("SP", "São Paulo");
        mapas.put("MG", "Minas Gerais");
        mapas.put("RS", "Rio Grande do Sul");

        System.err.println(mapas);

        HashMap<String, Aluno> alunos = new HashMap<>();
        alunos.put("1", new Aluno("Bruno", 5));
        alunos.put("2", new Aluno("Jose", 6));

        for (Map.Entry<String, Aluno> item : alunos.entrySet()) {
            System.err.println(item.getValue().getNome());
        }
        System.err.println(alunos.get("1").getNome());

    }
}
