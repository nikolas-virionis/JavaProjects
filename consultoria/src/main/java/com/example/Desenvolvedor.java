package com.example;

public class Desenvolvedor {

    protected String nome;
    protected Integer qtdHorasTrabalhadas;
    protected Double valorHoraTrabalhada;

    public Desenvolvedor(String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada) {
        this.nome = nome;
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    public String getNome() {
        return nome;
    }

    public Integer getQtdHorasTrabalhadas() {
        return qtdHorasTrabalhadas;
    }

    public Double getValorHoraTrabalhada() {
        return valorHoraTrabalhada;
    }

    public Double getSalario() {
        return this.valorHoraTrabalhada * this.qtdHorasTrabalhadas;
    }

    @Override
    public String toString() {
        return "Desenvolvedor [nome=" + nome + ", qtdHorasTrabalhadas=" + qtdHorasTrabalhadas + ", valorHoraTrabalhada="
                + valorHoraTrabalhada + "]";
    }
}
