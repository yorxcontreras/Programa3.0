import java.util.Scanner;

public class Ejer12 {

    public static void executar() {
       
        Programa.imprimirTitulo("EXERCICIO 12");

        Scanner scanner = new Scanner(System.in);

        int totalCarrosAte2000 = 0;
        int totalGeral = 0;

        while (true) {
            System.out.println("Digite o ano do carro:");
            int ano = scanner.nextInt();

            double desconto;
            if (ano <= 2000) {
                desconto = 0.12;
                totalCarrosAte2000++;
            } else {
                desconto = 0.07;
            }

            System.out.println("Digite o valor do carro:");
            double valorCarro = scanner.nextDouble();
            double valorDesconto = valorCarro * desconto;

            double valorFinal = valorCarro - valorDesconto;

            System.out.println("Desconto: R$" + valorDesconto);
            System.out.println("Valor a ser pago pelo cliente: R$" + valorFinal);

            totalGeral++;

            System.out.println("Deseja calcular desconto para outro carro? (S/N)");
            char continuar = scanner.next().toUpperCase().charAt(0);
            if (continuar != 'S') {
                break;
            }
        }

        System.out.println("Total de carros até o ano 2000: " + totalCarrosAte2000);
        System.out.println("Total geral de carros: " + totalGeral);

        scanner.close();
    }
}
