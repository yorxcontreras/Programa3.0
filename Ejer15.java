import java.util.Scanner;

public class Ejer15 {

    public static void executar() {
       
        Programa.imprimirTitulo("EXERCICIO 15"); 

        Scanner scanner = new Scanner(System.in);

        double totalDesconto = 0;
        double totalPago = 0;

        while (true) {
            System.out.println("Digite o valor do veículo (0 para encerrar):");
            double valorVeiculo = scanner.nextDouble();
            
            if (valorVeiculo == 0) {
                break;
            }

            System.out.println("Digite o tipo de combustível (A para álcool, G para gasolina, D para diesel):");
            char tipoCombustivel = scanner.next().toUpperCase().charAt(0);

            double desconto;

            switch (tipoCombustivel) {
                case 'A':
                    desconto = valorVeiculo * 0.25;
                    break;
                case 'G':
                    desconto = valorVeiculo * 0.21;
                    break;
                case 'D':
                    desconto = valorVeiculo * 0.14;
                    break;
                default:
                    System.out.println("Tipo de combustível inválido! Digite A, G ou D.");
                    continue; 
            }

            double valorPago = valorVeiculo - desconto;

            totalDesconto += desconto;
            totalPago += valorPago;

            System.out.println("Desconto: R$" + desconto);
            System.out.println("Valor a ser pago pelo cliente: R$" + valorPago);
        }

        System.out.println("Total de desconto dado: R$" + totalDesconto);
        System.out.println("Total pago pelos clientes: R$" + totalPago);

        scanner.close();
    }
}