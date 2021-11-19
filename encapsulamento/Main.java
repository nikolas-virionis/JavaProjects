package br.com.bandtec.projeto.encapsulamento;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
        listaAlunos.add(new Aluno("#123", "Diego", new Curso("CCO", 
                new Coordenador("Marise", 10000.00), 
                new Disciplina("Linguagem de programação", new Nota(8.5), new Nota(9.5)),
                new Disciplina("Analise de Sistemas", new Nota(7.0), new Nota(9.0)),
                new Disciplina("Sistemas Operacionais", new Nota(9.0), new Nota(8.5)),
                new Disciplina("Calculo computacional", new Nota(6.4), new Nota(10.0)))));
        listaAlunos.add(new Aluno("#456", "Nikolas", new Curso("CCO", 
                new Coordenador("Marise", 12000.00), 
                new Disciplina("Linguagem de programação", new Nota(9.7), new Nota(9.7)),
                new Disciplina("Analise de Sistemas", new Nota(9.3), new Nota(9.0)),
                new Disciplina("Sistemas Operacionais", new Nota(8.5), new Nota(8.5)),
                new Disciplina("Calculo computacional", new Nota(8.0), new Nota(10.0)))));
        
        for (Aluno aluno : listaAlunos) {
            System.out.println(aluno);
        }
        
    }
}
