import java.util.Scanner;

public class Ejer25 {

    public static void executar() {
       
        Programa.imprimirTitulo("EXERCICIO 25"); 

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do estudante:");
        String nomeEstudante = scanner.nextLine();

        System.out.println("Digite o número de matrícula do estudante:");
        int matricula = scanner.nextInt();

        System.out.println("Digite a nota do trabalho de laboratório (0 a 10):");
        double notaLaboratorio = scanner.nextDouble();

        System.out.println("Digite a nota da avaliação semestral (0 a 10):");
        double notaSemestral = scanner.nextDouble();

        System.out.println("Digite a nota do exame final (0 a 10):");
        double notaExameFinal = scanner.nextDouble();

        double notaFinal = calcularNotaFinal(notaLaboratorio, notaSemestral, notaExameFinal);

        String classificacao = determinarClassificacao(notaFinal);

        System.out.println("Nome do estudante: " + nomeEstudante);
        System.out.println("Número de matrícula: " + matricula);
        System.out.println("Nota final: " + notaFinal);
        System.out.println("Classificação: " + classificacao);

        scanner.close();
    }

    public static double calcularNotaFinal(double notaLaboratorio, double notaSemestral, double notaExameFinal) {
       
        double pesoLaboratorio = 2;
        double pesoSemestral = 3;
        double pesoExameFinal = 5;

        double notaFinal = (notaLaboratorio * pesoLaboratorio + notaSemestral * pesoSemestral + notaExameFinal * pesoExameFinal) / (pesoLaboratorio + pesoSemestral + pesoExameFinal);

        return notaFinal;
    }

    public static String determinarClassificacao(double notaFinal) {
        if (notaFinal >= 8 && notaFinal <= 10) {
            return "A";
        } else if (notaFinal >= 7 && notaFinal < 8) {
            return "B";
        } else if (notaFinal >= 6 && notaFinal < 7) {
            return "C";
        } else if (notaFinal >= 5 && notaFinal < 6) {
            return "D";
        } else {
            return "R";
        }
    }
}