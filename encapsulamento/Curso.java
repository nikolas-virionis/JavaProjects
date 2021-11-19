package br.com.bandtec.projeto.encapsulamento;

public class Curso {

    private String nome;
    private Coordenador coordenador;
    private Disciplina lp;
    private Disciplina as;
    private Disciplina so;
    private Disciplina calc;

    public Curso(String nome, Coordenador coordenador, Disciplina lp, Disciplina as,
            Disciplina so, Disciplina calc) {
        this.nome = nome;
        this.coordenador = coordenador;
        this.lp = lp;
        this.as = as;
        this.so = so;
        this.calc = calc;
    }

    public String getNome() {
        return nome;
    }

    public Coordenador getCoordenador() {
        return coordenador;
    }

    public Disciplina getLp() {
        return lp;
    }

    public Disciplina getAs() {
        return as;
    }

    public Disciplina getSo() {
        return so;
    }

    public Disciplina getCalc() {
        return calc;
    }

    @Override
    public String toString(){
        return String.format("%s: \n\tCoordenador(a) %s\n\t"
                + "Disciplina: %s%s%s%s", getNome(), coordenador,
                getLp(), getAs(), getSo(), getCalc());
    }

}
