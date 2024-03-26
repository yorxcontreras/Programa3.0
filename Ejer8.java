import java.util.Scanner;

public class Ejer8 {

    public static void executar() {
       
        Programa.imprimirTitulo("EXERCICIO 08");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String nomeAluno = scanner.nextLine();

        System.out.println("Digite a nota da primeira prova:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota da segunda prova:");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a nota da terceira prova:");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Nome do aluno: " + nomeAluno);
        System.out.println("Média: " + media);

        if (media >= 7.0) {
            System.out.println("Menção: Aprovado");
        } else if (media >= 5.1 && media <= 6.9) {
            System.out.println("Menção: Recuperação");
        } else {
            System.out.println("Menção: Reprovado");
        }

        scanner.close();
    }
}
