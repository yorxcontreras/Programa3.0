import java.util.Scanner;

public class Ejer16 {

    public static void executar() {
       
        Programa.imprimirTitulo("EXERCICIO 16"); 

        Scanner scanner = new Scanner(System.in);

        double salarioMinimo = 1100.00; 

        for (int i = 1; i <= 584; i++) {
            System.out.println("Digite o salário do funcionário " + i + " em reais:");
            double salario = scanner.nextDouble();

            double novoSalario;
            if (salario < 3 * salarioMinimo) {
                novoSalario = salario * 1.5; 
            } else if (salario >= 3 * salarioMinimo && salario <= 10 * salarioMinimo) {
                novoSalario = salario * 1.2; 
            } else if (salario > 10 * salarioMinimo && salario <= 20 * salarioMinimo) {
                novoSalario = salario * 1.15; 
            } else {
                novoSalario = salario * 1.1;
            }

            System.out.println("Novo salário do funcionário " + i + ": R$" + novoSalario);
        }

        scanner.close();
    }
}