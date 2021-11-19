package com.example;

public class DesenvolvedorMobile extends Desenvolvedor {

    protected Integer qtdHorasTrabalhadasMobile;
    protected Double valorHoraTrabalhadaMobile;

    public DesenvolvedorMobile(String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada,
            Integer qtdHorasTrabalhadasMobile, Double valorHoraTrabalhadaMobile) {
        super(nome, qtdHorasTrabalhadas, valorHoraTrabalhada);
        this.qtdHorasTrabalhadasMobile = 0;
        this.valorHoraTrabalhadaMobile = valorHoraTrabalhadaMobile;
    }

    public Integer getQtdHorasTrabalhadasMobile() {
        return qtdHorasTrabalhadasMobile;
    }

    public void setQtdHorasTrabalhadasMobile(Integer qtdHorasTrabalhadasMobile) {
        this.qtdHorasTrabalhadasMobile = qtdHorasTrabalhadasMobile;
    }

    public Double getValorHoraTrabalhadaMobile() {
        return valorHoraTrabalhadaMobile;
    }

    public void setValorHoraTrabalhadaMobile(Double valorHoraTrabalhadaMobile) {
        this.valorHoraTrabalhadaMobile = valorHoraTrabalhadaMobile;
    }

    @Override
    public Double getSalario() {
        return super.getSalario() + this.valorHoraTrabalhadaMobile * this.qtdHorasTrabalhadasMobile;
    }

    @Override
    public String toString() {
        return "DesenvolvedorMobile \n " + super.toString() + "[qtdHorasTrabalhadasMobile=" + qtdHorasTrabalhadasMobile
                + ", valorHoraTrabalhadaMobile=" + valorHoraTrabalhadaMobile + "]";
    }

}
