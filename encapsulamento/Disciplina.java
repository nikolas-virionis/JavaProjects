package br.com.bandtec.projeto.encapsulamento;

public class Disciplina {

    private String nome;
    private Nota ac1;
    private Nota ac2;

    public Disciplina(String nome, Nota ac1, Nota ac2) {
        this.nome = nome;
        this.ac1 = ac1;
        this.ac2 = ac2;
    }

    public String getNome() {
        return nome;
    }

    public Nota getAc1() {
        return ac1;
    }

    public Nota getAc2() {
        return ac2;
    }

    public Double getMedia() {
        return (ac1.getValor() + ac2.getValor()) / 2;
    }
    @Override
    public String toString(){
        return  String.format("\n\t\t%s: \n\t\t\tAC1: %s\n\t\t\tAC2: %s"
                + "\n\t\t\tMédia: %.2f\n\n", getNome(), getAc1(), getAc2(), getMedia());
    }
}
