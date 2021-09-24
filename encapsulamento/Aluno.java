package br.com.bandtec.projeto.encapsulamento;

public class Aluno {

    private String ra;
    private String nome;
    private Curso curso;

    public Aluno(String ra, String nome, Curso curso) {
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return String.format("Aluno(a) %s: \n\tRA: %s\nCurso %s:",
                nome, ra, curso);
    }
}
