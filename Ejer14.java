import java.util.Scanner;

public class Ejer14 {

    public static void executar() {
       
        Programa.imprimirTitulo("EXERCICIO 14"); 

        Scanner scanner = new Scanner(System.in);

        double somaPrecoCusto = 0;
        double somaPrecoVenda = 0;
        int totalProdutos = 40;

        for (int i = 1; i <= totalProdutos; i++) {
            System.out.println("Digite o preço de custo do produto " + i + ":");
            double precoCusto = scanner.nextDouble();
            somaPrecoCusto += precoCusto;

            System.out.println("Digite o preço de venda do produto " + i + ":");
            double precoVenda = scanner.nextDouble();
            somaPrecoVenda += precoVenda;

            if (precoVenda > precoCusto) {
                System.out.println("Produto " + i + ": Lucro");
            } else if (precoVenda < precoCusto) {
                System.out.println("Produto " + i + ": Prejuízo");
            } else {
                System.out.println("Produto " + i + ": Empate");
            }
        }

        double mediaPrecoCusto = somaPrecoCusto / totalProdutos;
        double mediaPrecoVenda = somaPrecoVenda / totalProdutos;

        System.out.println("\nMédia de preço de custo: " + mediaPrecoCusto);
        System.out.println("Média de preço de venda: " + mediaPrecoVenda);

        scanner.close();
    }
}