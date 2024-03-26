import java.util.Scanner;

public class Ejer17 {

    public static void executar() {
       
        Programa.imprimirTitulo("EXERCICIO 17");


        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário:");
        String nomeFuncionario = scanner.nextLine();

        System.out.println("Digite o salário do funcionário:");
        double salarioFuncionario = scanner.nextDouble();

        System.out.println("Digite o valor do salário mínimo:");
        double salarioMinimo = scanner.nextDouble();

        double novoSalario = calcularNovoSalario(salarioFuncionario, salarioMinimo);

        System.out.println("Nome do funcionário: " + nomeFuncionario);
        System.out.println("Reajuste: " + calcularReajuste(salarioFuncionario, salarioMinimo) + "%");
        System.out.println("Novo salário: R$" + novoSalario);

        double aumentoFolhaPagamento = novoSalario - salarioFuncionario;

        System.out.println("Aumento na folha de pagamento da empresa: R$" + aumentoFolhaPagamento);

        scanner.close();
    }

    public static double calcularReajuste(double salario, double salarioMinimo) {
        if (salario < 3 * salarioMinimo) {
            return 50;
        } else if (salario >= 3 * salarioMinimo && salario <= 10 * salarioMinimo) {
            return 20;
        } else if (salario > 10 * salarioMinimo && salario <= 20 * salarioMinimo) {
            return 15;
        } else {
            return 10;
        }
    }

    public static double calcularNovoSalario(double salario, double salarioMinimo) {
        double reajuste = calcularReajuste(salario, salarioMinimo) / 100.0;
        return salario * (1 + reajuste);
    }
}