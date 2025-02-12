package colecoes.classes;

import java.util.Objects;

public class Aluno {
    private String nome;
    private int nota;


    public Aluno(String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
    }
    public Aluno(){}    

    @Override
    public boolean equals(Object obj) {
         return this.nome.equals(((Aluno) obj).getNome());
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.nome);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNota() {
        return nota;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.nome + " - " + this.nota;
    }

    

    
}
