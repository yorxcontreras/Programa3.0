import java.util.Scanner;

public class Ejer20 {

    public static void executar() {
       
        Programa.imprimirTitulo("EXERCICIO 20"); 

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nível do professor (1, 2 ou 3):");
        int nivel = scanner.nextInt();

        System.out.println("Digite a quantidade de horas/aula trabalhadas:");
        int horasAula = scanner.nextInt();

        double valorHoraAula;
        switch (nivel) {
            case 1:
                valorHoraAula = 12.00;
                break;
            case 2:
                valorHoraAula = 17.00;
                break;
            case 3:
                valorHoraAula = 25.00;
                break;
            default:
                System.out.println("Nível inválido!");
                return;
        }

        double salario = valorHoraAula * horasAula;

        System.out.println("O salário do professor é: R$" + salario);

        scanner.close();
    }
}
