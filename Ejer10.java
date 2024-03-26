import java.util.Scanner;

public class Ejer10 {

    public static void executar() {
       
        Programa.imprimirTitulo("EXERCICIO 10"); 

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de pessoas:");
        int numeroPessoas = scanner.nextInt();

        for (int i = 1; i <= numeroPessoas; i++) {
            System.out.println("Digite a idade da pessoa " + i + ":");
            int idade = scanner.nextInt();

            if (idade >= 18) {
                System.out.println("Pessoa " + i + " é maior de idade.");
            } else {
                System.out.println("Pessoa " + i + " é menor de idade.");
            }
        }

        scanner.close(); 
    }
}