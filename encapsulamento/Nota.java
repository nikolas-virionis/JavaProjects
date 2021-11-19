
package br.com.bandtec.projeto.encapsulamento;

public class Nota {
    private Double maximo;
    private Double valor;

    public Nota(Double valor) {
        this.valor = valor;
        this.maximo = 10.0;
    }

    public Double getMaximo() {
        return maximo;
    }

    public Double getValor() {
        return valor;
    }
    
    @Override
    public String toString(){
        return String.format("\n\t\t\t\tNota: %.2f\n\t\t\t\tNota máxima: %.2f", 
                getValor(), getMaximo());
    }
    
}
