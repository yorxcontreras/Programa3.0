import java.util.Scanner;

public class Ejer18 {

    public static void executar() {
       
        Programa.imprimirTitulo("EXERCICIO 18"); 

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário:");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade do funcionário:");
        int idade = scanner.nextInt();

        System.out.println("Digite o sexo do funcionário (M para masculino, F para feminino):");
        char sexo = scanner.next().toUpperCase().charAt(0);

        System.out.println("Digite o salário fixo do funcionário:");
        double salarioFixo = scanner.nextDouble();

        double abono;
        if (sexo == 'M') {
            if (idade >= 30) {
                abono = 100.00;
            } else {
                abono = 50.00;
            }
        } else { 
            if (idade >= 30) {
                abono = 200.00;
            } else {
                abono = 80.00;
            }
        }

        double salarioLiquido = salarioFixo + abono;

        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Salário líquido acrescido do abono: R$" + salarioLiquido);

        scanner.close();
    }
}