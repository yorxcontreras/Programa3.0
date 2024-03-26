import java.util.Scanner;

public class Ejer5 {

    public static void executar() {
       
        Programa.imprimirTitulo("EXERCICIO 05");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra:");
        double valorCompra = scanner.nextDouble();

        double valorPrestacao = valorCompra / 5;

        System.out.println("Valor de cada prestação (em 5 vezes sem juros): R$" + valorPrestacao);

        scanner.close();
    }
}