import java.util.Scanner;

public class Ejer4 { 

    public static void executar() {
       
        Programa.imprimirTitulo("EXERCICIO 04");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a cotacao do dolar (em reais):");
        double cotacaoDolar = scanner.nextDouble();

        System.out.println("Digite a quantidade de dolares disponiveis:");
        double quantidadeDolares = scanner.nextDouble();

        double valorEmReais = quantidadeDolares * cotacaoDolar;

        System.out.println("Valor em reais: R$" + valorEmReais);

        scanner.close();
    }
}