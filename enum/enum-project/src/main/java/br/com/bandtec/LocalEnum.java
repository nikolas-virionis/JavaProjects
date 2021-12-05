package main.java.br.com.bandtec;

public enum LocalEnum {
    SUL(1, "S", "s"),
    CENTRO(2, "CE", "ce"),
    NORTE(3, "N", "n"),
    SUDESTE(4, "SE", "se"),
    NORDESTE(5, "NE", "ne");

    private final Integer cod;
    private final String abreviacaoUpper;
    private final String abreviacaoLower;

    private LocalEnum(Integer cod, String abreviacaoUpper, String abreviacaoLower) {
        this.cod = cod;
        this.abreviacaoUpper = abreviacaoUpper;
        this.abreviacaoLower = abreviacaoLower;
    }

    public Integer getCod() {
        return cod;
    }

    public String getAbreviacaoUpper() {
        return abreviacaoUpper;
    }

    public String getAbreviacaoLower() {
        return abreviacaoLower;
    }
}
