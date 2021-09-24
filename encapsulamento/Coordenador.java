package br.com.bandtec.projeto.encapsulamento;

public class Coordenador {
    
    private String nome;
    private Double salario;

    public Coordenador(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }
    
    @Override
    public String toString(){
        return String.format("%s:\n\t\tSalario: %.2f", getNome(), getSalario());
    }
            
}
