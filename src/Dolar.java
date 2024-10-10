class Dolar extends Moeda {
    public Dolar(double valor) {
        super(valor, "Dólar");
    }

    @Override
    public double converterParaReal() {
        return this.valor * 5.30; // Exemplo da taxa de conversão
    }
}

class Euro extends Moeda {
    public Euro(double valor) {
        super(valor, "Euro");
    }

    @Override
    public double converterParaReal() {
        return this.valor * 6.20; // Exemplo da taxa de conversão
    }
}

class Real extends Moeda {
    public Real(double valor) {
        super(valor, "Real");
    }

    @Override
    public double converterParaReal() {
        return this.valor; // Já está em Real
    }
}
