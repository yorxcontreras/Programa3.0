import java.util.Scanner;

public class Ejer7 {

    public static void executar() { 
       
        Programa.imprimirTitulo("EXERCICIO 07");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o custo de fábrica do carro:");
        double custoFabrica = scanner.nextDouble();

        double impostos = 0.45 * custoFabrica;
        double custoDistribuidor = custoFabrica + impostos;

        double percentagemDistribuidor = 0.28 * custoDistribuidor;

        double custoConsumidor = custoDistribuidor + percentagemDistribuidor;

        System.out.println("O custo ao consumidor do carro é: R$" + custoConsumidor);

        scanner.close();
    }
}