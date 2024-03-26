import java.util.Scanner;

public class  Ejer3 {
 
    public static void executar() {
       
        Programa.imprimirTitulo("EXERCICIO 03");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor:");
        String nomeVendedor = scanner.nextLine();

        System.out.println("Digite o salário fixo do vendedor:");
        double salarioFixo = scanner.nextDouble();

        System.out.println("Digite o total de vendas efetuadas pelo vendedor no mes:");
        double totalVendas = scanner.nextDouble();

        double comissao = 0.15 * totalVendas;

        double salarioFinal = salarioFixo + comissao;

        System.out.println("Nome do vendedor: " + nomeVendedor);
        System.out.println("Salario fixo: $" + salarioFixo);
        System.out.println("Salario no final do mes: $" + salarioFinal);

        scanner.close();
    }
}