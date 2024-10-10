import java.util.ArrayList;

class Cofrinho {
    private ArrayList<Moeda> moedas;

    public Cofrinho() {
        moedas = new ArrayList<>();
    }

    public void adicionarMoeda(Moeda moeda) {
        moedas.add(moeda);
        System.out.println(moeda + " adicionada.");
    }

    public void removerMoeda(Moeda moeda) {
        if (moedas.remove(moeda)) {
            System.out.println(moeda + " removida.");
        } else {
            System.out.println("Moeda não encontrada.");
        }
    }

    public void listarMoedas() {
        if (moedas.isEmpty()) {
            System.out.println("O cofrinho está vazio.");
        } else {
            for (Moeda moeda : moedas) {
                System.out.println(moeda);
            }
        }
    }

    public double calcularTotalEmReais() {
        double total = 0;
        for (Moeda moeda : moedas) {
            total += moeda.converterParaReal();
        }
        return total;
    }
}
