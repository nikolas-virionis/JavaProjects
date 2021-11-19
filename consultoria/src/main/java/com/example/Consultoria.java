package com.example;

import java.util.ArrayList;
import java.util.List;

public class Consultoria {
    private String nome;
    private Integer vagas;
    private List<Desenvolvedor> devs;

    public Consultoria(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.devs = new ArrayList<Desenvolvedor>();
    }

    public List<Desenvolvedor> getDevs() {
        return devs;
    }

    public Integer getVagas() {
        return vagas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void contratar(Desenvolvedor dev) {
        if (devs.size() < vagas) {
            devs.add(dev);
        } else {
            System.out.println("Sem vagas disponníveis!");
        }
    }

    public Boolean existePorNome(String nome) {
        for (Desenvolvedor dev : this.devs) {
            if (nome.equals(dev.getNome())) {
                return true;
            }
        }
        return false;
    }

    public Integer getQuantidadeDesenvolvedores() {
        return devs.size();
    }

    public Integer getQuantidadeDesenvolvedoresMobile() {
        int soma = 0;
        for (Desenvolvedor dev : devs) {
            if (dev instanceof DesenvolvedorMobile) {
                soma++;
            }
        }
        return soma;
    }

    public Double getTotalSalarios() {
        double totalSalarios = 0d;
        for (Desenvolvedor dev : devs) {
            totalSalarios += dev.getSalario();
        }
        return totalSalarios;
    }

    public Desenvolvedor buscarDesenvolvedorPorNome(String nome) {
        if (!existePorNome(nome)) {
            return null;
        }
        for (Desenvolvedor dev : devs) {
            if (dev.getNome().equals(nome)) {
                return dev;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Consultoria [devs=" + devs + ", nome=" + nome + ", vagas=" + vagas + "]";
    }
}
