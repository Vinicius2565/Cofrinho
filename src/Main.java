import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cofrinho cofrinho = new Cofrinho();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar moeda");
            System.out.println("2 - Remover moeda");
            System.out.println("3 - Listar moedas");
            System.out.println("4 - Calcular total em Reais");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarMoedaMenu(cofrinho, scanner);
                    break;
                case 2:
                    removerMoedaMenu(cofrinho, scanner);
                    break;
                case 3:
                    cofrinho.listarMoedas();
                    break;
                case 4:
                    System.out.println("Total em Reais: " + cofrinho.calcularTotalEmReais());
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    private static void adicionarMoedaMenu(Cofrinho cofrinho, Scanner scanner) {
        System.out.println("Escolha a moeda:");
        System.out.println("1 - Real");
        System.out.println("2 - Dólar");
        System.out.println("3 - Euro");

        int tipoMoeda = scanner.nextInt();
        System.out.print("Digite o valor: ");
        double valor = scanner.nextDouble();

        switch (tipoMoeda) {
            case 1:
                cofrinho.adicionarMoeda(new Real(valor));
                break;
            case 2:
                cofrinho.adicionarMoeda(new Dolar(valor));
                break;
            case 3:
                cofrinho.adicionarMoeda(new Euro(valor));
                break;
            default:
                System.out.println("Tipo de moeda inválido.");
        }
    }

    private static void removerMoedaMenu(Cofrinho cofrinho, Scanner scanner) {
    }
}
