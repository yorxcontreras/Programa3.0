import java.util.Scanner;

public class Ejer6 {

    public static void executar() {
       
        Programa.imprimirTitulo("EXERCICIO 06");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço de custo do produto:");
        double precoCusto = scanner.nextDouble();

        System.out.println("Digite o percentual de acréscimo (%):");
        double percentualAcrescimo = scanner.nextDouble();

        double valorVenda = precoCusto * (1 + percentualAcrescimo / 100);

        System.out.println("Valor de venda: R$" + valorVenda);

        scanner.close();
    }
}
