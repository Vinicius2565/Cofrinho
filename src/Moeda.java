abstract class Moeda {
    protected double valor;
    protected String pais;

    public Moeda(double valor, String pais) {
        this.valor = valor;
        this.pais = pais;
    }

    public abstract double converterParaReal();

    @Override
    public String toString() {
        return "Moeda: " + this.pais + " - Valor: " + this.valor;
    }
}
